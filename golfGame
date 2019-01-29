package javaPrograms;
import java.util.*;//import utility module
public class golfGame {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);//create input for user
		//get from user the par of the green
		System.out.println("What is the par of the green?");//output for user
		int par = input.nextInt();//input from user
		//get the stroke the user played
		System.out.println("What stroke did you play?");//output for user
		int stroke = input.nextInt();//input from user
		
		
		if (stroke == 1) {//if the player stroke is 1 it is a hole-in-one
			System.out.println("WOW that is a HOLE-IN-ONE!");
		
		
		}else if (stroke == par-1){//if the player stroke is 1 below par it's a birdie
			System.out.println("Well done that is a BIRDIE!");
		
		}else if (stroke == par-2) {//if the player stroke is 2 below par it's a eagle
			System.out.println("Good job that is a EAGLE!");
		
		}else if (stroke == par-3) {//if the players stroke is 3 below par it's a albatros
			System.out.println("Amazing stroke that is a ALBATROS!");
		
		}else if (stroke == par) {//if the players stroke is the same as par it is par
			System.out.println("At least you are PAR!");
		
		}else if (stroke == par+1) {//if the players stroke is one above par it's a bogey
			System.out.println("Oh no that is a BOGEY!");
		
		}else if (stroke == par+2) {//if the players stroke is two above par it's a double bogey
			System.out.println("OOPS that is a DOUBLE BOGEY!");
		
		}else{//if the players stroke is three or more above par it's quit
			System.out.println("I think you should hang up your clubs and go home!");
		}
		input.close();
	}

}
