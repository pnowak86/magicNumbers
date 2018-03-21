package magicNumbers;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class MagicNumberChecker {

    public boolean checkMagicNumberForImage(File file) {

        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

            int fileSignature = input.readInt();
            input.reset();
            boolean isGif = checkIfFileIsGif(file);
            
            if (fileSignature == 0xffd8ffe0) {
                System.out.println("File is a JPG");
                return true;
            } else if (fileSignature == 0x89504E47) {
                System.out.println("File is a PNG");
                return true;
            } else if (isGif) {
                System.out.println("File is a GIF");
                return true;
            } else if (fileSignature == 0x464F524D) {
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


    public boolean checkIfFileIsGif(File file) {
        byte[] b = new byte[6];

        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            input.read(b, 0, 6);
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (b[0] == 'G' && b[1] == 'I' && b[2] == 'F' && b[3] == '8' && (b[4] == '7' || b[4] == '9') && b[5] != 'a') {
            return true;
        }
        return false;
    }

}
