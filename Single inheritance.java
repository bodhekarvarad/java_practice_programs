import java.util.*;

class Student {
    protected String name;
    protected int Roll;
    protected int Mob;
    protected String collage;

    protected void get() {
        System.out.println("Entre a Value");
        Scanner R = new Scanner(System.in);

        name = R.nextInt();
        Roll = R.nextInt();
        Mob = R.nextInt();
        collage = R.nextLine();

    }
}

class Data extends Student {
    protected int percentage;

    protected void display() {
        System.out.println("Entre a percentage");
        Scanner V = new Scanner(System.in);
        percentage = V.nextInt();
        System.out.println("Name=" + name);
        System.out.println("Roll=" + Roll);
        System.out.println("Mob=" + Mob);
        System.out.println("Collage=" + collage);

    }

    public static void main(String args[]) {
        Student P = new Student();
        P.get();
        P.display();

    }
}
