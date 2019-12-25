import java.io.File;

public class Rot13 implements Algorithm {
    public String encrypt(String input, String key){
        int shift =  Integer.getInteger(key).intValue();
        System.out.println("Key: " + shift);
        String output = "";
        return "";
    }
    public String encrypt(File input, String key){
        return "";
    }
    public String decrypt(String input, String key){
        return "";
    }
    public String decrypt(File input, String key){
        return "";
    }
}
