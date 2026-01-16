import java.io.*;

public class democlass {
    public static void main(String[] args) {
        test2();
    }

    public static void test1() {
        try {
            File obj = new File("satish4.txt");
            FileOutputStream fout = new FileOutputStream(obj);
            DataOutputStream dout = new DataOutputStream(fout);
            dout.writeInt(2);
            dout.close();
            // reading
            FileInputStream fin = new FileInputStream(obj);
            DataInputStream din = new DataInputStream(fin);
            int data = din.readInt();
            System.out.println(data);
            fin.close();
            din.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test2() {
        int a[] = { 12, 123, 123, 213, 123 };
        File fai = new File("freefile.txt");
        try {
            FileOutputStream fout = new FileOutputStream(fai);
            DataOutputStream dout = new DataOutputStream(fout);

            for (int i = 0; i < a.length; i++) {
                dout.writeInt(a[i]);

            }

            dout.close();

            // read
            FileInputStream fin = new FileInputStream(fai);
            DataInputStream din = new DataInputStream(fin);
            while (true) {
                System.out.println(din.readInt());
            }

        } catch (IOFException e) {
            
        }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }}
