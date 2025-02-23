
import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=27;
        arr[1]=47;
        arr[2]=270;
        arr[3]=297;
        arr[4]=200;
        System.out.println(arr[3]);

        //input using for  loop
        for(int i=0;i<arr.length;i++){
arr[i]=in.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
    }
}
}
