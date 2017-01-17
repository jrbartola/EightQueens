import java.util.Arrays;

/**
 * Created by Jesse on 1/6/2017.
 */
public class NaiveQueensBoard extends Queens {

    private boolean[][] visited;

    public NaiveQueensBoard(int dim) {
        matrix = new boolean[dim][dim];
        this.dim = dim;

        visited = new boolean[dim][dim];
        for (boolean[] row : matrix) {
            Arrays.fill(row, false);
        }

        for (boolean[] row : visited) {
            Arrays.fill(row, false);
        }
    }

    public NaiveQueensBoard(int dim, boolean[][] matrix) {
        super();
        this.matrix = matrix;
    }

    /**
     *  A Naive Approach: Go through every possible valid
     *  configuration of queens and return when out set reaches
     *  its maximum capacity.
     *
     *  If we made it through the row without making a valid
     *  placement, try the next possible configuration
     */
    public Queens nQueens(int col) {
//        if (queens.size() == dim)
//            return this;
//        if (row == (dim - 1) && (col == dim -1)) {
//            boolean[][] b = new boolean[dim][dim];
//            for (boolean[] r : b) {
//                Arrays.fill(r, false);
//            }
//            return (new NaiveQueensBoard(dim, b, new LinkedHashSet<>()));
//        }
//
//        if (checkQueen(row, col)) {
//            placeQueen(row, col);
//            System.out.println("board is: \n " + this);
//            return (new NaiveQueensBoard(dim, this.matrix, this.queens)).nQueens(0,0);
//        }
//
//        if ((col + 1) % dim == 0)
//            return nQueens(row + 1, (col + 1) % dim);
//        return nQueens(row, col + 1);
        return this;

    }

    public static void main(String[] args) {
        NaiveQueensBoard eightQueen = new NaiveQueensBoard(8);
        eightQueen.nQueens(0);
    }
}
