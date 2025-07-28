import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		while(true) {
			System.out.println("The number has been generated.");
			int num = new Random().nextInt(100)+1;
			int chance = 10;
			int guess;
			while(chance != 0) {
				System.out.print("Enter the guess : ");
				guess = sc.nextInt();
				if(guess == num) {
					chance--;
					System.out.println("Correct!");
					break;
				}
				else if (guess > num ) System.out.println("Too high");
				else if (guess < num ) System.out.println("Too low");
				chance--;
				System.out.println("Chances left : "+chance);
			}
			int score = chance + 1;
			if(chance == 0) System.out.println("Out of chances , the number : "+num);
			if(chance==9) System.out.println("Marvelous, score : "+score);
			else if(chance <= 5 && chance !=0) System.out.println("Good job , could have been better! , score : "+score);
			else if(chance > 5 && chance !=0 ) System.out.println("Nice work , score : "+score);

			System.out.println("Choose : \n1. Try again\n2. Exit");
			int choice = sc.nextInt();
			if (choice==2) {
				System.out.println("Thanks for playing the game");
				break;
			}
		}
	}
}
