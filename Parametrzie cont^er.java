class information {
    int Roll;
    String Name;

    public information(int a, String b) {
        Roll = a;
        Name = b;
    }

    public void display() {
        System.out.println("Roll_No=" + Roll);
        System.out.println("Name=" + Name);

    }
}

class User {
    public static void main(String args[]) {
        information R = new information(10, "Varad");
        R.display();
        information V = new information(00, "Renuka");
        V.display();

    }
}
