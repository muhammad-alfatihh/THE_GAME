import java.util.ArrayList;
import java.util.Scanner;

public class inventory_test {
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> items = new ArrayList<String>();
    public static void main(String[] args) {
        System.out.println("Welcome traveler!\n");

        while (true) { 
            System.out.println("what would you like to do?");
            System.out.println("1. take the chest");
            System.out.println("2. see inventory");

            String choice_action = input.nextLine();
            if (choice_action.equals("1")) {
                take_chest();
            } 
            if (choice_action.equals("2"))  {
                see_inventory();
            }

        }

    }

    public static void take_chest() {
        System.out.println("you found:");
        System.out.println("1. goblet of greed");
        System.out.println("2. medusa's neclace");
        System.out.println("3. crown of the cursed king");
        System.out.println("insert the given number to take one artifact");
        String choose_artifacts = input.nextLine();

        switch(choose_artifacts) {
            case "1":
                System.out.println("you choose goblet of greed\n");
                items.add("goblet of greed");
                break;
            case "2":
                System.out.println("you choose medusa's neclase\n");
                items.add("medusa's neclase");
                break;
            case "3":
                System.out.println("you choose crown of the cursed king\n");
                items.add("crown of the cursed king");
                break;
        }


    }

    public static void see_inventory() {
        System.out.println("your inventory:");
        for (int i = 0; i < items.size(); i++ ) {
            System.out.println((i + 1) + ". " + items.get(i) );
        }
        System.out.println("continue?");
        String Continue = input.nextLine();
    }

}