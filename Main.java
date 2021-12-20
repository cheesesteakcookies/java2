
/**
    Samuel Yousey, CIS219, Tuesdays and Thursdays at 3:30 PM
 */
import java.util.Scanner;  // Import the Scanner class
import java.time.*; // Import the LocalDate class and everything else
class Main {
    public static void grabInput(){
    //initialize variables
    String userdate;
    Scanner date = new Scanner(System.in);  // Create a Scanner object
    // accept user input
    System.out.println("Enter date of birth in yyyy-mm-dd format");
    // checks user input for errors
    try{
        //check date inputted
        userdate = date.next();
        //create LocalDate object
        LocalDate Dob;
        Dob = LocalDate.parse(userdate); //parse given data
        //Print out calculated information
        System.out.println("Date of birth is: " + Dob);
        System.out.println("Your birth month is: " + Dob.getMonth());
        //Checks the month and prints an appropriate message to the user.
        switch(Dob.getMonth()){
            case JANUARY:
                System.out.println("Enjoy having your birthday during the month of January. Have fun at the start of the new year");
                break;
            case FEBRUARY:
                System.out.println("Enjoy having your birthday during the month of February; good luck if your birthday is on leap day");
                break;
            case MARCH:
                System.out.println("Enjoy having your birthday during the month of March; enjoy St. Patrick's day as well");
                break;
            case APRIL:
                System.out.println("Enjoy having your birthday during the month of April; enjoy pranks and tomfoolery");
                break;
            case MAY:
                System.out.println("Enjoy having your birthday during the month of May; enjoy spring");
                break;
            case JUNE:
                System.out.println("Enjoy having your birthday during the month of June; enjoy cookouts and whatnot");
                break;
            case JULY:
                System.out.println("Enjoy having your birthday during the month of July; enjoy Independance day as well");
                break;
            case AUGUST:
                System.out.println("Enjoy having your birthday during the month of August; enjoy International Pirate Month");
                break;
            case SEPTEMBER:
                System.out.println("Enjoy having your birthday during the month of September; enjoy preparations for fall");
                break;
            case OCTOBER:
                System.out.println("Enjoy having your birthday during the month of October and enjoy Halloween");
                break;
            case NOVEMBER:
                System.out.println("Enjoy having your birthday during the month of November and enjoy Thanksgiving");
                break;
            case DECEMBER:
                System.out.println("Enjoy having your birthday during the month of December and enjoy Christmas");
                break;
        }
        System.out.println("Your age is: " + calcAge(Dob));
    } catch (Exception e){
        // if format was not followed an error will occur and it will prompt again
        System.out.println("Your format is invalid, please try again");
        grabInput();
    }
}
// code from https://www.codespeedy.com/calculate-age-from-date-of-birth-in-java/
static int calcAge(LocalDate Dob)
    {
        //calculates the users age
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(Dob,currentDate).getYears();
        return age;
    }
    
  public static void main(String[] args) {
      //calls grabInput method
      grabInput();
  }
}
