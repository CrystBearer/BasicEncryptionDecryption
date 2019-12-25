import java.io.*;
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
     * @param input File of the given path from the command line
     * @return String name of the algorithm given
     */
    public String decrypt(File input, String name){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter key: ");
        String key = scan.next();
        String decryptedOutput = "";
        if(this.algorithms.containsKey(name)){
            try {
                BufferedReader br =  new BufferedReader(new FileReader(input));
                String fileContent = "";
                while(br.ready()){
                    fileContent += br.readLine();
                }
                decryptedOutput = this.algorithms.get(name).decrypt(fileContent,key);
                br.close();
            } catch (FileNotFoundException err) {
                System.out.println(err.getMessage() + ": Could not find " + input.getName());
            } catch (IOException err){
                System.out.println(err.getMessage() + ": Could not find " + input.getName());
            }
        } else {
            throw new RuntimeException("\""+input+"\"" + " algorithm does not exist.");
        }
        return decryptedOutput;
    }


    /**
     * Decrypts the given string input
     * @param input File of the given path from the command line
     * @return String name of the algorithm given
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
            File encryptedFile = new File(args[1]);
            if(encryptedFile.exists() && encryptedFile.isFile()){
                System.out.println(decryptObject.decrypt(encryptedFile, args[0].toLowerCase()));
            } else {
                System.out.println(decryptObject.decrypt(args[1], args[0].toLowerCase()));
            }
        }
    }
}
