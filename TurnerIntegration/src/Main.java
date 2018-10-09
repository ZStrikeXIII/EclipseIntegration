import java.util.Scanner;

// Jackson Turner
// A program to display what I have learned in my programming class. So far, it's an RPG battle simulator, later down the line things like EXP and Levels will be integrated, but not yet, this is a prototype so far.
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);//opening a scanner to read user input
		System.out.println("Hello, my name is Connor, I'm the android sent by CyberLife.");//Never gets old
		/*int num1;
		Person john = new Person();*/
		//john.height = 72;
		System.out.println("This program is an 'endless' RPG simulator. There are multiple enemies on this path, and leveling up will grant you new attacks, no stats here (yet). Input your desired name to begin:");
		String userName = scan.nextLine();
		int player1Level = 1;
		System.out.println("An enemy draws near! Use a command: Attack (1) or Run (2)."); //Prompting user command, Run does not yet end the scenario, waiting for how to make a loop.
		//String line = scan.nextLine(); //Reading user input
		int line = scan.nextInt();//Same as above
		//System.out.println("You used " + line); //Temporary response to user input.
		if (line > 0 && line < 2){
				System.out.println(userName+ " attacked.");}
		else {
			System.out.println(userName+ " ran away..."); //Attempt 1 at an if else code that functions based on user input, may be edited out later.
		} System.out.println("Choose an attack, 1 for attack, 2 for Cross Strike.");
		int attk = scan.nextInt();
		String atk_result = "N/A";
		int damage = 0;//initializing attack name and damage dealt
		if (attk == 1) {
			atk_result = "Attack";
			damage = 15;
		}
		if (attk == 2) {
			atk_result = "Cross Strike";
			damage = 45;
		} System.out.println(userName+ " used " + atk_result + ", you dealt " + damage + " damage.");
		int enemy_hp = 40 - damage;//damage calculation
		if (enemy_hp < 0) {
			System.out.println(userName+ " defeated the enemy!");
			player1Level = 2;
			System.out.println(userName +" has grown to level "+ player1Level +"!");
			System.out.println(userName +" has learned Energy Blast!");
		}
		if (enemy_hp > 0) {
			System.out.println("The enemy still stands.");//gives input on whether or not the enemy is defeated
		}
		int boss_hp = 200;
		System.out.println("A Dire Wolf appeared!");
		while (boss_hp > 0) {
			System.out.println("Choose an attack. (1): Attack, (2): Cross Slash (3): Energy Blast");
			int attk2 = scan.nextInt();
			if (attk2 == 1) {
				boss_hp = boss_hp-15;
				System.out.println(userName + " attacked! Dealt 15 damage to the Dire Wolf. Boss HP Remaining: " + boss_hp);
			} else if (attk2 == 2) {
				boss_hp = boss_hp-45;
				System.out.println(userName + " slashed with all their might! Dealt 45 damage to the Dire Wolf. Boss HP Remaining: " + boss_hp);
			} else if (attk2 == 3) {
				boss_hp = boss_hp-25;
				System.out.println(userName + " put out their hand, and a blast of energy engulfed the foe! Dealt 25 damage to the Dire Wolf. Boss HP Remaining: " + boss_hp);
			}
			
		} System.out.println(userName + " defeated the Dire Wolf!");
		player1Level += 1;
		System.out.println(userName + " grew to Level " + player1Level + "!");
		System.out.println(userName + " has learned Roulette Strike!");
		System.out.println("Roulette Strike is a unique attack, its power is randomized every time it is used.");
		
	} 

}
