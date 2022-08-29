import java.util.Random;
import java.util.Scanner;

class Palyer{
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

    int num1,num2,num3,originalNumber;
    Palyer p1=new Palyer();
    Palyer p2=new Palyer();
    Palyer p3=new Palyer();
    public void collectPalyerNumber(){
        System.out.println("enter player1 ");
        num1=p1.guessNumber();
        System.out.println("enter player2 ");
        num2=p2.guessNumber();
        System.out.println("enter player3 ");
        num3=p3.guessNumber();
    }


    public void collectGuessNumber(){
        Guesser g =new Guesser();
        originalNumber=g.guessNumber();

    }
    public void makeWinner(){
        System.out.println("YOU HAVE 10 CHANCE,GUESS THE NUMBER  ");
        collectGuessNumber();
        collectPalyerNumber();

        for(int i=0;i<10;i++){
            if(originalNumber==num1){
                if(originalNumber==num2 && originalNumber==num3){
                    System.out.println("all player guess correct number");
                    break;
                }
                else if(originalNumber==num2){
                    System.out.println("player 1 & 2 guess correct number");
                    break;
                }
                else if(originalNumber==num3){
                    System.out.println("player 1 & 3 guess correct number");
                    break;
                }
                else{
                    System.out.println("player1 is the winner");
                    break;
                }
            }
            else if(originalNumber==num2){
                if(originalNumber==num3){
                    System.out.println("player 2 & 3 is winner");
                    break;
                }
                else
                    System.out.println("player 2 is winner");
                break;
            }
            else if(originalNumber==num3){
                System.out.println("player 3 is winner");
                break;
            }
            else{
                System.out.println("TRY again !");
            }

            System.out.printf("%dth chance left\n",10-i-1);
            collectPalyerNumber();
        }
    }

}

class GuessNumberGame {
    public static void main(String [] args) {
        umpire start =new umpire();
        start.makeWinner();
    }
}
