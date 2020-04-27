
package dadjokegenerator;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 *  @Author: Lesly Brisson 
 *    @Date: 04/27/20 
 * @Updated: 04/27/20 
 *@FileName: DadJokeGenerator.java 
 * @Purpose: Program generates dad jokes for user or lets user pick a number to select a joke
 */

public class DadJokeGenerator {

    public static void main(String[] args) {
        int userSelection, pickJoke,generate;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String jokeOptions[] = {"\n1.Star Wars Joke\n"
                +"2.Photographer Joke\n"
                +"3.Random Joke\n"
                +"4.Stupid Joke\n"
                +"5.Food noodle\n"};
         
        System.out.println("Welcome to Dad Joke Generator!\n");
        System.out.println("Enter: \n1 if you want a joke at random or \n2 if you want to select the joke");
        userSelection = scanner.nextInt();
       
        if(userSelection == 2) {
            System.out.println("Select a joke between 1 -5\n"+ Arrays.toString(jokeOptions));
            pickJoke = scanner.nextInt();
            
            switch(pickJoke){
                case 1: 
                    System.out.println("How did Darth Vader know what Luke got him for Christmass?");
                    System.out.println("He felt his presents");
                    break;
                case 2:
                    System.out.println("Why did the picture go to jail?");
                    System.out.println("Because it was framed");
                    break;
                case 3:
                    System.out.println("What do you call somone with no body and no nose?'");
                    System.out.println("Nobody Knows");
                    break;
                case 4:
                    System.out.println("What has two butts and kills people?");
                    System.out.println("An assassin");
                    break;
                case 5:
                    System.out.println("What do you call a fake noodle?");
                    System.out.println("An Impasta");
                    break;
                default: break;
                         
            }   
        } else {
            generate = random.nextInt(5)+1;
            switch(generate){
                case 1: 
                    System.out.println("How did Darth Vader know what Luke got him for Christmass?");
                    System.out.println("He felt his presents");
                    break;
                case 2:
                    System.out.println("Why did the picture go to jail?");
                    System.out.println("Because it was framed");
                    break;
                case 3:
                    System.out.println("What do you call somone with no body and no nose?'");
                    System.out.println("Nobody Knows");
                    break;
                case 4:
                    System.out.println("What has two butts and kills people?");
                    System.out.println("An assassin");
                    break;
                case 5:
                    System.out.println("What do you call a fake noodle?");
                    System.out.println("An Impasta");
                    break;
                default: break;
            
            }
        
        }
    
    }
}
