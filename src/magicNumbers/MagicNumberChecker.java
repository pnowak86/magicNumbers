package magicNumbers;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class MagicNumberChecker {

    public boolean checkMagicNumberForImage(File file) {

        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

            int fileSignature = input.readInt();

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

        byte[] type1Check = new byte[6];
        type1Check[0] = 'G';
        type1Check[1] = 'I';
        type1Check[2] = 'F';
        type1Check[3] = '8';
        type1Check[4] = '7';
        type1Check[5] = 'a';

        byte[] type2Check = new byte[6];
        type2Check[0] = 'G';
        type2Check[1] = 'I';
        type2Check[2] = 'F';
        type2Check[3] = '8';
        type2Check[4] = '9';
        type2Check[5] = 'a';


        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {
            input.read(b, 0, 6);

        } catch (IOException e) {
            e.printStackTrace();
        }
        if (Arrays.equals(b, type1Check) || Arrays.equals(b, type2Check)) {

            return true;
        }

        return false;
    }

}