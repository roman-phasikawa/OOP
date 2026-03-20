import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        String filename = "example.txt";
        try {
            FileWriter writer = new FileWriter(filename);
            writer.write("Hello, this is sample text.\n");
            writer.write("This text is written to file.\n");
            writer.close();
            System.out.println("File written successfully.");

            System.out.println("\nReading from file:");
            FileReader reader = new FileReader(filename);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}