package magicNumbers;

import java.io.*;

public class MagicNumberChecker {

    public boolean checkMagicNumberForImage(File file) {

        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

            int fileSignature = input.readInt();

            if (fileSignature == 0xffd8ffe0) {
                System.out.println("File is a JPG");
                return true;
            } else if (fileSignature == 0x89504E47) {
                System.out.println("File is a PNG");
                return true;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }

    public boolean checkMagicNumberForTxt(File file){
        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

            int fileSignature = input.readInt();

            if(true){
                System.out.println("file is txt");
                return true;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;

    }

}
