


import java.util.Scanner;



public class MyArray2 {
    public static void main(String[] args) {
        int rollno[] = new int[5];
        int dummy[] = {2, 6, 7, 9, 2, 13, 2};

        rollno[0] = 54;
        Scanner sc = new Scanner(System.in);

        //  System.out.println(rollno);
        for (int i = 0; i < 3; i++) {
            System.out.println("enter" + i + " element: ");
            int element = sc.nextInt();
            rollno[i] = element;
            System.out.print(rollno[i] + " ");

        }
        printArray(rollno);
        insert(rollno, 1,22);
        printArray(rollno);
        delete(rollno, 1);
        printArray(rollno);
    }
    public static void delete(int arr[],int pos) {
        for (int i = pos; i <=arr.length-2; i++) {
            arr[i]=arr[i+1];
            
        }
        arr[arr.length-1]=0;
    }

    public static void insert(int arr[],int pos,int element) {

        int size =arr.length;
        if(pos<0 || pos>size-1){
            System.out.println("wrong position");
            return;
        }
        for (int i = size-2; i >= pos; i--) {
            arr[i+1]=arr[i];
        }
        arr[pos]=element;
    }

    public static void printArray(int arr[]) {
        int i;
        for (i = 0; i < arr.length; i++) ;
        System.out.println(arr[i]);
    }

}







