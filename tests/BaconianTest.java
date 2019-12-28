import org.junit.Test;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BaconianTest {

        @Test(timeout=1000)
        public void encryptTest(){
            String expected = "AAAAA BAABABAABBABBBAABAAAAAABA BAABA AABBABABAAABAAAAAABBAABAA BAABBABBBA ABBBBAABAAAAAAAAAABAAABAA ABBBAAABAB ABBAAABAAAABBABAAABB AAAAAABBABBAABBABAAAAAABBABBBABAABBAABAA BAABBABBBA AAAAAABBABBABBBABAAAAABAABAABBBBAAA";
            Algorithm algo = new BaconianCipher();
            String inputString = "A stoic's guide to Peace of Mind: Antidote to Anxiety";
            String key = "";
            String outputString = algo.encrypt(inputString, key);
            assertEquals(expected, outputString);
        }

        @Test(timeout=1000)
        public void decryptTest(){
            String expected = "A stoic's guide to Peace of Mind: Antidote to Anxiety";
            Algorithm algo = new BaconianCipher();
            String inputString = "AAAAA BAABABAABBABBBAABAAAAAABA BAABA AABBABABAAABAAAAAABBAABAA BAABBABBBA ABBBBAABAAAAAAAAAABAAABAA ABBBAAABAB ABBAAABAAAABBABAAABB AAAAAABBABBAABBABAAAAAABBABBBABAABBAABAA BAABBABBBA AAAAAABBABBABBBABAAAAABAABAABBBBAAA";
            String key = "";
            String outputString = algo.decrypt(inputString, key);
            assertEquals(expected, outputString);
        }


}
