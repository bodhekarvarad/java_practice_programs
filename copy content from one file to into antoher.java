import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

class User {
    public static void main(String args[]) throws IOException {
        File F = new File("DEMO.txt");
        File O = new File("DEMO1.txt");
        FileInputStream in = new FileInputStream(F);
        FileOutputStream out = new FileOutputStream(O);
        if (!F.exists() && !O.exists()) {
            F.createNewFile();
            O.createNewFile();
        }
        int ch;
        while ((ch = in.read()) != -1) {
            out.write(ch);

        }
        in.close();
        out.close();

    }
}