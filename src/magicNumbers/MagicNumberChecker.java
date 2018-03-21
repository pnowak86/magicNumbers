package magicNumbers;

import java.io.*;
import java.math.BigInteger;
import java.util.Arrays;

public class MagicNumberChecker {

    public boolean checkMagicNumberForImage(File file) {

        try (DataInputStream input = new DataInputStream(new BufferedInputStream(new FileInputStream(file)))) {

            int fileSignature = input.readInt();
            input.reset();
            byte[] b = new byte[8];
            input.read(b, 0, 8);
            if (fileSignature == 0xffd8ffe0) {
                System.out.println("File is a JPG");
                return true;
            } else if (fileSignature == 0x89504E47) {
                System.out.println("File is a PNG");
                return true;
            } else if (Arrays.equals(b, new BigInteger("474946383761", 16).toByteArray())) {
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


}
