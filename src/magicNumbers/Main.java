package magicNumbers;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        MagicNumberChecker readFile = new MagicNumberChecker();
        ExtensionChecker extensionChecker = new ExtensionChecker();


        File file = new File("lut.jpg");
        extensionChecker.checkExtension(file);





//        System.out.println(readFile.checkMagicNumberForImage(file));
//
//
//        File file2 = new File("mys.txt");
//        System.out.println(readFile.checkMagicNumberForTxt(file2));






    }



}
