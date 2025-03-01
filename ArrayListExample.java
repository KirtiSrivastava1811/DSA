
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> List =new ArrayList<>(10);
       //List.add(67);
         //List.add(607);
        //List.add(670);
        //List.add(57);
         //List.add(62);
         //System.out.println(List.contains(607));
         //System.out.println(List);
         for (int i = 0; i < 5; i++) {
            List.add(in.nextInt());
             
         }
         for (int i = 0; i < 5; i++) {
            System.out.println(List.get(i));
         }
        System.out.println(List);
    }
}
