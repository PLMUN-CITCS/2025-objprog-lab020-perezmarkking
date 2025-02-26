import java.util.Scanner;
public class MenuDrivenProgram{

    public static void checkEvenOrOdd(Scanner scanner) {
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println(number + " is an Even number.");
        } else {
            System.out.println(number + " is an Odd number.");
        }
    }
public static void main(String[] args) {
    
    Scanner user_choice = new Scanner(System.in);

    System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
        System.out.print("Enter your choice (1-3): ");
        int choice = user_choice.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Hello! Welcome!");
                break;
            case 2:
                checkEvenOrOdd(user_choice);
               break;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1 and 3.");

        }
}
}

