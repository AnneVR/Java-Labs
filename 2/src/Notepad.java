
public class Notepad
{
    String[] arrayOfRecords = new String[50];
    int lastrec = 0;

    public void addRecord(String str)
    {
        if (arrayOfRecords.length < lastrec)
        {
           throw new NullPointerException("Error!") ;
        }
        int k = this.lastrec++;
        this.arrayOfRecords[k] = str;

    }

    public void showAllRecords()
    {
      if (arrayOfRecords.length != 0)
      {
          for (int i = 0; i < this.lastrec; i++)
          {
              System.out.println(arrayOfRecords[i]);
          }
      }
      else
      {
          try
          {
              throw new NullPointerException("Error");
          }
          catch(NullPointerException e)
          {
              System.out.println("No records!");
          }
      }
    }

    public  void deleteRecord(int pos)
    {
        if (arrayOfRecords.length == 0 ||  pos > arrayOfRecords.length )
        {
            throw new NullPointerException("Wrong position!");
        }
        else
        {
            System.arraycopy( this.arrayOfRecords, pos + 1, this.arrayOfRecords, pos, this.lastrec - pos);
            this.lastrec--;
        }
    }
}
