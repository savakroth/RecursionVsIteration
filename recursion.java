import java.util.Scanner;

public class recursion {
  public static void main(String[] args) {

    //initiating Scanner
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a String: ");
    String given_string = scanner.nextLine();

    //calling the function and printing output
    System.out.println("The reversed value of the given string is "+ recursionFunction(given_string));
   
  scanner.close();
  }
    
    public static String recursionFunction(String given_String){
      if (given_String.isEmpty()){
        return given_String;}
      //Calling Function Recursively
      return recursionFunction(given_String.substring(1)) + given_String.charAt(0);
    }
}
