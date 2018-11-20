import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileReader;
import java.io.FileWriter;

public class SymbolStream
{
    private String file = "";
    public ArrayList<Container> words = new ArrayList<Container>();

    public SymbolStream(String file_)
    {
        file = file_;
    }

    public void analyzeSymbol()
    {
        try (FileReader inStream = new FileReader(file);
             FileWriter outStream = new FileWriter("SymbolOutput.txt"))
        {
            String buf = "";
            int k = 0;

            while ((k = inStream.read()) != -1)
            {
                buf += (char)k;
            }

            String[] textTokens = buf.split("\\s");
            int count = 0;
            for (String word : textTokens)
            {
                if (JavaKeywords.isKeyword(word))
                {
                    count++;
                    if (words.isEmpty())
                    {
                        Container tmp = new Container(1, word);
                        words.add(tmp);
                    } else
                        {
                        boolean flag = false;

                        for (Container s: words)
                        {
                            if (s.value.equals(word))
                            {
                                s.total ++;
                                flag = true;
                                break;
                            }
                        }
                        if (!flag)
                        {
                            Container tmp = new Container(1, word);
                            words.add(tmp);
                        }
                    }
                }
            }
            outStream.write("Keywords - ");
            outStream.write(Integer.toString(count));
            outStream.write("\n");

            for (Container s: words)
            {
                if (s.total == 1) {
                    outStream.write("'");
                    outStream.write(s.value);
                    outStream.write("' - ");
                    outStream.write(Integer.toString(s.total));
                    outStream.write("\n");
                } else {
                    outStream.write("'");
                    outStream.write(s.value);
                    outStream.write("' - ");
                    outStream.write(Integer.toString(s.total));
                    outStream.write("\n");
                }
            }
        }
        catch (FileNotFoundException error)
        {
            error.printStackTrace();
        }

        catch (IOException error)
        {
            error.printStackTrace();
        }
    }

}