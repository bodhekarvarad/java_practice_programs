import java.util.*;

class User {
    // int n;

    public static void main(String args[]) {
        try {
            System.out.println("Enter a Size");
            Scanner R = new Scanner(System.in);
            int n = R.nextInt();
            Vector V = new Vector();
            System.out.println("Enter a Element");
            for (int i = 0; i < =n; i++) {
                int a = R.nextInt();
                V.addElement(V);

            }
            System.out.println("Delete a Element");
            int del = R.nextInt();
            V.removeElementAt(del);
            System.out.println("Size will be");
            for (int i = 0; i < n; i++) {
                System.out.println(i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}