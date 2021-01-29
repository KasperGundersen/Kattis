import java.util.*;

public class FreeFood{
    public static void main(String[] args) {
        //"2 1 365 20 28"
        Scanner scanner = new Scanner(System.in);
        int boundary = scanner.nextInt();

        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i<boundary; i++){
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            for(int k = start; k<=end; k++){
                if(!list.contains(k)){
                    list.add(k);
                }
            }
        }
        System.out.println(list.size());
    }
}