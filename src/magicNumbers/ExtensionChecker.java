package magicNumbers;

import java.io.File;

public class ExtensionChecker {

    public boolean checkExtension(File file){

        if(file.getName().endsWith(".jpg")){
            System.out.println("File is jpg");
            return true;
        }
        if(file.getName().endsWith(".png")){
            System.out.println("File is a png");
            return true;
        }
        if (file.getName().endsWith(".txt")){
            System.out.println("File is a txt");
        return true;
        }

        System.out.println("file is not supported!");
        return false;

    }

}
