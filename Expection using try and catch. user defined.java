
class User extends Exception {
    User() {
        super();
        System.out.println("Neg Age");
    }
}

class Demo {
    public void check() {
        try {
            int age = -8;
            if (age < 0) {
                throw new User();
            } else {
                System.out.println("POS AGE");
            }
        } catch (Exception e) {

        }
    }

    public static void main(String args[]) {
        Demo V = new Demo();
        V.check();
    }
}
