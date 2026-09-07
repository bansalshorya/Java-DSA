package CategoryTwo;

public class HollowStarPattern {

        public static void main(String[] args) {
            int size = 15;
            int mid = size / 2;

            for (int y = 0; y < size; y++) {
                for (int x = 0; x < size; x++) {
                    boolean horizontalLine = (y == mid);
                    boolean mainDiagonals = (x == y || x == size - 1 - y);
                    boolean bottomV = mainDiagonals && (y >= mid);
                    boolean topPoint = (x == mid && y == 0);

                    if (horizontalLine || bottomV || topPoint) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }

}
