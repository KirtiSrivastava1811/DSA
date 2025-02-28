import java.util.Arrays;
import java.util.Scanner;

public  class main4{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int[] arr = new int[5];
        arr[0]=27;
        arr[1]=47;
        arr[2]=270;
        arr[3]=297;
        arr[4]=200;
        String[] str= new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
            
        }
        System.out.println(Arrays.toString(str));
        str[1]="kirti";
        System.out.println(Arrays.toString(str));
    }

}

//storage of object in heap