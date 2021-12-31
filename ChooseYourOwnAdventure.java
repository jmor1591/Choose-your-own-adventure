/*
 * need to do header
 */
import java.util.Scanner; //Import the scanner class

public class ChooseYourOwnAdventure
{
static Scanner sc = new Scanner(System.in);
//new scanner object
public static String getUserInput(String a, String b) {
   Scanner sc = new Scanner(System.in);
  
   //asks user for the user to input a string
   System.out.println("Enter either " + a + " or " + b);

   //records what the user types
   String userInput = sc.nextLine();

   //closes scanner
   sc.close();

   //returns the user's input as a string
   return userInput;
}  

public static int poseQuestion(String question, String possibleResponseA, String possibleResponseB) {
  System.out.println(question);
  String userChoice = getUserInput(possibleResponseA, possibleResponseB);
  if (userChoice.equalsIgnoreCase(possibleResponseA)) {
    return 1;
  }
  else if (userChoice.equalsIgnoreCase(possibleResponseB)) {
    return 2;
  }
  else { 
    System.out.println("You must type in one of the two options!");
    return 3;
  }
}

public static void main(String[] args) 
  {
    /* TO DO: 
    9 Possible paths (need more paths)
    Print statements depending on current and previous choices
    Else if
    */

    //Create answer variable
    String answer;
    //which inital path is taken
    boolean penguinPath = false;
    //See if answer is valid
    boolean isValid = false;
    System.out.println("You enter the sacred igloo and immediately black out after experiencing a penetrating headache.");
    System.out.println("You wake up and look down to see that your hands have turned to flippers");
    //String test = sc.nextLine();
    //System.out.println(test);

    while (!isValid) {
      System.out.println("Do you accept your new life as a small adorable penguin (Y) or do you try to change back into a human (N)?");
      answer = sc.nextLine().toUpperCase();
      //Compound boolean expression
      if (answer.equals("Y") || answer.equals("N")) {
        isValid = true;       
        //Nested if #1   
        if (answer.equalsIgnoreCase("Y")) { 
          System.out.println("Hooray! Welcome to a life of fish, feathers, and flippers!");
          penguinPath = true;
        }
        //Nested if #2
        if (answer.equalsIgnoreCase("N")) {
          System.out.println("Yeah penguins to smell pretty bad, understandable.");
          penguinPath = false;
        }
      }
    }
    //more legible code starts
    int userResult = 3;

    //Path of the Penguin-Embracer
    if (penguinPath) {
      System.out.println("Havent finished yet");
    }

    //Path back to Humanity
    else if(!penguinPath) {
      System.out.println("Starting your journey back to having opposable thumbs, you see a group of chattering penguins and the cool, deep waters of the ocean");
      while (userResult == 3) {
        userResult = poseQuestion("Walk to the group of penguins (1) or search for a solution in the ocean (2)?", "1", "2");
      }
      if (userResult == 1) {
        System.out.println("You walk over to the group of penguins, skeptical in your squawks as you only Minored in Penglish while in college.");
        System.out.println("To your surprise, they seem to be speaking fluent English (very convenient). As you are a no nonsense once-human-penguin, you ask the most important looking penguin why you were forced to changed species.");
        //to be continued
      }
    }
  }
}