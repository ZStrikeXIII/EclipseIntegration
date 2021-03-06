// Jackson Turner
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

// A program to display what I have learned in my programming class. So far, it's an RPG battle
// simulator, later down the line things like EXP and Levels will be integrated, but not yet, this
// is a prototype so far.
// Everything before the actual program here is the comments needed in the integration project to
// describe what it requires me to describe
// Operator Precedence is like PEMDAS, there's an order to which operations are carried out from L
// to R, though the order is a little different. First is operators in parentheses, then
// increment/decrement operators (++ or --), then multiplication and division operators, and finally
// addition and subtraction operators, from L to R.
// Casting is when you change a data type temporarily, and it is done by having the data type you
// desire in parentheses next to the value you want to change. Ex: Want to change a variable to
// double? Just say (double)num2.
// The built-in data types of Java include the eight primitive data types and the String Data type
// Byte: We won't really use this. But it is made up of eight bits, and a Java byte is able to store
// 256 values, from -128 to 127, with 128 values below 0, one that equals 0, and 127 above 0.
// Short: We won't really use these either. This is made of 16 bits and can store 65,535 values from
// -32,768 to 32,767.
// int: We use this ALL the time. It holds an integer value. We can assign it a value, change it
// later, and more. It cannot, however, have a decimal involved. That's where the next primitive
// data type comes in.
// double: This is the same as int, except it can have a decimal. That's about it. If you want an
// int and double to be calculated with each other, you NEED to use casting, which I explained
// earlier.
// long: We don't use this often, but it is able to store larger values, and has double the bits
// that int has, where int has 32 and long has 64.
// float: Similar to double, as it involves decimals. We don't use this much either, we use double
// instead.
// boolean: This data type only returns true or false, and is used with logic in Java for a variety
// of different ways it could help in your program. It can help you make decisions in the program.
// char: Represents a single character, like 'a'. Seems pointless, but you can do a bunch of cool
// stuff with it later down the line, like comparing Strings by comparing each individual char
// value.
// String: This holds typed data as a sequence of characters and arrays. These have to be stated
// with double quotations "". Strings are a CLASS, not a primitive data type, and there are a lot of
// interesting methods that can be used with it, like getLength and substring.
// Scope means that variables are only accessible in the method that they are declared.
// A variable is a location in memory, such as int num1 = 23. They're very crucial to many programs,
// and this one is no exception.
/**
 * This contains my entire main code, using many elements of what we learned to make an RPG battle
 * simulator. The user inputs a number, and will use an attack depending on the number selected.
 * 
 * @author Jackson Turner
 *
 */
public class Main {

  /**
   * The entirety of my main code, which is an "endless" RPG battle simulator, described above.
   * 
   * @param args The default parameter for the main method.
   */
  public static void main(String[] args) {
    // The entire line above is called a header, and (String[] args) is the parameter
    /*
     * CollegeClass cop2006201808 = new CollegeClass(); String[] phyRoster = {"Zack"}; CollegeClass
     * phy2048c201808 = new CollegeClass("Physics I", 4, phyRoster); SLClass myClass = new
     * SLClass(); cop2006201808.printInfo(); myClass.printInfo();
     */

    CollegeClass thisClass = new ServiceLearningClass();
    // Polymorphism is used here, this method call from
    // SLClass
    // is derived from a method call in CollegeClass, both of
    // which perform the same functions.
    thisClass.printInfo();

    Scanner scan = new Scanner(System.in);// opening a scanner to read user input
    System.out.println("Hello, my name is Connor, I'm the android sent by CyberLife.");
    // Never gets old
    /*
     * int num1; Person john = new Person();
     */
    // john.height = 72;
    Random rand = new Random(); // opening the random class
    int n = rand.nextInt(50) + 1; // initializing the random variable
    System.out.println(
        "This program is an 'endless' RPG simulator. There are multiple enemies on this path, "
            + "and leveling up will grant you new attacks. \nInput your desired name to begin, "
            + "be aware you will be unable to change it later...:");
    // Escape method \n used to format the string to make it look better when the program is run by
    // splitting it into a new line
    final String userName = scan.nextLine();// Using final to make the user's name unchangable.
    int player1Level = 1;// initiating player's level.
    /*
     * String sub = userName.substring(0, 5); // using the substring String method. Returns only
     * part // of the string userName from the 0th to 4th character.
     * System.out.println("Here's your name if it was only five characters: " + sub);// For fun!
     * System.out.println( "As a little something, I'll increase your level based on where a certain
     * letter lies in your name..." ); int bonusLevel = userName.indexOf('a');// using the indexOf
     * String method. Counts where the // letter a is in the index of the string userName.
     * player1Level = player1Level + bonusLevel; if (player1Level > 1) { System.out.println(userName
     * + " grew to Level " + player1Level + "!"); // Argument in the parentheses, the whole line is
     * called a call. } else { System.out.println("No bonus levels..."); }
     */
    /*
     * System.out.println("An enemy draws near!\nPress 1 to continue"); // Prompting user command //
     * String line = scan.nextLine(); //Reading user input int line = scan.nextInt();// Same as
     * above // System.out.println("You used " + line); //Temporary response to user input. if (line
     * > 0 && line < 2) {// If else statement System.out.println(userName + " attacked."); } else {
     * System.out.println(userName + " ran away..."); // Attempt 1 at an if else code that functions
     * // based on user input, may be edited out // later. }
     * System.out.println("Choose an attack, 1 for attack, 2 for Cross Strike."); int attk =
     * scan.nextInt(); String atk_result = "N/A"; int damage = 0;// initializing attack name and
     * damage dealt if (attk == 1) {// == works as an equals sign on objects, while = is the
     * assignment operator, // they're very different, don't get them confused! atk_result =
     * "Attack"; damage = 15; } if (attk == 2) { atk_result = "Cross Strike"; damage = 45; }
     * System.out.println(userName + " used " + atk_result + ", you dealt " + damage + " damage.");
     * int enemy_hp = 40 - damage;// damage calculation if (enemy_hp < 0) {
     * System.out.println(userName + " defeated the enemy!"); player1Level = 2;
     * System.out.println(userName + " has grown to level " + player1Level + "!");
     * System.out.println(userName + " has learned Energy Blast!"); } if (enemy_hp > 0) {
     * System.out.println("The enemy still stands.");// gives input on whether or not the enemy is
     * // defeated } // end of if-then battle test
     */ // Commented out initial battle "loop"
    player1Level = 2; // in case the previous statement isn't used properly.
    int bossHp = 200;
    System.out.println("A Dire Wolf appeared!");
    while (bossHp > 0) {
      // A while loop test for better battle flow
      System.out.println(
          "Choose an attack. \n(1): Attack, (2): Cross Slash (3): Energy Blast (0): Examine");
      int attk2 = 99;
      while (attk2 == 99) {
        try {
          attk2 = scan.nextInt();
        } catch (InputMismatchException ex) {
          // Exception handling used in case the input is not an integer
          System.out.println("Please input a number");
          scan.nextLine();
        }
      }
      if (attk2 == 1) {
        // if then else if statement
        bossHp = bossHp - 15;
        System.out.println(
            userName + " attacked! Dealt 15 damage to the Dire Wolf. Boss HP Remaining: " + bossHp);
      } else if (attk2 == 2) {
        bossHp = bossHp - 45;
        System.out.println(userName
            + " slashed with all their might! Dealt 45 damage to the Dire Wolf. Boss HP Remaining: "
            + bossHp);
      } else if (attk2 == 3) {
        bossHp = bossHp - 25;
        System.out.println(userName
            + " put out their hand, and a blast of energy engulfed the foe! Dealt 25 damage to the "
            + "Dire Wolf. Boss HP Remaining: " + bossHp);
      } else if (attk2 == 0) {
        System.out.println("Dire Wolf\nHP: " + bossHp
            + "\n'A giant, ferocious wolf far stronger than an ordinary wolf. Attacks anything it "
            + "considers prey, people included.'");
      }

    } // end of battle 1
    System.out.println(userName + " defeated the Dire Wolf!");
    player1Level += 1;
    System.out.println(userName + " grew to Level " + player1Level + "!");
    System.out.println(userName + " has learned Roulette Strike!");
    System.out.println(
        "Roulette Strike is a unique attack, its power is randomized every time it is used.");
    // This is my excuse to use the random variable
    // Below is a ternary statements to check if levels are working properly, can be commented out
    String s = "N/A";
    if (player1Level == 1) {
      s = "level";
    } else {
      s = "levels";
    }
    System.out.println(userName + " now has " + player1Level + " " + s); // ternary construct
    int golemHp = 400;
    System.out.println("A Golem appeared!");
    while (golemHp > 0) {
      // Start of battle 2
      System.out.println(
          "Choose an attack. \n(1): Attack (2): Cross Slash (3): Energy Blast (4): Roulette Strike"
              + " (0): Examine");
      int attk2 = 99;
      while (attk2 == 99) {
        try {
          attk2 = scan.nextInt();
        } catch (InputMismatchException ex) { // Exception handling
          System.out.println("Please input a number");
          scan.nextLine();
        }
      }
      if (attk2 == 1) {
        golemHp = golemHp - 15;
        System.out.println(
            userName + " attacked! Dealt 15 damage to the Golem. Boss HP Remaining: " + golemHp);
      } else if (attk2 == 2) {
        golemHp = golemHp - 45;
        System.out.println(userName
            + " slashed with all their might! Dealt 45 damage to the Golem. Boss HP Remaining: "
            + golemHp);
      } else if (attk2 == 3) {
        golemHp = golemHp - 25;
        System.out.println(userName
            + " put out their hand, and a blast of energy engulfed the foe! Dealt 25 damage to the "
            + "Golem. Boss HP Remaining: " + golemHp);
      } else if (attk2 == 4) {
        n = rand.nextInt(50) + 1;// using the random variable
        golemHp = golemHp - n;
        System.out.println(userName + " tried their luck and slashed! Dealt " + n
            + " damage to the Golem. Boss HP Remaining: " + golemHp);
      } else if (attk2 == 0) {
        System.out.println("Golem\nHP: " + golemHp
            + "\n'A large beast made of stone. Made to protect certain areas, some now roam freely,"
            + " attacking passersby.'");
      }
    } // end of battle 2
    System.out.println("The Golem broke into pieces, " + userName + " won!");
    player1Level += 1;
    System.out.println(userName + " is now Level " + player1Level + "!");
    System.out.println(userName + " learned Exponential Blast!");
    System.out.println("Exponential Blast's power increases based on your level.");
    /*
     * An easter egg commented out due to it not working properly
     * System.out.println("A mysterious figure appeared... /n???:'My name...what is my name...?");
     * System.out.println("Enter their name: "); String myName = scan.nextLine();
     * System.out.println("Press 1 to continue"); int cont = scan.nextInt(); if (cont == 1) {
     * System.out.println("/n"); } else { System.out.println("/n"); } String theirName = "Van";// A
     * bit of an easter egg for my Programming professor. myName.equals(theirName);// comparing two
     * strings using the .equals String method. This is the // only way to compare two strings. if
     * (myName.equals(theirName) == true) {
     * System.out.println("Van:'Yes, that's right! Here is a little help..."); player1Level += 1;
     * System.out.println(userName + " is now Level " + player1Level + "!+"); } else {
     * System.out.println(
     * "???:'No...that's not it...I thought you'd know... /nThe mysterious figure faded away..."); }
     */
    bossHp = 1000;
    System.out.println("A Phantom apparates in front of you!");
    while (bossHp > 0) {
      // Start of battle 3
      System.out.println(
          "Choose an attack. \n(1): Attack (2): Cross Slash (3): Energy Blast (4): Roulette Strike "
              + "(5): Exponential Blast (0): Examine");
      int attk2 = 99;
      while (attk2 == 99) {
        try {
          attk2 = scan.nextInt();
        } catch (InputMismatchException ex) {
          System.out.println("Please input a number");
          scan.nextLine();
        }
      }
      if (attk2 == 1) {
        bossHp = bossHp - 15;
        System.out.println(
            userName + " attacked! Dealt 15 damage to the Phantom. Boss HP Remaining: " + bossHp);
      } else if (attk2 == 2) {
        bossHp = bossHp - 45;
        System.out.println(userName
            + " slashed with all their might! Dealt 45 damage to the Phantom. Boss HP Remaining: "
            + bossHp);
      } else if (attk2 == 3) {
        bossHp = bossHp - 25;
        System.out.println(userName
            + " put out their hand, and a blast of energy engulfed the foe! Dealt 25 damage to the "
            + "Phantom. Boss HP Remaining: " + bossHp);
      } else if (attk2 == 4) {
        n = rand.nextInt(50) + 1;
        bossHp = bossHp - n;
        System.out.println(userName + " tried their luck and slashed! Dealt " + n
            + " damage to the Phantom. Boss HP Remaining: " + bossHp);
      } else if (attk2 == 5) {
        int expBlast = (int) Math.pow(player1Level, 4); // casting used to fix math method
        bossHp = bossHp - expBlast;
        System.out.println(
            userName + " drew in their strength, and unleashed it in a blast of flame! Dealt "
                + expBlast + " damage to the Phantom! Boss HP Remaining: " + bossHp);
      } else if (attk2 == 0) {
        System.out.println("Phantom\nHP: " + bossHp
            + "\n'A spectre from beyond the grave that reaps the souls of those it comes across. "
            + "Often believed to be Death himself.'");
      }
    } // end of battle three
    System.out.println("The phantom vanished into thin air..." + userName + " won!");
    player1Level += 1;
    System.out.println(userName + " is now Level" + player1Level + "!");
    System.out.println(userName + " learned Grand Finale");
    System.out.println("Grand Finale is a move that can only be used after five turns.");
    int grandFinaleTurns = 0;
    // Next Boss!
    bossHp = 1500;
    System.out.println("A Gashadokuro looms above you!");
    while (bossHp > 0) {
      // Start of battle four
      System.out.println(
          "Choose an attack. \n(1): Attack (2): Cross Slash (3): Energy Blast (4): Roulette Strike"
              + " (5): Exponential Blast (6): Grand Finale (0): Examine");
      int attk2 = 99;
      while (attk2 == 99) {
        try {
          attk2 = scan.nextInt();
        } catch (InputMismatchException ex) {
          System.out.println("Please input a number");
          scan.nextLine();
        }
      }
      if (attk2 == 1) {
        bossHp = bossHp - 15;
        System.out.println(userName
            + " attacked! Dealt 15 damage to the Gashadokuro. Boss HP Remaining: " + bossHp);
      } else if (attk2 == 2) {
        bossHp = bossHp - 45;
        System.out.println(
            userName + " slashed with all their might! Dealt 45 damage to the Gashadokuro. "
                + "Boss HP Remaining: " + bossHp);
      } else if (attk2 == 3) {
        bossHp = bossHp - 25;
        System.out.println(userName
            + " put out their hand, and a blast of energy engulfed the foe! Dealt 25 damage to the "
            + "Gashadokuro. Boss HP Remaining: " + bossHp);
      } else if (attk2 == 4) {
        n = rand.nextInt(50) + 1;
        bossHp = bossHp - n;
        System.out.println(userName + " tried their luck and slashed! Dealt " + n
            + " damage to the Gashadokuro. Boss HP Remaining: " + bossHp);
      } else if (attk2 == 5) {
        int expBlast = (int) Math.pow(player1Level, 4);
        bossHp = bossHp - expBlast;
        System.out.println(
            userName + " drew in their strength, and unleashed it in a blast of flame! Dealt "
                + expBlast + " damage to the Gashadokuro! Boss HP Remaining: " + bossHp);
      } else if (attk2 == 6) {
        if (grandFinaleTurns >= 5) {
          // start of grand finale if-then-else
          bossHp = bossHp - 500;
          System.out.println(userName
              + " concentrated their might, and struck with a brilliant slash! Dealt 500 damage to "
              + "the Gashadokuro! Boss HP Remaining: " + bossHp);
        } else {
          System.out.println("You cannot use Grand Finale yet. Five turns must pass. Turns passed: "
              + grandFinaleTurns);
        }
      } else if (attk2 == 0) {
        System.out.println("Gashadokuro\nHP: " + bossHp
            + "\n'A skeleton fifteen times the size of an average human in Japanese mythology known"
            + " to bite the heads off of travelers. They are normally invisible.'");
      } // end of grand finale if-then-else
      grandFinaleTurns++;
      System.out.println("Turns Passed: " + grandFinaleTurns);
    } // end of battle four
    System.out.println("The Gashadokuro fell to pieces! " + userName + " won!");
    player1Level += 1;
    System.out.println(userName + " is now Level " + player1Level + "!");
  }
  // end of main area
} // Waffles //Pancakes //Scramba Egg //Toast //Ramen //Spaghetti

