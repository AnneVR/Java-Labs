import java.util.ArrayList;

public class Convert {

    public static <T> ArrayList<T> convertArrList(T[] arr)
    {
        ArrayList<T> arrlist = new ArrayList<>();
        for (int i = 0; i < arr.length; i++)
        {
            arrlist.add(arr[i]);
        }
        return arrlist;
    }
}
