
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
        int userSelection,computerSelection, pickJoke,generate;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String jokeOptions[] = {"\n1.Star Wars Jokes\n"
                +"2.Animal Jokes\n"
                +"3.Random Jokes\n"
                +"4.Food-Related Jokes\n"
                +"5.Space Jokes\n"};
         
        System.out.println("Welcome to Dad Joke Generator!\n");
        System.out.println("Enter: \n1 if you want a joke at random or \n2 if you want to select the joke");
        System.out.print("\nUser Selection: ");
        userSelection = scanner.nextInt();
       
        if(userSelection == 2) {
            System.out.println("Select a joke between 1 -5\n"+ Arrays.toString(jokeOptions)+"\n");
            System.out.print("User Selection: ");
            pickJoke = scanner.nextInt();
            
            switch(pickJoke){
                case 1: 
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("What did the Sith say when he was taking a selfie");
                        System.out.println("Make sure you get my dark side");
                    } else if(generate==2){
                        System.out.println("Why didn't the princess enjoy the wookie's recipe?");
                        System.out.println("Because it was chewy");
                    } else if(generate==3) {
                        System.out.println("What kind of cars do jedi's drive?");
                        System.out.println("A toy-yoda");
                    } else if(generate==4) {
                        System.out.println("Which program do jedi's save PDF files?");
                        System.out.println("Adobe -Wan Kenobi");
                    } else if(generate==5) {
                        System.out.println("Why do Stromgtroopers buy iphones?");
                        System.out.println("Because they couldn't find the droids");
                    }
                    break;
                case 2:
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("Why couldn't the leopard play hide and seek?");
                        System.out.println("Because he was always spotted!");
                    } else if(generate==2){
                        System.out.println("What do you call a rabbit that has fleas?");
                        System.out.println("Bugs bunny.");
                    } else if(generate==3) {
                        System.out.println("What did the duck say when he bought lipstick?");
                        System.out.println("He said, \"Put it on my bill.\"");
                    } else if(generate==4) {
                        System.out.println("What do you call a dog that can do magic?");
                        System.out.println("A labra-Cadabra-Dor");
                    } else if(generate==5) {
                        System.out.println("What happens to a frog’s car when it breaks down?");
                        System.out.println("It gets toad away.");
                    }
                    break;
                case 3:
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("What do you call a man with no body and no nose?");
                        System.out.println("Nobody knows");
                    } else if(generate==2){
                        System.out.println("What kind of tissue can you sleep on?");
                        System.out.println("A nap-kin");
                    } else if(generate==3) {
                        System.out.println("What of shoes do spies wear to work?");
                        System.out.println("Sneakers");
                    } else if(generate==4) {
                        System.out.println("What do you call a hippies wife");
                        System.out.println("Mississ-hippie");
                    } else if(generate==5) {
                        System.out.println("What do you call a man that can't stand up?");
                        System.out.println("Kneel");
                    }
                    break;
                case 4:
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("What do you call an ambitious vegetable?");
                        System.out.println("Hustle sprouts");
                    } else if(generate==2){
                        System.out.println("What do you call cheese that isn’t yours?");
                        System.out.println("Nacho cheese!");
                    } else if(generate==3) {
                        System.out.println("What do you call a pig in a karate class?");
                        System.out.println("A pork chop");
                    } else if(generate==4) {
                        System.out.println("What do you call a fake noodle?");
                        System.out.println("An Impasta");
                    } else if(generate==5) {
                        System.out.println("Why did the tomato blush?");
                        System.out.println("Because it saw the salad dressing!");
                    }
                    break;
                case 5:
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("Why don't aliens visit our planet?");
                        System.out.println("Terrible ratings. One star");
                    } else if(generate==2){
                        System.out.println("What did E.T.'s mother say to him when he got home?");
                        System.out.println("Where on Earth have you been?!");
                    } else if(generate==3) {
                        System.out.println("How do you know when the moon has enough to eat?");
                        System.out.println("When it’s full");
                    } else if(generate==4) {
                        System.out.println("What did the alien say to the garden?");
                        System.out.println("Take me to your weeder!");
                    } else if(generate==5) {
                        System.out.println(" What kind of music do planets sing?");
                        System.out.println("Neptunes!");
                    }
                    break;
                default: break;
                         
            }   
        } 
        
        if(userSelection==1){
            computerSelection = random.nextInt(5)+1;
            switch(computerSelection){
                case 1: 
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("What did the Sith say when he was taking a selfie");
                        System.out.println("Make sure you get my dark side");
                    } else if(generate==2){
                        System.out.println("Why didn't the princess enjoy the wookie's recipe?");
                        System.out.println("Because it was chewy");
                    } else if(generate==3) {
                        System.out.println("What kind of cars do jedi's drive?");
                        System.out.println("A toy-yoda");
                    } else if(generate==4) {
                        System.out.println("Which program do jedi's save PDF files?");
                        System.out.println("Adobe -Wan Kenobi");
                    } else if(generate==5) {
                        System.out.println("Why do Stromgtroopers buy iphones?");
                        System.out.println("Because they couldn't find the droids");
                    }
                    break;  
                case 2:
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("Why couldn't the leopard play hide and seek?");
                        System.out.println("Because he was always spotted!");
                    } else if(generate==2){
                        System.out.println("What do you call a rabbit that has fleas?");
                        System.out.println("Bugs bunny.");
                    } else if(generate==3) {
                        System.out.println("What did the duck say when he bought lipstick?");
                        System.out.println("He said, \"Put it on my bill.\"");
                    } else if(generate==4) {
                        System.out.println("What do you call a dog that can do magic?");
                        System.out.println("A labra-Cadabra-Dor");
                    } else if(generate==5) {
                        System.out.println("What happens to a frog’s car when it breaks down?");
                        System.out.println("It gets toad away.");
                    }
                    break;
                case 3:
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("What do you call a man with no body and no nose?");
                        System.out.println("Nobody knows");
                    } else if(generate==2){
                        System.out.println("What kind of tissue can you sleep on?");
                        System.out.println("A nap-kin");
                    } else if(generate==3) {
                        System.out.println("What of shoes do spies wear to work?");
                        System.out.println("Sneakers");
                    } else if(generate==4) {
                        System.out.println("What do you call a hippies wife");
                        System.out.println("Mississ-hippie");
                    } else if(generate==5) {
                        System.out.println("What do you call a man that can't stand up?");
                        System.out.println("Kneel");
                    }
                    break;
                case 4:
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("What do you call an ambitious vegetable?");
                        System.out.println("Hustle sprouts");
                    } else if(generate==2){
                        System.out.println("What do you call cheese that isn’t yours?");
                        System.out.println("Nacho cheese!");
                    } else if(generate==3) {
                        System.out.println("What do you call a pig in a karate class?");
                        System.out.println("A pork chop");
                    } else if(generate==4) {
                        System.out.println("What do you call a fake noodle?");
                        System.out.println("An Impasta");
                    } else if(generate==5) {
                        System.out.println("Why did the tomato blush?");
                        System.out.println("Because it saw the salad dressing!");
                    }
                    break;
                case 5:
                    generate = random.nextInt(5)+1;
                    if(generate==1){
                        System.out.println("Why don't aliens visit our planet?");
                        System.out.println("Terrible ratings. One star");
                    } else if(generate==2){
                        System.out.println("What did E.T.'s mother say to him when he got home?");
                        System.out.println("Where on Earth have you been?!");
                    } else if(generate==3) {
                        System.out.println("How do you know when the moon has enough to eat?");
                        System.out.println("When it’s full");
                    } else if(generate==4) {
                        System.out.println("What did the alien say to the garden?");
                        System.out.println("Take me to your weeder!");
                    } else if(generate==5) {
                        System.out.println(" What kind of music do planets sing?");
                        System.out.println("Neptunes!");
                    }
                    break;
                default: break;            
            }
        }
    }
}
