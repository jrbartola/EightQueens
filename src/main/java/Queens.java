import java.util.LinkedHashSet;

/**
 * Abstract class used to define an n x n
 * board for the n-queens problem.
 *
 * @author    Jesse Bartola
 */

public abstract class Queens {

    protected boolean[][] matrix;
    protected int dim;
    protected LinkedHashSet<Coordinate> queens;

    /**
     * The meat of our algorithm. Finds a valid solution
     * to the n-queens problem with a specified board dimesion
     * and prints the result to stdout.
     *
     */
    public abstract Queens nQueens(int col);

    /**
     * This method checks to see if the current queen
     * placement satisfies the constraints of the other
     * queens on the board.
     *
     * @return  true if placement if valid, false otherwise
     */
    public boolean checkQueen(int row, int col) {

        // Check row
        for (int i = 0; i < dim; i++) {
            if (i != col && matrix[row][i]) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < dim; i++) {
            if (i != row && matrix[i][col]) {
                return false;
            }
        }

        // Check forward diagonal
        for (int i = row-1, j = col+1; i >= 0 && j < dim; i--, j++) {
            if (matrix[i][j]) {
                return false;
            }
        }

        // Check reverse diagonal
        for (int i = row-1, j = col-1; i >= 0 && j >= 0; i--, j--) {
            if (matrix[i][j]) {
                return false;
            }
        }

        return true;
    }

    /**
     * Places a coordinate with the specified row
     * and column into the queens LinkedHashSet and
     * set's its matrix value to true.
     */

    public void placeQueen(int row, int col) {
        queens.add(new Coordinate(row, col));
        matrix[row][col] = true;
    }

    /**
     * Removes a queen from the specified row
     * in the matrix and LinkedHashSet
     */
    public void removeQueen(int row, int col) {
        queens.remove(new Coordinate(row, col));
        matrix[row][col] = false;
    }

    /**
     * Creates a visual of the n-queens board from the given matrix
     *
     * @return a string representation of the queens board
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder((dim + 2) * dim);

        for (int i = 0; i < dim; i++) {

            for (int j = 0; j < dim; j++) {
                if (matrix[i][j]) {
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
}
