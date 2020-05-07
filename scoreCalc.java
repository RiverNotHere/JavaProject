package scoreCalc;
import java.util.Scanner;
/*
 * @category tools
 * @author o0River0o
 * @version v0.1.0
 */
public class scoreCalc {
    public static void main(String[] args) {
        String name;
        int score;
        int count = 0;
        int d;
        int sum;
        int hrs;
        String didUse;
        int left;
        int useHrs;
        int leftScore;
        String gender;

        Scanner input = new Scanner(System.in);
            sum = 0;
            System.out.println("*****Please fill in the informations needed*****");
            System.out.print("Please type in the name of score owner: ");
            name = input.nextLine();
            System.out.print("Please type in the gender of the score owner: ");
            gender = input.nextLine();
            if(gender.equals("M") || gender.equals("Male")) {
            	gender = "He";
            }else if(gender.equals("F") || gender.equals("Female")) {
            	gender = "She";
            }
            System.out.println("");
            for(count = 1; count <= 5; count++){
                System.out.print("Please type in the total score for Day"+ count + ": ");
                score = Integer.parseInt(input.nextLine());
                sum = sum + score;
            }
            hrs = sum/10;
            System.out.println(name + "'s final score was: " + sum);
            System.out.println(gender + " can play for " + hrs +" hours!");
            System.out.println("Do you want to use your score for time?(y/n)");
            didUse = input.nextLine();
            	if(didUse.equals("y")){
            		System.out.println("How many hours you want to use?");
            		useHrs = Integer.parseInt(input.nextLine());
            		if(useHrs > hrs){
            			System.out.println("You don't have that much time!");
            		}else{
            			left = (sum - (useHrs*10))/10;
            			sum -= useHrs*10;
            			leftScore = sum-left*10;
            			System.out.println("Have a good time playing "+ name + "! You have " + left + " hours and "+leftScore+" scores left.");
            			System.out.println("-----Thanks for using the calculator!-----");
            			System.out.println("copyright (c) 2020 Tech Galleries. All rights reserved.");
            		}
            	}else if(didUse.equals("n")){
                	System.out.println("Alright, have a good day!");
                	System.out.println("---------Thanks for using the calculator!---------");
        			System.out.println("copyright (c) 2020 Tech Galleries. All rights reserved.");
                }
   
            	}
    }	