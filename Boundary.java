// Program to arrange Boundary elements of a Matrix (entered by user) in ascending order
import java.io.*; //importing io package
class Boundary 
{
   public static void main(String args[])throws IOException 
   {
      int row = 0, column = 0, x = 0, count = 0, temp = 0, t = 0;
      //initializing variables
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter no. or rows");
      row = Integer.parseInt(br.readLine());
      System.out.println("Enter no. or columns");
      column = Integer.parseInt(br.readLine());
      //taking input from user
      x = row * column; 
      int A[][] = new int [row][column]; //initializing required 2D Array
      System.out.println("Enter " + x + " numbers in Matrix");
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < column; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine());
          }
      }
      //taking input of each element of Matrix from user
      System.out.println(" ");
      System.out.println("ORIGINAL MATRIX");
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < column; j++)
         {
            System.out.print(A[i][j] + " ");
          }
         System.out.println(""); 
      }
      //displaying Original Matrix
      //Boundary elements to be arranged in ascending order
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < column; j++)
         {
            if(i == 0 || j == 0 || i == (row-1) ||j == (column-1))
            {
               count++; 
            }
         }
      }
      int B[] = new int [count]; //initializing required 1D Array
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < column; j++)
         {
            if(i == 0 || j == 0 || i == (row-1) ||j == (column-1))
            {
              B[temp] = A[i][j];
              temp++;
            }
         }
      }
      for(int i = 0; i < count; i++) //arranging in ascending order
      {
         for(int j = 0; j < (count-1); j++)
         {
            if(B[j] > B[j+1]) 
            {
               t = B[j];
               B[j] = B[j+1];
               B[j+1] =t;
            }//end of if statement 
         }
      }//end of nested for loop
      temp = 0;
      for(int i = 0; i < row; i++) 
      {
         for(int j = 0; j < column; j++)
         {
            if(i == 0 || j == 0 || i == (row-1) ||j == (column-1))
            {
               A[i][j] = B[temp];
               temp++;
               //replacing Boundary elements
            }
         }
      }
      System.out.println(" ");
      System.out.println("NEW MATRIX");
      for(int i = 0; i < row; i++)
      {
         for(int j = 0; j < column; j++)
         {
            System.out.print(A[i][j] + " ");
         }
         System.out.println(" ");
      }
      System.out.println(" ");
   }//end of main method
}//end of class
/**VDT
 VARIABLE    DATATYPE                     DESCRIPTION
 
    row        int                  to take input from user 
   column      int                  to take input from user
     x         int    to store the product of rows and columns of Matrix A
   A[][]       int                  to store elements matrix 
    B[]        int           to store boundary elements of 2D Array
   count       int            to store number of boundary elements
    temp       int                     temporary variable
     t         int                     temporary variable
     i         int                control variable to run loop 
     j         int                control variable to run loop 
 */