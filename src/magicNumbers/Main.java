package magicNumbers;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        MagicNumberChecker readFile = new MagicNumberChecker();

        File file = new File("lut.jpg");

        System.out.println(readFile.readFiletoCheck(file));


    }



}
