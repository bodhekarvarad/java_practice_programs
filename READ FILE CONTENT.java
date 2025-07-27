import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

class User {
    public static void main(String args[]) throws IOException {
        File F = new File("DEMO.txt");
        FileInputStream in = new FileInputStream(F);
        if (!F.exists()) {
            F.createNewFile();
        }
        int i = in.available();
        while (i > 0) {
            System.out.println((char) in.read());
            i--;
        }
        in.close();

    }
}