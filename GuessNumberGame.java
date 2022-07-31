import java.util.Random;
import java.util.Scanner;

class Palyer{
  int n;
  String [] palyerName=new String[n];
	int number ;
	public int guessNumber() {
		Scanner scan =new Scanner(System.in);
		number =scan.nextInt();
		return number;
	}
}

class Guesser{
	int number;
	public int guessNumber() {
		Random rand =new Random();
		number = rand.nextInt(100);
		return number;
	}
}
class umpire{
	Scanner sc=new Scanner(System.in);
	int player1,player2,player3;
	Palyer palname=new Palyer();
	//
	Palyer [] player=new Palyer[5];
	void createPlayer() {
		System.out.println("Enter number player");
		palname.n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<palname.palyerName.length;i++) {
			System.out.printf("enter %dth palyer name \n",i+1);
			palname.palyerName[i]=sc.nextLine();
			
		}

	}
	}

class GuessNumberGame {
 public static void main(String [] args) {
	 
 }
}
