class Default {
    void call() {
        System.out.println("I am in call method");
    }

    void display() {
        System.out.println("I am  in display method");
        this.call();
        // we can call using call() too.
    }

}

class User {
    public static void main(String args[]) {
        Default R = new Default();
        R.display();
    }
}