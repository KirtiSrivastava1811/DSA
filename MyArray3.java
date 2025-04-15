
import java.util.Scanner;

public class MyArray3 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int My2DArray[][]=new int[3][2];
        for (int i = 0; i <My2DArray.length; i++) 
        {
            for(int j=0;j<My2DArray[i].length;j++) {
                System.out.println("enter"+j+" element: ");
                int element= Sc.nextInt();
                My2DArray[i][j]=element;
            }
            
        }
        printMy2DArray(My2DArray);

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
 
/**
 * @param arr
 */
public static void  printMy2DArray (int arr[][]) {
    for (int i = 0; i < arr.length; i++) {
        System.out.println("For" +i+" index");
        printArray(arr[i]);
    }
}
}

