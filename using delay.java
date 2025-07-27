class First_thread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (Exception r) {

            }
        }
    }

    public static void main(String[] args) {
        First_thread R = new First_thread();
        R.start();

    }
   }
