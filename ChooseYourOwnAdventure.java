/*
 * need to do header
 */
import java.util.Scanner; //Import the scanner class

public class ChooseYourOwnAdventure
{
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) 
  {
    /* TO DO: 
    9 Possible paths (need more paths)
    Print statements depending on current and previous choices
    Else if
    */

    //Create answer variable
    String answer;
    //See if answer is valid
    boolean isValid = false;
    System.out.println("You enter the sacred igloo and immediately black out after experiencing a penetrating headache.");
    System.out.println("You wake up and look down to see that your hands have turned to flippers");
    //String test = sc.nextLine();
    //System.out.println(test);
    while (!isValid) {
      System.out.println("Do you accept your new life as a small adorable penguin (Y) or do you try to change back (N)?");
      answer = sc.nextLine();
      //Compound boolean expression
      if (answer.equalsIgnoreCase("Y") || answer.equalsIgnoreCase("N")) {
        //Nested if #1 + compound boolean expression
        if (!(answer.equalsIgnoreCase("Y") && answer.equalsIgnoreCase("N"))) {
          //Nested if #2
          if (answer.length() == 1) {
            isValid = true;
            System.out.println(isValid);
          }
        }
         else {
          System.out.println(isValid);
        } 
      }
    }
    
    answer = sc.nextLine();

  }
}
