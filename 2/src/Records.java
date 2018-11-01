import java.util.Scanner;

public class Records extends Notepad
{

    public void editRecord(int pos, String newRec)
    {

        if (arrayOfRecords.length == 0 || pos > arrayOfRecords.length )
        {
            throw new NullPointerException("Error!");
        }
        else
        {

            this.arrayOfRecords[pos] = newRec;
        }
    }
}
