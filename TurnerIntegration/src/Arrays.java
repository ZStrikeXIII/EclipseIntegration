// Jackson Turner
// This class was made to show off everything needed to show involving arrays, as well as a do-while
// statement.
import java.util.ArrayList;

/**
 * This class shows everything involving arrays that we learned, with a do-while statement included.
 * These include creating arrays, searching them for specific values, and the same for
 * two-dimensional arrays.
 * 
 * @author Jackson Turner
 *
 */
public class Arrays {
  /**
   * The main area of the class where arrays are used.
   * 
   * @param args The default parameters of a main method.
   */
  public static void main(String[] args) {
    int[] scores = {96, 43, 50, 72, 13};// creating an array
    int min = scores[0];
    for (int q = 0; q < scores.length; q++) {
      if (scores[q] < min) {
        min = scores[q];
      }
    }
    System.out.println(min);
    int sum = 0;
    for (int counter = 0; counter < scores.length; counter++) {
      sum += scores[counter];
    }
    System.out.println("The sum of the scores is " + sum);
    int[][] grid = {{3, 5, 2343}, {2, 4}};// A multi-dimensional array
    System.out.println(grid[1][1]);
    ArrayList<String> blondeSquad;
    blondeSquad = new ArrayList();
    blondeSquad.add("Cloud");
    blondeSquad.add("Shulk");
    blondeSquad.add("Lucas");
    System.out.println("The Blonde Squad is made up of the characters " + blondeSquad.get(0) + ", "
        + blondeSquad.get(1) + ", and " + blondeSquad.get(2) + ".");
    int[] locate = {2, 81, 27, 13, 42, 47};// preparing to search for 13 in an array
    boolean found = false;
    int w = 0;
    while (found == false && w < locate.length) {
      // searching for a value in an array and returning its index
      if (locate[w] == 13) {
        found = true;
        System.out.println("The number 13 was found at index " + (w));
      }
      w++;
    }
    int[][] searchTwo = {{4, 8, 12, 16}, {3, 6, 9, 12}};// searching a 2D array
    boolean found2 = false;
    int row = 0;
    int col = 0;
    while (found2 == false && row < searchTwo.length) {
      while (col < 4) {
        if (searchTwo[row][col] == 9) {
          found2 = true;
          System.out.println("The number 9 was found at coordinates " + row + ", " + col);
        }
        col++;
      }
      row++;
      col = 0;
    }

    int totalSum = 0;
    int addedNum = 1;
    // do-while statement
    do {
      totalSum += addedNum;
      addedNum++;
    } while (addedNum < 10);
    System.out.println("The total sum of the do-while statement is " + totalSum);
  } // end of "main"
}
