// Jackson Turner
public class CollegeClass {
  // fields
  private String name;
  private int credits;
  private String[] roster;
  // methods

  // constructor

  // default constructor: one without parameters
  public CollegeClass() {
    name = "Not set";
    credits = 0;
    roster = new String[60];
  }

  // overloaded
  public CollegeClass(String name, int credits, String[] roster) {
    this.name = name;
    this.credits = credits;
    this.roster = roster;
  }

  // accessors

  public String getName() {
    return name;
  }

  // mutators
  public void setName(String name) {
    this.name = name;
    // field name = parameter name
  }

  public void printInfo() {
    System.out.println("College Class");
  }

}
