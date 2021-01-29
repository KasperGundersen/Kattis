import java.util.*;

public class Modulo{
  public static void main(String[] args){
    // "1 2 3 4 5 6 7 8 9 10"
    //"42 84 252 420 840 126 42 84 420 126"
    Scanner scan = new Scanner("1 2 3 4 5 6 7 8 9 10");
    HashMap<Integer, Integer> numbers = new HashMap<Integer,Integer>();
    ArrayList<Integer> newNumbers = new ArrayList<Integer>();

    for(int i = 0; i<10;i++){
      int rest = scan.nextInt()%42;
      //if(numbers.get(rest)!=null){
        if(newNumbers.contains(rest)){
        // trenger ikke gjøre noe
        continue;
      }else{
        numbers.put(rest,1);
        newNumbers.add(rest);
        //antall++;
      }
    }
    //System.out.println(antall);
    System.out.println(newNumbers.size());
  }
}
