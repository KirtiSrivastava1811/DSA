
import java.util.Scanner;



public class MyArray {
    public static void main(String[] args) {
        int rollno[] = new int[5];
        int dummy[] = {2, 6, 7, 9, 2, 13, 2};

        rollno[0] = 54;
        Scanner sc = new Scanner(System.in);

        //  System.out.println(rollno);
        for (int i = 0; i < rollno.length; i++) {
            System.out.println("enter" + i + " element: ");
            int element = sc.nextInt();
            rollno[i] = element;
            System.out.print(rollno[i] + " ");

        }
        printArray(rollno);
    }

    public static void printArray(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) ;
        System.out.println(arr[i]);
    }

}







