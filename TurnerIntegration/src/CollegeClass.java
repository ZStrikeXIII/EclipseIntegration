// Jackson Turner
// A class made to show off constructors, getters, and setters, as well as setting up for
// inheritance and polymorphism in other classes.
/**
 * A class made to show constructors, getters, and setters. It also sets up for inheritance and
 * polymorphism, which are used in different classes.
 * 
 * @author Jackson Turner
 *
 */
public class CollegeClass {
  // fields
  private String name;
  private int credits;
  private String[] roster;
  // methods

  // constructor

  // default constructor: one without parameters
  /**
   * A default constructor made without parameters that sets up the default values of name, credits,
   * and the roster array.
   */
  public CollegeClass() {
    name = "Not set";
    credits = 0;
    roster = new String[60];
  }

  // overloaded constructor with parameters
  /**
   * An overloaded version of the previous constructor, now made using parameters.
   * 
   * @param name Used to show the this. method.
   * @param credits Used to show the this. method.
   * @param roster Used to show the this. method.
   */
  public CollegeClass(String name, int credits, String[] roster) {
    this.name = name;
    this.credits = credits;
    this.roster = roster;
  }

  // accessors
  // Below is a getter
  /**
   * A method used to get the name variable from above so it can be used publicly.
   * 
   * @return The value of name is returned.
   */
  public String getName() {
    return name;
  }

  // mutators
  // Below is a setter
  /**
   * A setter method used in tandem with the getter method above to allow public use of the variable
   * name.
   * 
   * @param name The variable, name, which we want to be made for public use.
   */
  public void setName(String name) {
    this.name = name;
    // field name = parameter name
  }

  /**
   * Used to print out the information the methods above set, and prints it out when called.
   * 
   */
  public void printInfo() {
    System.out.println("College Class");
    System.out.println(name);
    System.out.println(credits);
    System.out.println(roster[1]);

  }

}
