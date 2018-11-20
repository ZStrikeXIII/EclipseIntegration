// Jackson Turner
// This class is exclusively made to show an example of a Switch class, as I couldn't find a way to
// get it into my actual program...
public class SwitchDemo {


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

  public static int calculateSum(int num1, int num2) {// Making a method with arguments
    int sum;
    sum = num1 + num2; // argument
    return sum;
  }


}
