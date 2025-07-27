class User {
    public static void main(String args[]) {
        int n1 = 10;
        int n2 = 30;
        char option = 'd';
        switch (option) {
            case 'A':
            case 'a':
                System.out.println("Addition=" + (n1 + n2));
                break;
            case 'B':
            case 'b':
                System.out.println("Sub=" + (n2 - n1));
                break;
            case 'C':
            case 'c':
                System.out.println("Mul=" + (n2 * n1));
                break;
            case 'D':
            case 'd':
                System.out.println("Div=" + (n2 / n1));
                break;

            default:
                System.out.println("Wrong");

        }
    }
}
