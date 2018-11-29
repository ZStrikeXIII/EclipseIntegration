// Jackson Turner
// This class is exclusively made to show an example of a Switch class, as I couldn't find a way to
// get it into my actual program, as well as a method made using arguments at the bottom.
/**
 * Used to show a switch statement, as well as a method made using arguments.
 * 
 * @author Jackson Turner
 *
 */
public class SwitchDemo {


  /**
   * A method entirely made to show how a Switch class works, as well as showing a method made using
   * arguments.
   * 
   * @param args The default parameter of a main method.
   */
  public static void main(String[] args) {
    int month = 8;
    String monthString;
    switch (month) {
      case 1:
        monthString = "January";
        break;
      case 2:
        monthString = "February";
        break;
      case 3:
        monthString = "March";
        break;
      case 4:
        monthString = "April";
        break;
      case 5:
        monthString = "May";
        break;
      case 6:
        monthString = "June";
        break;
      case 7:
        monthString = "July";
        break;
      case 8:
        monthString = "August";
        break;
      case 9:
        monthString = "September";
        break;
      case 10:
        monthString = "October";
        break;
      case 11:
        monthString = "November";
        break;
      case 12:
        monthString = "December";
        break;
      default:
        monthString = "Invalid month";
        break;
    }
    // Various math calculations
    System.out.println(monthString);
    System.out.println(8 / 4);
    int number4 = 23;
    System.out.println(number4++);
    System.out.println(number4--);
    System.out.println(9 % 2);
    System.out.println(10 * 2);

  }

  // Below a method is made using arguments
  /**
   * A method that adds two numbers to return the sum of them, made using arguments.
   * 
   * @param num1 The first number to be added.
   * @param num2 The second number to be added.
   * @return The sum of the two numbers above is returned.
   */
  public static int calculateSum(int num1, int num2) {
    int sum;
    sum = num1 + num2; // argument
    return sum;
  }


}
