class information {
    int roll;
    String name;

    information(int roll, string name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println("Roll= " + roll);
        System.out.println("Name= " + name);

    }

}

class User {
    public static void main(String args[]) {
        information R = new information(10, "Varad");
        R.display();
    }
}