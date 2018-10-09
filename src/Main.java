import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    int input = 0;
    int factorial = 1;

    System.out.print("Enter number: ");
    input = keyboard.nextInt();

    for(int i=input; i>=1; i--){
      factorial = factorial * i;
    }

    System.out.println("The factorial of " + input + " is: " + factorial);

  }

}