import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Rot13 implements Algorithm {
    public String encrypt(String input, String key){
        String output = "";
        int shift =  Integer.parseInt(key);
        for(char s: input.toCharArray()){
            if(!Character.isAlphabetic(s)) {
                output += s;
                continue;
            } else {
                int sum = s + shift;
                char o =(char) (sum);
                if(sum > (int) 'z' && !Character.isUpperCase(s) || sum > (int) 'Z' && Character.isUpperCase(s)) {
                    o = (char)(o - 26);
                }
                output += o;
            }
        }
        return output;
    }

    public String decrypt(String input, String key){
        String output = "";
        int shift =  Integer.parseInt(key);
        for(char s: input.toCharArray()){
            if(!Character.isAlphabetic(s)) {
                output += s;
                continue;
            } else {
                int sum = s - shift;
                char o =(char) (sum);
                if(sum < (int) 'a' && !Character.isUpperCase(s) || sum < (int) 'A' && Character.isUpperCase(s)) {
                    o = (char)(o + 26);
                }
                output += o;
            }
        }
        return output;
    }

}
