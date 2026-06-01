import java.io.*;

public class FileReadComparison {

    public static void main(String[] args) throws Exception {

        String filePath = "largefile.txt";

        long start = System.nanoTime();

        try (FileReader fr = new FileReader(filePath)) {
            while (fr.read() != -1) {
            }
        }

        long end = System.nanoTime();

        System.out.println("FileReader: "
                + (end - start) / 1_000_000.0 + " ms");

        start = System.nanoTime();

        try (InputStreamReader isr =
                     new InputStreamReader(
                             new FileInputStream(filePath))) {

            while (isr.read() != -1) {
            }
        }

        end = System.nanoTime();

        System.out.println("InputStreamReader: "
                + (end - start) / 1_000_000.0 + " ms");
    }
}