import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class FileIOTester {
    public static void main(String[] args) {
        WriterTester();
        ReaderTester();

    }

    private static void WriterTester() {
        try {
            FileWriter fw = new FileWriter("ouput.txt");
            fw.write("Hello hehe hehe");
            fw.write("Mic check mic check");
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void ReaderTester() {
        try {
            FileReader fr = new FileReader("output.txt");
            int lines;

            System.out.println(lines = fr.read());
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Writer() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));
            writer.write("Hello world");
            writer.write("\nskibidi");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void Reader() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String lines;
            while ((lines = reader.readLine()) != null) {
                System.out.println(lines);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}