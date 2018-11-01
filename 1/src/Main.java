import java.util.Scanner;
public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Matrix size: ");
        int n = in.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j)||(i+j==n-1)) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }

        for (int a = 0; a < n; a++) {
                for (int b = 0; b < n; b++) {
                    System.out.print(array[a][b] + "\t");
                }
                System.out.println();
        }
    }
}
