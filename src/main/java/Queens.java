import java.util.Set;

/**
 * This class is used as an implementation of an n x n
 * board for the n-queens problem.
 *
 * @author    Jesse Bartola
 */
public class Queens {

    private char[][] matrix;
    private final int dim;
    private Set<Coordinate> queens;

    public Queens(int dim) {
        matrix = new char[dim][dim];
        this.dim = dim;
    }


    /**
     * This method checks to see if the current queen
     * placement satisfies the constraints of the other
     * queens on the board.
     *
     * @return  true if placement if valid, false otherwise
     */
    public boolean checkQueen(int row, int col) {
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder((dim + 2) * dim);

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {
                if (queens.contains(new Coordinate(dim, dim))) {
                    sb.append('Q');
                } else {
                    sb.append('-');
                }
                sb.append(' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Queens eightQueen = new Queens(8);

    }
}
