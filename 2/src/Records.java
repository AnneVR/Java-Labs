import java.util.Scanner;

public class Records extends Notepad
{

    public void editRecord(int pos, String newRec)
    {

        if (lastrec == 0 || pos > lastrec )
        {
            try
            {
                throw new NullPointerException("Error");
            }
            catch(NullPointerException e)
            {
                System.out.println("Error in editing!");
            }
        }
        else
        {

            this.arrayOfRecords[pos] = newRec;
        }
    }
}
