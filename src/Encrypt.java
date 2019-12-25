import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Encrypts the string or text file depending on the algorithm given
 */
public class Encrypt {
    HashMap<String, Algorithm> algorithms;
    public Encrypt(){
        this.algorithms = new HashMap<String, Algorithm>(5);
        this.algorithms.put("rot13", new Rot13());
    }

    /**
     * Encrypts the given File
     * @param input
     * @return String
     */
    public String encrypt(File input, String name){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter key: ");
        String key = scan.next();
        if(this.algorithms.containsKey(name)){
            String encryptedOutput = this.algorithms.get(name).encrypt(input,key);
            return encryptedOutput;
        } else {
            throw new RuntimeException("\""+input+"\"" + " algorithm does not exist.");
        }
    }


    /**
     * Encrypts the given string input
     * @param input
     * @return String
     */
    public String encrypt(String input, String name){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter key: ");
        String key = scan.next();
        if(this.algorithms.containsKey(name)){
            String encryptedOutput = this.algorithms.get(name).encrypt(input,key);
            return encryptedOutput;
        } else {
            throw new RuntimeException("\""+input+"\"" + " algorithm does not exist.");
        }
    }

    /**
     * Takes in input from the user
     * [Algorithm] [String/File Path]
     * @param args Contains users input
     */
    public static void main(String[] args){
        short len = (short)args.length;
        if (len < 2){
            throw new RuntimeException("Too few arguments entered.");
        } else {
            Encrypt encryptObject = new Encrypt();
            encryptObject.encrypt(args[1], args[0].toLowerCase());
        }
    }
}
