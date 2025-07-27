class Default {
    Default() {
        System.out.println("I am in Default construtor");
    }

    Default(String name) {
        this();
        System.out.println("My name is=" + name);
    }

}

class User {
    public static void main(String args[]) {
        Default R = new Default("VARAD");
    }
}