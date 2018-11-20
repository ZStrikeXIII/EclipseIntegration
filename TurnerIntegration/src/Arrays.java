// Jackson Turner
import java.util.ArrayList;

public class Arrays {
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
    for (int counter = 0; counter < scores.length; counter++) {// Enhanced for loop
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
    while (found == false && w < locate.length) {// searching for a value in an array and returning
                                                 // its index
      if (locate[w] == 13) {
        found = true;
      }
      w++;
    }
    System.out.println("The number 13 was found at index " + (w - 1));
  }// end of "main"
}
