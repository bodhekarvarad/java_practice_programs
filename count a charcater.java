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
        int count = 0;
        int i;
        while ((i = in.read()) != -1) {
            count++;
        }
        System.out.println(count);
        in.close();
    }

}
