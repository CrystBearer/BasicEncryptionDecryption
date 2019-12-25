import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Decrypt {
    HashMap<String, Algorithm> algorithms;
    public Decrypt(){
        this.algorithms = new HashMap<String, Algorithm>(5);
        this.algorithms.put("rot13", new Rot13());
    }

    /**
     * Decrypts the given File
     * @param input
     * @return String
     */
    public String decrypt(File input, String name){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter key: ");
        String key = scan.next();
        if(this.algorithms.containsKey(name)){
            String decryptedOutput = this.algorithms.get(name).decrypt(input,key);
            return decryptedOutput;
        } else {
            throw new RuntimeException("\""+input+"\"" + " algorithm does not exist.");
        }
    }


    /**
     * Decrypts the given string input
     * @param input
     * @return String
     */
    public String decrypt(String input, String name){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter key: ");
        String key = scan.next();
        if(this.algorithms.containsKey(name)){
            String decryptedOutput = this.algorithms.get(name).decrypt(input,key);
            return decryptedOutput;
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
            Decrypt decryptObject = new Decrypt();
            decryptObject.decrypt(args[1], args[0].toLowerCase());
        }
    }
}
