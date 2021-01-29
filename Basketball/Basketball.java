import java.util.*;

public class Basketball{
    public static void main(String[] args){
        // "A2B2A1B2A2B1A2B2A1B2A1A1B1A1A2"
        Scanner scan = new Scanner(System.in);
        String score = scan.nextLine();
        int alice = 0;
        int barbara = 0;
        for(int i = 0; i<score.length(); i+=2){
            char letter = score.charAt(i);
            char points = score.charAt(i+1);
            if(letter=='A'){
                alice += Integer.parseInt("" + points);
            }else{
                barbara += Integer.parseInt("" + points);
            }
            if(alice>10 && (alice-barbara)>=2){
                System.out.println("A");
            }
            if(barbara>10 && (barbara-alice)>=2){
                System.out.println("B");
            }
        }
    }
}