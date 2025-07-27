import java.util.*;

interface Circle {
    double Pi = 3.14;

    void AOC();
}

interface Rectangle {
    // int l, b;

    void AOR();
}

class User implements Circle, Rectangle {
    Scanner R = new Scanner(System.in);
    int r, b, l;

    public void AOC() {
        System.out.println("Entre a radius");
        r = R.nextInt();
        double Area = (Pi * r * r);
    }

    public void AOR() {
        System.out.println("Entre a length and breath");

        l = R.nextInt();
        b = R.nextInt();
        double Rec = l * b;
    }

    void display() {
        System.out.println("Area of Circle=" + Area);
        System.out.println("Area of Rectangle=" + Rec);
    }

    public static void main(String args[]) {
        User V = new User();
        V.AOC();
        V.AOR();
        V.display();
    }
}