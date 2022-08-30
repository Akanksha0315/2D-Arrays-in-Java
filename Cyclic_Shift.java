/* Program to perform cyclic shift on a Matrix
 * Cyclic Shift is the upward shifting of the rows of a Matrix */
import java.io.*; //importing io package
class Cyclic_Shift //start of class
{
  public static void main(String args[])throws IOException //start of main method
  {
    int row = 0, column = 0, x = 0;
    //initializing variables
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter number of rows");
    row = Integer.parseInt(br.readLine());
    System.out.println("Enter number of columns");
    column = Integer.parseInt(br.readLine());
    //taking input from user
    x = row * column; //calculating number of elements
    int A[][] = new int[row][column];
    int B[][] = new int[row][column];
    //initializing required 2D Arrays
    System.out.println("Enter " + x + " integers to the Matrix");
    for(int i = 0; i < row; i++)
    {
      for(int j = 0; j < column; j++)
      {
        A[i][j] = Integer.parseInt(br.readLine());
      }
    }//end of nested for loop
    //taking input of each element of matrix from user 
    for(int i = 0; i < row; i++)
    {
      for(int j = 0; j < column; j++)
      {
        if(i < (row-1))
        {
          B[i][j] = A[(i+1)][j];
        }//end of if statement
        if(i == (row-1))
        {
          B[i][j] = A[0][j];
        }//end of if statement
        //performing cyclic shift on original matrix (with repect to position)
        //storing values into another Array(B)
      }
    }//end of nested for loop
    System.out.println(" ");
    System.out.println("ORIGINAL MATRIX");
    for(int i = 0; i < row; i++)
    {
      for(int j = 0; j < column; j++)
      {
        System.out.print(A[i][j] + " ");
      }
      System.out.println("");
    }//end of nested for loop
    //displaying Original Matrix
    System.out.println(" ");
    System.out.println("MATRIX AFTER CYCLIC SHIFT");
    for(int i = 0; i < row; i++)
    {
      for(int j = 0; j < column; j++)
      {
        System.out.print(B[i][j] + " ");
      }
      System.out.println("");
    }//end of nested for loop
    //displaying Matrix after cyclic shift
    System.out.println(" ");
  }//end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE                 DESCRIPTION
   row        int              to take input from user 
  column      int              to take input from user 
    x         int         to store product of row and column 
  A[][]       int        to store elements of original matrix 
  B[][]       int      to store elements of cyclic shift matrix 
    i         int           control variable to run loop 
    j         int           control variable to run loop 
 */