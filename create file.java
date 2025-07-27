import java.io.File;
import java.io.IOException;

class User {
    public static void main(String[] args) throws IOException {
        File F = new File("DEMO.txt");
        if (!F.exists()) {
            // System.out.println("Already File");
            // } else {
            F.createNewFile();
        }

    }
}