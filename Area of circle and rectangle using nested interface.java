import java.util.Scanner;

interface Circle {
    float pi = 3.14;

    public void AoR();

    interface Rectangle {

        public void AoC();

    }
}

class User implements Circle.Rectangle, Circle {
    Scanner R = new Scanner(System.in);

    void AoR() {
        System.out.println("Entre a radius");
        r = R.nextInt();

    }

    void Aoc() {
        System.out.println("Entre a length and breadth");
        l = R.nextInt();
        b = R.nextInt();
    }

    void display() {
        System.out.println("Area of circle =" + (Pi * r * r));
        System.out.println("Area of rectangle=" + (l * b));

    }

    public static void main(String args[]) {
        Circle.Rectangle V = new User();
        V.AoR();
        V.AoC();
        V.display();
    }
}