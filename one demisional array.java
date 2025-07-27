import java.util.Scanner;

class User {
    public static void main(String args[]) {
        Scanner R = new Scanner(System.in);
        int a[] = new int[5];
        System.out.println("Enter a number");
        for (int i = 0; i < a.length; i++) {
            a[i] = R.nextInt();

        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
    }
}