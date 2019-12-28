import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.*;

/**
 * Testing class for Decrypt class
 */
public class DecryptTest {

    @Test
    public void decryptFile13Test(){
        String expected = "";
        String output = "";
        try {
            File actualFile = new File("tests/Decrypted13.txt");
            String currentDirectoryExpected = actualFile.getAbsolutePath();
            BufferedReader br = new BufferedReader(new FileReader(currentDirectoryExpected));
            while(br.ready()){
                expected += br.readLine();
            }
            br.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        Decrypt dec = new Decrypt();
        File file = new File("tests/Encrypted13.txt");
        String currentDirectory = file.getAbsolutePath();
        String input = "13";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        output = dec.decrypt(new File(currentDirectory), "rot13");
        assertEquals(expected,output);
    }

    @Test
    public void decryptFile24Test(){
        String expected = "";
        String output = "";
        try {
            File actualFile = new File("tests/Decrypted24.txt");
            String currentDirectoryExpected = actualFile.getAbsolutePath();
            BufferedReader br = new BufferedReader(new FileReader(currentDirectoryExpected));
            while(br.ready()){
                expected += br.readLine();
            }
            br.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        Decrypt dec = new Decrypt();
        File file = new File("tests/Encrypted24.txt");
        String currentDirectory = file.getAbsolutePath();
        String input = "24";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        output = dec.decrypt(new File(currentDirectory), "rot13");
        assertEquals(expected,output);
    }

    @Test
    public void decryptBaconianTest(){
        String expected = "";
        String output = "";
        try {
            File actualFile = new File("tests/DecryptedBaconian.txt");
            String currentDirectoryExpected = actualFile.getAbsolutePath();
            BufferedReader br = new BufferedReader(new FileReader(currentDirectoryExpected));
            while(br.ready()){
                expected += br.readLine();
            }
            br.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        Encrypt enc = new Encrypt();
        File file = new File("tests/EncryptedBaconian.txt");
        String currentDirectory = file.getAbsolutePath();
        String input = "";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        output = enc.encrypt(new File(currentDirectory), "bacon");
        assertEquals(expected,output);

    }

}
