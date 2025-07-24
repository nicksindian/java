import java.io.*;

public class slip1b {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("a.txt");
             FileWriter fw = new FileWriter("b.txt")) {

            int c;
            while ((c = fr.read()) != -1) {
                char ch = (char) c;
                if (!Character.isDigit(ch)) {
                    fw.write(c);
                }
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
