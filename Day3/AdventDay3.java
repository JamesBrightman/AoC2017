
package adventday3;



import java.util.*;
/*import util.Direction;
import util.Node;
import util.Timer;*/

public class AdventDay3 {


    private static Map<Node, Integer> points = new HashMap<>();

    private static int sumOfNeighbors(int x, int y) {
        int sum = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                if (i != 0 || j != 0) {
                    Node n = new Node(x + j, y + i);
                    sum += points.getOrDefault(n, 0);
                }
            }

        }
        return sum;
    }

    private static Node move(Node pos, Direction dir) {
        return new Node(pos.getX() + dir.getDx(), pos.getY() + dir.getDy());
    }


    public static void main(String[] args) {

        Timer.startTimer();
        int goal = 277678;
        Node position = new Node(0, 0);
        Direction current = Direction.EAST;
        points.put(position, 1);
        int num = 1;
        int moves = 1;
        boolean toggle = false;
        int moveCount = 0;
        boolean firstHighest = false;

        while (num < goal) {
            position = move(position, current);
            int part2 = sumOfNeighbors(position.getX(), position.getY());
            if (part2 > goal) {
                if (!firstHighest) {
                    System.out.println("Part 2: " + part2);
                }
                firstHighest = true;
            }
            points.put(position, part2);

            moveCount++;
            if (moveCount >= moves) {
                moveCount = 0;
                current = current.getLeft();
                toggle = !toggle;
                if (!toggle) {
                    moves++;
                }
            }
            num++;
        }

        System.out.println("Part 1: " + Math.abs(position.getX() + position.getY()));
        System.out.println(Timer.endTimer());
    }
}