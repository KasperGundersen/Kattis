import java.util.*;

public class JobExpenses{
  public static void main(String[] args){
    //"3 1 -2 3"
    // "10 -100 40000 -6500 -230 -18 34500 -450 13000 -100 5000"
    Scanner scan = new Scanner( "10 -100 40000 -6500 -230 -18 34500 -450 13000 -100 5000");
    int boundary = scan.nextInt();

    int expenses = 0;

    for(int i = 0; i<boundary; i++){
      int num = scan.nextInt();
      if(num <0){
        expenses += -num;
      }
    }
    System.out.println(expenses);
  }
}
