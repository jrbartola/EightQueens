import java.util.HashSet;
import java.util.Set;

/**
 * This class is used as an implementation of an n x n
 * board for the n-queens problem.
 *
 * @author    Jesse Bartola
 */
public class QueensBoard extends Queens {

    public QueensBoard(int dim) {
        matrix = new int[dim][dim];
        this.dim = dim;
        this.queens = new HashSet<>(8);
    }

    public static void main(String[] args) {
        QueensBoard eightQueen = new QueensBoard(8);

    }

    public void findQueens() {

    }
}
