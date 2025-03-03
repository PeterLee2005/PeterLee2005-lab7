/** Type C will move similar to Type C, 
 but instead moves in diagonal squares and every 16 moves
 **/

import java.util.Random;

public class TypeC extends Thing {
    private int timeSinceLast = 0;

    public TypeC(int row, int col) {
        super(row, col, 'y');
    }

    public void maybeTurn(Random rand) {
        timeSinceLast++;
        if (timeSinceLast == 16) {
            timeSinceLast = 0;
            int i = rand.nextInt(2);
            if (i == 1) oneEighty();
        } else if (timeSinceLast % 2 == 0) {
            rightTurn();
        } else {
            leftTurn();
        }
    }
}
