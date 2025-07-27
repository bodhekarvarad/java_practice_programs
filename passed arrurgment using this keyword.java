class Example {
    int a = 10;

    void A(Example R) {
        System.out.println("I AM in A");
        System.out.println("THE VALUE OF A" + R.a);
    }

    void B() {
        System.out.println("Iam in B");
        A(this);
    }

}

class User {

    public static void main(String args[]) {
        Example V = new Example();
        V.B();
    }
}