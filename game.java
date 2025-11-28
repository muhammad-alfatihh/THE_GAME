import java.util.Scanner;

public class OOP {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome traveler!");

        while (true) { 
            System.out.println("what would you like to do?");
            System.out.println("1. take the chest");
            System.out.println("2. see inventory");

            String choice = input.nextLine();
            if (choice.equals("1")) {
                take_chest();
            }
        }

    }

    public static void take_chest() {
        System.out.println("you got a sword");
    }

}