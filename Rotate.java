// Program to rotate a Matrix to 90 and 180 degrees 
import java.io.*; //importing io package
class Rotate //start of class
{
   public static void main (String args[])throws IOException //start of main method
   {
      int M = 0, x = 0, r = 0;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the number of rows of a square matrix");
      M = Integer.parseInt(br.readLine());
      //taking input from user
      x = M * M; //calculating number of elements in Square Matrix
      int A[][] = new int [M][M];
      int B[][] = new int [M][M];
      int C[][] = new int [M][M];
      //initialing 2D Arrays
      System.out.println("Enter " + x + " integers in the Matrix");
      for(int i = 0; i < M; i++)
      {
         for(int j = 0; j < M; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine());
          }
       }//end of nested for loop
      //taking input of each element of Matrix from user 
      System.out.println(""); 
      System.out.println("ORIGINAL MATRIX");
      for(int i = 0; i < M; i++)
      {
         for(int j = 0; j < M; j++)
         {
            System.out.print(A[i][j] + " ");
          }
         System.out.println("");
       }//end of nested for loop
      //displaying Original Matrix 
      r = M - 1;
      System.out.println(""); 
      System.out.println("MATRIX AFTER 90 DEGREE CLOCKWISE ROTATION");
      for(int i = 0; i < M; i++)
      {
         for(int j = 0; j < M; j++)
         {
            B[i][j] = A[r-j][i]; 
            //performing 90 deg. clockwise rotation (as per position of elements)
            //storing values in another Array(B)
         }
      }//end of nested for loop
      System.out.println(""); 
       for(int i = 0; i < M; i++)
      {
         for(int j = 0; j < M; j++)
         {
            System.out.print(B[i][j] + " ");
         }
         System.out.println(""); 
      } //end of nested for loop
      //displaying 90 deg. clockwise rotated Matrix
      System.out.println(""); 
      System.out.println("MATRIX AFTER 180 DEGREE ROTATION");
      for(int i = 0; i < M; i++)
      {
         for(int j = 0; j < M; j++)
         {
            C[i][j] = B[r-j][i]; //further 90 deg. clockwise gives 180
            //performing 180 deg. rotation (as per position of elements)
            //storing values in another Array(C)
         }
      }//end of nested for loop
      System.out.println(""); 
       for(int i = 0; i < M; i++)
      {
         for(int j = 0; j < M; j++)
         {
            System.out.print(C[i][j] + " ");
         }
         System.out.println(""); 
      }//end of nested for loop
      //displaying 180 deg. rotated Matrix
      System.out.println(" ");
    }//end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE                    DESCRIPTION
 
    M         int                 to take input from user 
    x         int            to store product of row and column 
    r         int             temporary variable to store value
  A[][]       int           to store elements of original matrix 
  B[][]       int    to store elements of 90 deg. clockwise rotated matrix 
  C[][]       int        to store elements of 180 deg. rotated matrix 
    i         int               control variable to run loop 
    j         int               control variable to run loop 
 */