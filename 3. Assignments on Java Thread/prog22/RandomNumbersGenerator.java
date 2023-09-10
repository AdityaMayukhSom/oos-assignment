import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class RandomNumbersGenerator {
    public static void main(String[] args) {
        try (FileWriter writer = new FileWriter("RandomNumbers.txt")) {
            Random random = new Random();
            int count = 0;
            int numbersPerLine = 5;
            int totalNumbers = 50;

            while (count < totalNumbers) {
                for (int i = 0; i < numbersPerLine; i++) {
                    writer.write(String.valueOf(random.nextInt(100)));
                    count++;
                    if (count < totalNumbers) {
                        writer.write(",");
                    }
                }
                writer.write("\n");
            }

            System.out.println("Random numbers generated and saved to RandomNumbers.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
