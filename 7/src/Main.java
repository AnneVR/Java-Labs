public class Main
{
    public static void main(String[] args)
    {
        try
        {
            ByteStream bStr = new ByteStream("C:/Users/moist/7/src/Input.txt");
            bStr.analyzeByte();

            SymbolStream sStr = new SymbolStream("C:/Users/moist/7/src/Input.txt");
            sStr.analyzeSymbol();

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}