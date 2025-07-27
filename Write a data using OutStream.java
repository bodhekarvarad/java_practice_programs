import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

class User {
    public static void main(String args[]) throws IOException {
        File F = new File("DEMO.txt");
        FileOutputStream out = new FileOutputStream(F);
        String Str = "Hello !!!";
        if (!F.exists()) {
            F.createNewFile();
        } else {
            out.write(Str.getBytes());
            out.flush();
            out.close();
        }
    }
}