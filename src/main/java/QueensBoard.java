
/**
 * This class is used as an implementation of an n x n
 * board for the n-queens problem.
 *
 * @author    Jesse Bartola
 */
public class QueensBoard extends Queens {

    public QueensBoard(int dim) {
        this.count = 0;
        this.matrix = new boolean[dim][dim];
        this.dim = dim;
    }


    /** Backtracking approach to solve the nQueens problem
     *
     *  Recursively place queens on the board, checking if each
     *  placement is valid. If we run into an invalid placement
     *  remove the previous queen from the board and continue placing
     *  queens until we find a successful configuration
     *
     * @param col The column to start at
     * @return A completed nQueens board
     */
    public Queens nQueens(int col) {
        if (count == dim)  {
            return this;
        }

        for (int r = 0; r < dim; r++) {
            if (checkQueen(r, col)) {
                placeQueen(r, col);

                Queens fin = nQueens(col+1);

                if (fin != null) {
                    return fin;
                }

                // Backtrack if our placement was invalid
                removeQueen(r, col);
            }
        }

        // If we can't find a valid queen placement
        // for this column return null
        return null;
    }

    public static void main(String[] args) {
        QueensBoard nQueensBoard;

        if (args.length != 0) {
            int numOfQueens = Integer.parseInt(args[0]);
            nQueensBoard = new QueensBoard(numOfQueens);

        } else {
            nQueensBoard = new QueensBoard(8);
        }

        System.out.println(nQueensBoard.nQueens(0));

    }

}
