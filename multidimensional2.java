
import java.util.Arrays;
import java.util.Scanner;

public class multidimensional2 {
   
        public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         //   int[][] arr= new int[3][];
             
    //        int[][] arr = {
    //          {1,2,3},
    //        {4,6,8},
    //      {9,7,4,5},
    //};


            int[][]arr = new int[3][3];
            System.out.println(arr.length);


     // input 
     for (int row = 0; row < arr.length; row++) {
           //for reach col in every row
           for (int col = 0; col < arr[row].length; col++) {
               arr[row][col] =in.nextInt(); 
           }
        }

        //output
       // for (int row = 0; row < arr.length; row++) {  
         //   //for reach col in every row
           // for (int col = 0; col < arr[row].length; col++) {
             //   System.out.println(arr[row][col]+ " ");
  //  }


  for (int row = 0; row < arr.length; row++) {
    System.out.println(Arrays.toString(arr[row]));
      
  }
}
}

