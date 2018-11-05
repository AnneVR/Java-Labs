import java.util.Iterator;

public class Main
{
    public static void main(String[] args)
    {

        MyList<Character> list = new MyList<>();
        list.add('y');
        list.add('p');
        list.add('p');
        list.add('u');
        list.add('p');

        Iterator<Character> iter = list.iterator();
        while (iter.hasNext())
        {
            System.out.println(iter.next());
        }
        System.out.println('\n');

        MyList.StaticIt<Character> stIter = new MyList.StaticIt<>(list);
        while (stIter.hasNext())
        {
            System.out.println(stIter.next());
        }
        System.out.println('\n');

        MyList<Character>.InnerIt inIter = list.new InnerIt();
        while (inIter.hasNext())
        {
            System.out.println(inIter.next());
        }
        System.out.println('\n');

    }
}