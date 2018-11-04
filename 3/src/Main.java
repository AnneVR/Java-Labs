import java.util.Scanner;
import java.util.ArrayList;

public class Main
{
    public static void printArr(ArrayList arrlist)
    {
        for (int i = 0; i < arrlist.size(); i++)
        {
            System.out.print(arrlist.get(i) + "\t" );
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
       Integer[] arrint = {2, 4, 6, 8};
       Character[] arrchar = {'a', 'b','c', 'd'};
       Double[] arrdou ={1.2, 1.3, 1.4};
       Boolean[] arrboo = {true, false, true};

       ArrayList convertedint = new ArrayList();
       convertedint = Convert.convertArrList(arrint);

       ArrayList convertedchar = new ArrayList();
       convertedchar = Convert.convertArrList(arrchar);

       ArrayList converteddou = new ArrayList();
       converteddou = Convert.convertArrList(arrdou);

       ArrayList convertedboo = new ArrayList();
       convertedboo = Convert.convertArrList(arrboo);

       printArr(convertedint);
       printArr(convertedchar);
       printArr(converteddou);
       printArr(convertedboo);

    }
}