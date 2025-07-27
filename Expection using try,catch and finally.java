class User {
    public static void main(String args[]) {
        try {

            int a = 10;
            int b = 0;
            int n = a / b;
            System.out.println(n);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        } finally {
            System.out.println("TU");
        }
    }
}