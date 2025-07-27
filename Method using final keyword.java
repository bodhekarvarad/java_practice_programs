class Parent {
    final void display() {
        System.out.println("I am in parent class");
    }

}

public class Example extends Parent {
    void b() {
        System.out.println("I am in Example");
    }

    public static void main(String args[]) {
        Parent R = new Parent();
        R.display();
    }
}