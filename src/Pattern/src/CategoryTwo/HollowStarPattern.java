package CategoryTwo;

public class HollowStarPattern {

        public static void main(String[] args) {
            // Size of the grid grid (must be an odd number for symmetry)
            int size = 15;
            int mid = size / 2;

            for (int y = 0; y < size; y++) {
                for (int x = 0; x < size; x++) {
                    // Horizontal line condition (arms of the star)
                    boolean horizontalLine = (y == mid);

                    // Main diagonal conditions
                    boolean mainDiagonals = (x == y || x == size - 1 - y);

                    // Filter the diagonals so they only print on the bottom half
                    boolean bottomV = mainDiagonals && (y >= mid);

                    // Top point condition
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
