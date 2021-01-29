import java.util.*;

public class Kemija{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();

        ArrayList<Character> vowels = new ArrayList<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String output = "";

        for(int i = 0; i<sentence.length();i++){
            if(vowels.contains(sentence.charAt(i))){
                output += sentence.charAt(i);
                i+=2;
            }else{
                output += sentence.charAt(i);
            }
        }
        System.out.println(output);
    }
}