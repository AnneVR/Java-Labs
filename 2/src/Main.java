import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        boolean exit = true;
        Records notepad = new Records();

        while (exit)
        {
            System.out.println("Welcome to the notebook!! ");
            System.out.println("Select what you want to do and enter the action number: ");
            System.out.println("1 - Add record ");
            System.out.println("2 - Delete record ");
            System.out.println("3 - Edit record ");
            System.out.println("4 - Show all records ");
            System.out.println("5 - Exit ");
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            switch (a) {
                case 1:
                        System.out.print("Enter the record: ");
                        Scanner in1 = new Scanner(System.in);
                        String str = in1.nextLine();
                        notepad.addRecord(str);
                        break;
                case 2:
                        System.out.print("The number of the record you want to delete:");
                        Scanner in2 = new Scanner(System.in);
                        int delpos = in2.nextInt();
                        notepad.deleteRecord(delpos);

                break;
                case 3:
                        System.out.print("The number of the record you want to edit:");
                        Scanner in3 = new Scanner(System.in);
                        int edpos = in3.nextInt();
                        System.out.print("Edited record:");
                        Scanner in4 = new Scanner(System.in);
                        String record = in4.nextLine();
                        notepad.editRecord(edpos, record);
                        break;
                case 4:
                        notepad.showAllRecords();
                        break;
                case 5:
                    exit = false;
                    break;
                default:
                    System.out.print("There is no such command!");
                    break;
            }
        }
    }
}
