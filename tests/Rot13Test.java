import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Rot13Test {

    @Test(timeout=1000)
    public void encryptTest(){
        String expected = "T lmhbv'l znbwx mh Ixtvx hy Fbgw: Tgmbwhmx mh Tgqbxmr";
        Algorithm algo = new Rot13();
        String inputString = "A stoic's guide to Peace of Mind: Antidote to Anxiety";
        String key = "19";
        String outputString = algo.encrypt(inputString, key);
        assertEquals(expected, outputString);
    }

    @Test(timeout=1000)
    public void decryptTest(){
        String expected = "A stoic's guide to Peace of Mind: Antidote to Anxiety";
        Algorithm algo = new Rot13();
        String inputString = "T lmhbv'l znbwx mh Ixtvx hy Fbgw: Tgmbwhmx mh Tgqbxmr";
        String key = "19";
        String outputString = algo.decrypt(inputString, key);
        assertEquals(expected, outputString);
    }

}
