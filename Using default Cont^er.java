import java.util.*;

class Area {
    double A;

    Area() {
        System.out.print("Entre Two Number\n");
        Scanner R = new Scanner(System.in);
        int h = R.nextInt();
        int b = R.nextInt();
        A = 0.5 * b * h;
    }

    void display() {
        System.out.println("Area= " + A);
    }

}

class User {
    public static void main(String args[]) {
        Area A = new Area();
        A.display();

    }
}