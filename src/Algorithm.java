import java.io.File;
public interface Algorithm {
    String encrypt(String input, String key);
    String decrypt(String input, String key);
    String encrypt(File input, String key);
    String decrypt(File input, String key);
}
