class Extra {
    int a = 20;

    Extra(Example R) {
        System.out.println("I am in Extra constructor");
        System.out.println("The value of a=" + R.a);
    }

}

class Example {
    int a = 10;

    void display() {
        Extra E = new Extra(this);
    }

    public static void main(String args[]) {
        Example V = new Example();
        V.display();
    }
}