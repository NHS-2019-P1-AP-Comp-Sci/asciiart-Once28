/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using
 * ASCII (American Standard Code for Information Interchange). Using the already
 * created file named `ASCIIArt.java` write a program that outputs your artwork
 * to the console. The goal of this project is to use ONLY what we have learned
 * in Unit 1 to create anything you would like so be creative (and school
 * appropriate). Artwork must also have a caption describing what it's
 * depicting.
 * 
 * For those of you who have dabbled in coding before, try to contain your code
 * to just what we have discussed in this unit.
 * 
 * @author Mr. Rasmussen
 *
 */

// YOU CODE HERE :) 

public class ASCIIArt {
	public static void androidEyes() {
		System.out.println("    /O  .  O\\ / |"); // prints out the head of the robot
	}

	public static void androidWings() {// arms of the android
		System.out.println("                |");
	}

	public static void androidBowTie() {
		System.out.println("    | <>o<> |");
	}

	public static void androidBody() {
		System.out.println(" |  |       |");// prints the side of the robot
	}

	public static void androidBodyEnd() {
		System.out.println("    |_______|");// finishes the body of the robot
	}

	public static void androidFeet() {
		System.out.println("     |     | ");// two feet
	}

	public static void androidEars() {
		System.out.println("    \\_______/  /|");// arm extension and also the two antennas
	}

	public static void appleTop() {
		System.out.print("\t|\n\t|\n");// the stem of the apple
	}

	public static void appleBot() {
		System.out.println("   ((((( ))))");// used for both first and last layer of apple
	}

	public static void appleMid() {
		System.out.println("  (((((( ))))))");// the middle filling of the apple
	}
	public static void balloon() {
		System.out.println("\t       /_\\");
	}
	
	public static void tip() {
		System.out.println("               /^\\");
	}
	public static void main(String[] args) {
		System.out.println("______________________");
		appleTop();
		appleBot();
		appleMid();
		appleMid();
		appleBot();
		tip();
		balloon();
		androidWings();
		androidEars();
		androidEyes();
		androidBowTie();
		androidBody();
		androidBody();
		androidBody();
		androidBodyEnd();
		androidFeet();

		System.out.println("\nA samurai under a lantern.");
	}
}