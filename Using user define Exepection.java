class User {
    void display() {
        int age = 10;
        if (age > 18) {
            System.out.println("VALID VOTE");

        } else

        {
            throw new ArithmeticException("INVALID VOTE");
        }
    }

    public static void main(String args[]) {
        User R = new User();
        R.display();

    }
}