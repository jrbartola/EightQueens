import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * This class is used as an implementation of an n x n
 * board for the n-queens problem.
 *
 * @author    Jesse Bartola
 */
public class QueensBoard extends Queens {

    private int count;

    public QueensBoard(int dim) {
        count = 0;
        matrix = new boolean[dim][dim];
        this.dim = dim;
        this.queens = new LinkedHashSet<>(8);
    }

    public Queens nQueens(int col) {
        if (count == dim)  {
            return this;
        }

        for (int r = 0; r < dim; r++) {
            if (checkQueen(r, col)) {
                placeQueen(r, col);
                count++;

                Queens fin = nQueens(col+1);

                if (fin != null) {
                    return fin;
                }

                count--;
                removeQueen(r, col);
            }
        }

        return null;
    }

    public static void main(String[] args) {
        QueensBoard eightQueen = new QueensBoard(13);
        System.out.println(eightQueen.nQueens(0));
    }

}
