import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

// Jackson Turner
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
public class Main {

  public static void main(String[] args) { // This entire line is called a header, and (String[]
                                           // args) is the parameter
    Scanner scan = new Scanner(System.in);// opening a scanner to read user input
    System.out.println("Hello, my name is Connor, I'm the android sent by CyberLife.");// Never gets
                                                                                       // old
    /*
     * int num1; Person john = new Person();
     */
    // john.height = 72;
    Random rand = new Random(); // opening the random class
    int n = rand.nextInt(50) + 1; // initializing the random variable
    System.out.println(
        "This program is an 'endless' RPG simulator. There are multiple enemies on this path, and leveling up will grant you new attacks. \nInput your desired name to begin, be aware you will be unable to change it later...:");
    // Escape method \n used to format the string to make it look better when the program is run by
    // splitting it into a new line
    final String userName = scan.nextLine();// Using final to make the user's name unchangable.
    int player1Level = 1;// initiating player's level.
    String sub = userName.substring(0, 5); // using the substring String method. Returns only part
                                           // of the string userName from the 0th to 4th character.
    System.out.println("Here's your name if it was only five characters: " + sub);// For fun!
    System.out.println(
        "As a little something, I'll increase your level based on where a certain letter lies in your name...");
    int bonusLevel = userName.indexOf('a');// using the indexOf String method. Counts where the
                                           // letter a is in the index of the string userName.
    player1Level = player1Level + bonusLevel;
    if (player1Level > 1) {
      System.out.println(userName + " grew to Level " + player1Level + "!");
      // Argument in the parentheses, the whole line is called a call.
    } else {
      System.out.println("No bonus levels...");
    }
    System.out.println("An enemy draws near!\nPress 1 to continue"); // Prompting user command
    // String line = scan.nextLine(); //Reading user input
    int line = scan.nextInt();// Same as above
    // System.out.println("You used " + line); //Temporary response to user input.
    if (line > 0 && line < 2) {// If else statement
      System.out.println(userName + " attacked.");
    } else {
      System.out.println(userName + " ran away..."); // Attempt 1 at an if else code that functions
                                                     // based on user input, may be edited out
                                                     // later.
    }
    System.out.println("Choose an attack, 1 for attack, 2 for Cross Strike.");
    int attk = scan.nextInt();
    String atk_result = "N/A";
    int damage = 0;// initializing attack name and damage dealt
    if (attk == 1) {// == works as an equals sign on objects, while = is the assignment operator,
                    // they're very different, don't get them confused!
      atk_result = "Attack";
      damage = 15;
    }
    if (attk == 2) {
      atk_result = "Cross Strike";
      damage = 45;
    }
    System.out.println(userName + " used " + atk_result + ", you dealt " + damage + " damage.");
    int enemy_hp = 40 - damage;// damage calculation
    if (enemy_hp < 0) {
      System.out.println(userName + " defeated the enemy!");
      player1Level = 2;
      System.out.println(userName + " has grown to level " + player1Level + "!");
      System.out.println(userName + " has learned Energy Blast!");
    }
    if (enemy_hp > 0) {
      System.out.println("The enemy still stands.");// gives input on whether or not the enemy is
                                                    // defeated
    }
    int boss_hp = 200;
    System.out.println("A Dire Wolf appeared!");
    while (boss_hp > 0) {// A while loop test for better battle flow
      System.out.println("Choose an attack. (1): Attack, (2): Cross Slash (3): Energy Blast");
      int attk2 = scan.nextInt();
      if (attk2 == 1) {// if then else if statement
        boss_hp = boss_hp - 15;
        System.out.println(userName
            + " attacked! Dealt 15 damage to the Dire Wolf. Boss HP Remaining: " + boss_hp);
      } else if (attk2 == 2) {
        boss_hp = boss_hp - 45;
        System.out.println(userName
            + " slashed with all their might! Dealt 45 damage to the Dire Wolf. Boss HP Remaining: "
            + boss_hp);
      } else if (attk2 == 3) {
        boss_hp = boss_hp - 25;
        System.out.println(userName
            + " put out their hand, and a blast of energy engulfed the foe! Dealt 25 damage to the Dire Wolf. Boss HP Remaining: "
            + boss_hp);
      }

    }
    System.out.println(userName + " defeated the Dire Wolf!");
    player1Level += 1;
    System.out.println(userName + " grew to Level " + player1Level + "!");
    System.out.println(userName + " has learned Roulette Strike!");
    System.out.println(
        "Roulette Strike is a unique attack, its power is randomized every time it is used.");
    // This is my excuse to use the random variable
    String s = "N/A";
    if (player1Level == 1) {// ternary statement to check if levels were working correctly. Can be
                            // edited out
      s = "level";
    } else {
      s = "levels";
    }
    System.out.println(userName + " now has " + player1Level + " " + s); // ternary construct
    int golem_hp = 400;
    System.out.println("A Golem appeared!");
    while (golem_hp > 0) {// A while loop test for better battle flow
      System.out.println(
          "Choose an attack. (1): Attack (2): Cross Slash (3): Energy Blast (4): Roulette Strike");
      int attk2 = scan.nextInt();
      if (attk2 == 1) {// if then else if statement
        golem_hp = golem_hp - 15;
        System.out.println(
            userName + " attacked! Dealt 15 damage to the Golem. Boss HP Remaining: " + golem_hp);
      } else if (attk2 == 2) {
        golem_hp = golem_hp - 45;
        System.out.println(userName
            + " slashed with all their might! Dealt 45 damage to the Golem. Boss HP Remaining: "
            + golem_hp);
      } else if (attk2 == 3) {
        golem_hp = golem_hp - 25;
        System.out.println(userName
            + " put out their hand, and a blast of energy engulfed the foe! Dealt 25 damage to the Golem. Boss HP Remaining: "
            + golem_hp);
      } else if (attk2 == 4) {
        n = rand.nextInt(50) + 1;// using the random variable
        golem_hp = golem_hp - n;
        System.out.println(userName + " tried their luck and slashed! Dealt " + n
            + " damage to the Golem. Boss HP Remaining: " + golem_hp);
      }
    }
    System.out.println("The Golem broke into pieces, " + userName + " won!");
    player1Level += 1;
    System.out.println(userName + " is now Level " + player1Level + "!");
    System.out.println(userName + " learned Exponential Blast!");
    System.out.println("Exponential Blast's power increases based on your level.");
    System.out.println("A mysterious figure appeared.../n???:'My name...what is my name...?");
    System.out.println("Enter their name: ");
    String myName = scan.nextLine();
    String theirName = "Van";// A bit of an easter egg for my Programming professor.
    myName.equals(theirName);// comparing two strings using the .equals String method. This is the
                             // only way to compare two strings.
    if (myName.equals(theirName) == true) {
      System.out.println("Van:'Yes, that's right! Here is a little help...");
      player1Level += 1;
      System.out.println(userName + " is now Level " + player1Level + "!+");
    } else {
      System.out.println(
          "???:'No...that's not it...I thought you'd know.../nThe mysterious figure faded away...");
    }
    boss_hp = 1000;
    System.out.println("A Phantom apparates in front of you!");
    while (boss_hp > 0) {// A while loop test for better battle flow
      System.out.println(
          "Choose an attack. (1): Attack (2): Cross Slash (3): Energy Blast (4): Roulette Strike");
      int attk3 = scan.nextInt();
      if (attk3 == 1) {// if then else if statement
        boss_hp = boss_hp - 15;
        System.out.println(
            userName + " attacked! Dealt 15 damage to the Phantom. Boss HP Remaining: " + boss_hp);
      } else if (attk3 == 2) {
        boss_hp = boss_hp - 45;
        System.out.println(userName
            + " slashed with all their might! Dealt 45 damage to the Phantom. Boss HP Remaining: "
            + boss_hp);
      } else if (attk3 == 3) {
        boss_hp = boss_hp - 25;
        System.out.println(userName
            + " put out their hand, and a blast of energy engulfed the foe! Dealt 25 damage to the Phantom. Boss HP Remaining: "
            + boss_hp);
      } else if (attk3 == 4) {
        n = rand.nextInt(50) + 1;// using the random variable
        boss_hp = boss_hp - n;
        System.out.println(userName + " tried their luck and slashed! Dealt " + n
            + " damage to the Phantom. Boss HP Remaining: " + boss_hp);
      } else if (attk3 == 5) {
        int expBlast = (int) Math.pow(player1Level, 4); // casting used to fix math method
        boss_hp = boss_hp - expBlast;
        System.out.println(
            userName + " drew in their strength, and unleashed it in a blast of flame! Dealt "
                + expBlast + " damage to the Phantom! Boss HP Remaining: " + boss_hp);
      }
      System.out.println("The phantom vanished into thin air..." + userName + " won!");
      player1Level += 1;
      System.out.println(userName + " is now Level" + player1Level + "!");
      System.out.println(userName + " learned Grand Finale");
      System.out.println("Grand Finale is a move that can only be used after five turns.");

    }
  } // Waffles //Pancakes
}
