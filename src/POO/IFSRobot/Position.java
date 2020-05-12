package POO.IFSRobot;

public class Position {
    // ATRIBUTOS
    private int row;
    private int col;

    // CONSTRTORES
    public Position(int row, int col) {
        this.row = row;
        this.col = col;
    }

    // ENCAPSULAMENTO
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    // EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position = (Position) o;
        return row == position.row &&
                col == position.col;
    }

    // TOSTRING
    @Override
    public String toString() {
        return '[' + row +", "+ col + ']';
    }
}