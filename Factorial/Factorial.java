import java.util.*;

public class Factorial{
  public static void main(String[] args){
    //"2 5 2"
    Scanner scan = new Scanner(System.in);
    int boundary = scan.nextInt();

    for(int i = 0;i<boundary;i++){
      int num = scan.nextInt();
      int sum = 1;
      for(int k = num; k>0;k--){
        sum *=k;
      }
      System.out.println(sum%10);
    }
  }
}
