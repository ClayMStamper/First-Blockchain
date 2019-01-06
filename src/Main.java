import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    /**
     *
     * Hash = digital signature
     *
     * each block will have:
     *      List of transactions
     *      Previous hash
     *
     *      hash
     *
     */

    ArrayList <Block> blockchain = new ArrayList<>();

    public static void main(String[] args) {

        String[] genesisTransactions = {"Clayton sent James 10 stampcoin", "Porter sent 10 memecoin to Clayton"};
        Block genesisBlock = new Block(0, genesisTransactions);

        String[] block2Transactions = {"Clayton sent James 100,000 stampcoin", "James spent 1 stampcoin on a Ferrari"};
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        System.out.println(genesisBlock.getBlockHash());
        System.out.println(block2.getBlockHash());

    }
}
