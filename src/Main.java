import java.util.Scanner;

/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: Allen Wang
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        String firstName;
        String favouriteFood;
        System.out.println("Enter your age: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter your name: ");
        firstName = scanner.nextLine();
        System.out.println("Enter your favourite food: ");
        favouriteFood = scanner.nextLine();
        System.out.println("Name: " + firstName + "\nAge: " + age + "\nFavourite food: " + favouriteFood);
    }

}
