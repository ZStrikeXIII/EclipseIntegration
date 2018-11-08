
public class Arrays {
     public static void main(String[] args) {
       int[] scores = {96,43,50,72,13};
       int min = scores[0];
       for (int q = 0; q<scores.length; q++) {
         if(scores[q]<min) {
           min = scores [q];
         }
       } System.out.println(min);
       int sum = 0;
       for (int counter = 0; counter < scores.length; counter++) {
         sum+=scores[counter];
       } System.out.println("The sum of the scores is " + sum);
       int[][]grid = { {3,5,2343}, {2,4} };
       System.out.println(grid[1][1]);
     }
}
