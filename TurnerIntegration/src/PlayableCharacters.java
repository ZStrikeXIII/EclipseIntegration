// Jackson Turner
public class PlayableCharacters {
  public int hp;
  public int atk;
  public int def;
  public int matk;
  public int mdef;
  public int spd;
  public int acc;

  public static void main(String[] args) {
    int imanis = 0;
    while (imanis < 10) {
      System.out.println("This loop will now terminate by the 'break' statement.");
      imanis++;
      break; // break will immediately terminate the loop when it is used, as shown here.
    }
    int inanis = 0;
    while (inanis < 9) {
      System.out.println("int inanis currently = " + inanis);
      inanis++;
      if (inanis == 3) {
        continue;// continue will make the loop go back and check the condition again, skipping
                 // whatever is after the continue statement
      }
      inanis++;
    }
  }
}
