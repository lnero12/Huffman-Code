public class HuffmanNode implements Comparable<HuffmanNode> {
    public int frequency;
    public int letter;
    public HuffmanNode left;
    public HuffmanNode right;


    public HuffmanNode(int frequency, int letter) {
        this(frequency, letter, null, null);
    }


    public HuffmanNode(int frequency, int letter, HuffmanNode left, HuffmanNode right) {
        this.frequency = frequency;
        this.letter = letter;
        this.left = left;
        this.right = right;
    }


    public int compareTo(HuffmanNode other) {
        return this.frequency - other.frequency;
    }
}

