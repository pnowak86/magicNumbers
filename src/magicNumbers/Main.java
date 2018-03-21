package magicNumbers;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MagicNumberChecker magicNumberChecker = new MagicNumberChecker();
        ExtensionChecker extensionChecker = new ExtensionChecker();
        Scanner scanner = new Scanner(System.in);

        File file1 = new File("xx.hhh");
        extensionChecker.checkExtension(file1);

        boolean running = true;

        System.out.println("Welcome to file validator, please enter a path to file");
        String filePath = scanner.nextLine();
        File file = new File(filePath);
        while (running) {
            System.out.println("Please check how you want to check your file:");
            System.out.println("1. Type 'mg' to check by magic number \n" +
                    "2. Type 'ext' to check extension\n" +
                    "3. Type 'q' to quit\n");
            System.out.print("Your choice: ");
            String option = scanner.nextLine();

            switch (option) {
                case "mg":
                    magicNumberChecker.checkMagicNumberForImage(file);
                    break;
                case "ext":
                    extensionChecker.checkExtension(file);
                    break;
                case "q":
                    running = false;
                    System.out.println("Thank you! Goodbye!");
                    break;
                default:
                    System.out.println("Wrong input, please try again!");
                    break;

            }
        }
    }
}
