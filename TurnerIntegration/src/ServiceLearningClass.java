// Jackson Turner
// A class made to show overriding a method, inheritance, and setting up for polymorphism used in
// the Main class.
/**
 * Used to show overriding a method and using inheritance.
 * @author Jackson Turner
 *
 */
public class ServiceLearningClass extends CollegeClass {
  // inheritance is being used here. It is where a child class inherits all of the same methods and
  // fields that the class they are a subclass of has. Here, SLClass inherits everything from
  // CollegeClass via inheritance. This allows you to rewrite less code over and over for similar
  // classes.
  public void printInfo() {
    super.printInfo();
    System.out.println("SL College Class");// overriding
  }

}
