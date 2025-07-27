class Extra {
    Extra display() {
        System.out.println("I am in Extra");
        return this;
    }
}

class Example {
    Example() {
        Extra E = new Extra();
        E.display();
    }

    public static void main(String args[]) {
        Example obj = new Example();
    }
}