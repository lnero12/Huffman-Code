import java.io.PrintStream;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class HuffmanCode {
    private HuffmanNode overallRoot;
    private int frequency;

    public HuffmanCode(int[] count) {
        Queue<HuffmanNode> frequencyCounter = new PriorityQueue<HuffmanNode>();
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 0) {
                HuffmanNode freqRate = new HuffmanNode(count[i], i);
                frequencyCounter.add(freqRate);
            }
        }
    }

    public HuffmanCode(Scanner file) {
        while (file.hasNextLine()) {
            int letterCode = Integer.parseInt(file.nextLine());
            String code = file.nextLine();
            overallRoot = new HuffmanNode(frequency,letterCode);
        }
    }

    public void save(PrintStream output) {
    }

    public void translate(BitInputStream input, PrintStream output) {

    }
}