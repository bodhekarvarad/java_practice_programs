
class Example {
    void show() {
        System.out.println("I am in Shows");
    }

    public static void main(String args[]) {
        Example R = new Example();
        R.show();
        // R.finalize();

    }

    protected void finalize() {
        System.out.println("I am in Finlize");
    }

}
