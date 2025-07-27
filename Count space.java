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
        }
        int i;
        int count;
        while ((i = in.read()) != -1) {
            if (" ") {
                count++;
            }

            System.out.println(count);
        }
        in.close();
        out.close();
    }

}