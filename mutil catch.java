class User {
    public static void main(String args[]) {
        try {
            int c = 10;
            int b = 0;
            int n = c / b;
            System.out.println(n);

            int a[] = { 0, 1, 2, 3 };
            System.out.println(a[4]);
        } catch (Hello R) {
            System.out.println(R);
        } catch (ArrayIndexOutOfBoundsException V) {
            System.out.println(V);
        } finally {
            System.out.println("Thank You");
        }
    }
}