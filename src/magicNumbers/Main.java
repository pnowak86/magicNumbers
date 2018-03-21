package magicNumbers;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MagicNumberChecker readFile = new MagicNumberChecker();
        ExtensionChecker extensionChecker = new ExtensionChecker();
        Scanner scanner = new Scanner(System.in);

        File file = new File("xx.hhh");
        extensionChecker.checkExtension(file);

        boolean running = true;

        System.out.println("Welcome to file validator, please enter a path to file");
            String filePath = scanner.nextLine();

            while (running){
                System.out.println("Please check how you want to check your file:");
                System.out.println("1. type 'mg' to check by magic number \n" +
                        "2.type 'ext' to check extension");

            }










//        System.out.println(readFile.checkMagicNumberForImage(file));
//
//
//        File file2 = new File("mys.txt");
//        System.out.println(readFile.checkMagicNumberForTxt(file2));






    }



}
