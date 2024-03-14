import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String inputFileName = "input.txt";
        String outputFileName = "output.txt";
        replaceText(inputFileName, outputFileName, "Nha Trang", "Vũng Tàu");
    }

    public static void replaceText(String inputFileName, String outputFileName, String oldText, String newText) {
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName))) {

            String line;
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(oldText, newText);
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Thay the thanh cong");

        } catch (IOException e) {
            System.err.println("Bao loi :" + e.getMessage());
        }
    }
}
