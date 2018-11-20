import java.util.ArrayList;
import java.io.*;

public class ByteStream
{
    String file_ ;
    public ArrayList<Container> words = new ArrayList<Container>();

    ByteStream(String file)
    {
        file_ = file;
    }

    public void analyzeByte()
    {
        try (FileInputStream inStream = new FileInputStream(file_);
             FileOutputStream outStream = new FileOutputStream("ByteOutput.txt"))
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

            outStream.write("Keywords - ".getBytes());
            outStream.write(Integer.toString(count).getBytes());
            outStream.write("\n".getBytes());
            for (Container s: words)
            {
                if (s.total !=1)
                {
                    outStream.write("'".getBytes());
                    outStream.write(s.value.getBytes());
                    outStream.write("' - ".getBytes());
                    outStream.write(Integer.toString(s.total).getBytes());
                    outStream.write('\n');
                }
                else
                {
                    outStream.write("'".getBytes());
                    outStream.write(s.value.getBytes());
                    outStream.write("' - ".getBytes());
                    outStream.write(Integer.toString(s.total).getBytes());
                    outStream.write('\n');
                }

            }
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

