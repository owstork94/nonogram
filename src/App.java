import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        nonogram();
    }

    private static void nonogram() {
        Scanner scan = new Scanner(System.in);

        System.out.print("row : ");
        int row = scan.nextInt();
        System.out.print("col : ");
        int col = scan.nextInt();

        int[][] test = new int[row][col];

        System.out.print("rength:" + test.length);
        System.out.print("rength:" + test[0].length);

        for (int i = 0; i < test.length; i++) {
            for (int j = 0; j < test[i].length; j++) {
                System.out.print(test[j][i] + " ");
            }
            System.out.println();
        }

        // for(int i = 0; test.length; i ++;){

        // }
    }
}
