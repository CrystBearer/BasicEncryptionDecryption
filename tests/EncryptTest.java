import static org.junit.Assert.assertEquals;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Testing class for Encrypt Class
 */
public class EncryptTest {

    @Test
    public void encryptStringTest(){
//        assertEquals

    }

    @Test
    public void encryptFile13Test(){
        String expected = "";
        String output = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("Encrypted13.txt"));
            while(br.ready()){
                expected += br.readLine();
            }
            br.close();
        } catch(IOException e){
            System.out.println(e.getMessage());
        }
        assertEquals(expected,output);
    }

    @Test
    public void encryptFile24Test(){

    }

}
