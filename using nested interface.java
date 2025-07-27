interface Circle {
    interface Rectangle {
        void display();

    }

}

class User implements Circle.Rectangle {

    public void display() {
        System.out.println("HELLO WORLD");
    }

    public static void main(String args[]) {
        Circle.Rectangle R = new User();
        R.display();

    }

}
