import java.util.Random;

public abstract class Thing {
    protected int  row;
    protected int col;
    protected int dir;
    protected int timeSinceLast;
    protected char lab = 'r';
    protected Random rand = new Random();

    public Thing(int row, int col, char lab) {
        this.row = row;
        this.col = col;
        this.lab = lab;
        this.dir = rand.nextInt(3);
    }

    public void rightTurn() {
        dir = (dir + 1) % 4;
    }

    public void oneEighty() {
        dir = (dir + 2) % 4;
    }

    public void leftTurn() {
        dir = (dir + 3) % 4;
    }

    public void step() {
        final int[] dc = {0, 1, 0, -1}, dr = {1, 0, -1, 0};
        row += dr[dir];
        col += dc[dir];
    }

    public abstract void maybeTurn(Random rand);

    public void move(Random rand) {
        maybeTurn(rand);
        step();
    }

    public String toString() {
        return row + " " + col + " " + lab;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public char getLab() {
        return lab;
    }
}

