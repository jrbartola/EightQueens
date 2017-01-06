/**
 * Class representing a coordinate tuple
 *
 * @author    Jesse Bartola
 */
public class Coordinate {

    private int row;
    private int col;

    public Coordinate(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public int getRow() {
        return this.row;
    }

    public int getCol() {
        return this.col;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;

        if (this == obj)
            return true;

        if (!(obj instanceof Coordinate))
            return false;

        Coordinate c = (Coordinate)obj;

        return getRow() == c.getRow() && getCol() == c.getCol();

    }
}
