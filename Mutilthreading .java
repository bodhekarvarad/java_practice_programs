class First_thread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("First_thread:" + i);
        }
        System.out.println("First_thread exit");
    }
}

class Second_thread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Second_thread :" + i);
        }
        System.out.println("Second_thread exit");
    }
}

class User {
    public static void main(String args[]) {
        First_thread R = new First_thread();
        Second_thread V = new Second_thread();
        R.start();
        V.start();
    }
}