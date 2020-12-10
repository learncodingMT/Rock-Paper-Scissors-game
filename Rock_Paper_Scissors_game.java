
import java.util.Scanner;
import java.util.Random;


public class Main
{
	public static void main(String[] args) {
	    Scanner obj = new Scanner(System.in);
	    Random rnObj = new Random();
	    int randNum = rnObj.nextInt((3-1)+1)+1;
	    System.out.println("How many round you want to play: ");
	    int roundInput = obj.nextInt();
	    
	    int i = 0, u = 0, c = 0;
	    while(i<roundInput){
	         System.out.println("Enter 1 for rock: ");
	         System.out.println("Enter 2 for scissers: ");
	         System.out.println("Enter 3 for paper: ");
	         int userInput = obj.nextInt();
    	    if(userInput == randNum){
    	     System.out.println("Match Tie because both choose same ");   
    	    }
    	    else if(userInput>randNum){
    	        if(randNum==1&&userInput==2){
    	            System.out.println("Computer win! because computer choose 1 = rock you choose scissers ");
    	            c++;
    	        }else if(randNum==1&&userInput==3){
    	            System.out.println("You win! because computer choose 1=rock ");
    	            u++;
    	        }else{
    	            System.out.println("computer win! because computer choose 2=scissers ");
    	            c++;
    	        }
    	    }
    	    else{
    	        if(randNum==2&&userInput==1){
    	            System.out.println("You win! because computer choose 2 = scissers you choose rock ");
    	            u++;
    	        }else if(randNum==3&&userInput==1){
    	            System.out.println("Computer win! because computer choose 3=paper ");
    	            c++;
    	        }else{
    	            System.out.println("You win! because computer choose 3=paper ");
    	            u++;
    	        }
    	    }
    	    i++;
	    }
		if(u==c){
		    System.out.println("Match Tie because Your point ="+u+" and Computer point = "+c);
		}else if(u>c){
		    System.out.println("You Win! because Your point = "+u+" Computer point = "+c);
		}else{
		    System.out.println("Computer Win! because Computer point = "+c+" Your point = "+u);
		}
	} 
}






