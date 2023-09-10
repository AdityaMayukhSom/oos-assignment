import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utility {
    private String delim;
    private ArrayList<Double> inputNumbers;
    private Boolean isReading;
    private boolean keepAdding;
    private Double sum;
    private String inputFileName;

    public Utility(String inputFileName, String delim) {
        this.sum = 0.0;
        this.delim = delim;
        this.isReading = true;
        this.keepAdding = true;
        this.inputFileName = inputFileName;
        this.inputNumbers = new ArrayList<Double>();
    }

    void read() throws InterruptedException {
        try (FileReader fr = new FileReader(this.inputFileName);
                BufferedReader br = new BufferedReader(fr)) {
            String line;
            synchronized (this) {
                while ((line = br.readLine()) != null) {
                    String[] numbers = line.split(delim);

                    if (!isReading) {
                        wait();
                    }
                    this.inputNumbers.clear();
                    for (String number : numbers) {
                        number = number.trim();
                        if (number.matches("[+-]?([0-9]*[.])?[0-9]+")) {
                            inputNumbers.add(Double.parseDouble(number));
                        }
                    }
                    this.isReading = !this.isReading;
                    notify();
                }
                this.keepAdding = false;
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    synchronized void add() throws InterruptedException {
        while (this.keepAdding) {
            if (isReading) {
                wait();
            }

            for (double inputNumber : inputNumbers) {
                this.sum += inputNumber;
            }
            isReading = !isReading;
            notify();
        }
    }

    public void printSum() {
        System.out.println("Sum :: " + sum);
    }
}
