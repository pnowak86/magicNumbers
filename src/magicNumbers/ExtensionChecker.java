package magicNumbers;

import java.io.File;

public class ExtensionChecker {

    public boolean checkExtension(File file) {
        String fileName = file.getName().toLowerCase();


        if (fileName.endsWith(".jpg")) {
            System.out.println("File is jpg");
            return true;
        }
        if (fileName.endsWith(".png")) {
            System.out.println("File is a png");
            return true;
        }
        if (fileName.endsWith(".gif")) {
            System.out.println("File is a gif");
            return true;
        }

        if (fileName.endsWith(".txt")) {
            System.out.println("File is a txt");
            return true;
        }

        String[] arrayFromFileName = fileName.split("\\.");

        System.out.println("file is not supported!, extension is: " + arrayFromFileName[1]);
        return false;

    }

}
