import java.util.Arrays;

public class Block {

    private int previousHash;
    private String[] transactions; //usually would be it's own object

    // each block has it's own hash.
    // this hash is based on the transactions we define by the array
    private int blockHash;

    public Block(int previousHash, String[] transactions) {
        this.previousHash = previousHash;
        this.transactions = transactions;

        Object[] contents = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contents);
    }


    public int getPreviousHash() {
        return previousHash;
    }

    public String[] gettransactions() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }

    public void setBlockHash(int blockHash) {
        this.blockHash = blockHash;
    }
}
