import java.util.Scanner;

class User {
    public static void main(String args[]) {
        Scanner R = new Scanner(System.in);
        int a[][] = new int[3][];
        a[0] = new int[2];
        a[1] = new int[3];
        a[2] = new int[1];
        System.out.println("Entre a array");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = R.nextInt();
            }
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println();
        }

    }
}
