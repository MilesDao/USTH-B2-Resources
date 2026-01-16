import java.io.IOException;
import java.io.FileOutputStream;
import java.io.DataOutputStream;

public class TestDataOutputStream {
    public static void main(String args[]) {
        int a[] = { 65, 75, 86, 67, 98 };
        try {
            // file name is entered as args[0]
            FileOutputStream fout = new FileOutputStream(args[0]);
            DataOutputStream dout = new DataOutputStream(fout);
            for (int i = 0; i < a.length; i++)
                dout.writeInt(a[i]);
            dout.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
