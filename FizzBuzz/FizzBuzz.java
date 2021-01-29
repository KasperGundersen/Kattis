import java.util.*;

public class FizzBuzz{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int firstNumber = scan.nextInt();
        int secondNumber = scan.nextInt();
        int boundary = scan.nextInt();


        for(int i = 1; i<=boundary;i++){
          String output = "";

            if(i%firstNumber == 0){
                output += "Fizz";
            }
            if(i%secondNumber== 0){
                output += "Buzz";
            }
            if("".equals(output)){
                output = ""+ i;
            }
            System.out.println(output);
        }

    }
}
//Job expenses
// Modulo
// Last Factorial Digit
