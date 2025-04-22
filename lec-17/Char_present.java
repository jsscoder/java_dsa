import java.util.Scanner;

class Char_present {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Input the string
    System.out.print("Enter a string: ");
    String inputString = scanner.nextLine();

    // Input the character to search for
    System.out.print("Enter a character to check: ");
    char targetChar = scanner.next().charAt(0);

    // Check if the character is present in the string
    boolean isPresent = inputString.indexOf(targetChar) != -1;

    // Output the result
    if (isPresent) {
      System.out.println("The character '" + targetChar + "' is present in the string.");
    } else {
      System.out.println("The character '" + targetChar + "' is not present in the string.");
    }

    scanner.close();
  }
}