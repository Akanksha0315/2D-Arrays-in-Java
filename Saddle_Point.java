/* Program to declare a square matrix A[][] of order (N < 20), display original matrix and find its saddle point
 * Saddle point is element of matrix which is greatest in column and smallest in column */
import java.io.*; //importing java.io package
class Saddle_Point
{
   public static void main(String args[])throws IOException
   {
      int r = 0, c = 0, x = 0, min_row = 0, n = 0, col_ind = 0, d = 0, k = 0, flag = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the number of rows");
      r = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of columns");
      c = Integer.parseInt(br.readLine());
      x = r * c;
      int A[][] = new int [r][c];
      System.out.println("Enter " + x + " numbers in array");
       for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine());  
          }
       }
      System.out.println("");
      System.out.println("The matrix entered is as follows");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            System.out.print(A[i][j] + " ");
          }
          System.out.println("");
       }
      for(int i = 0; i < r; i++)
      {
          min_row = A[i][0]; col_ind=0;
         for(int j = 1; j < c; j++)        
         {
            if(A[i][j] < min_row)
            {
               min_row = A[i][j];
               col_ind = j;
            }
         }
         for(k = 0; k < r; k++)
         {
            if(A[k][col_ind] > min_row)
            {
                break;
            }
         } 
         if(k == r)
         {
            System.out.println("");
            System.out.println(min_row + " is the Saddle Point of the matrix");
            flag = 1;
            break;
         } 
      }
      System.out.println("");
      if(flag != 1)
      {
        System.out.println("There is no Saddle Point in the matrix");  
      }
   }
}
/**VDT
 VARIABLE     DATATYPE                 DESCRIPTION
 
    N           int        to store the number of rows and column 
  A[][]         int              to store multiple values 
 min_row        int                  to store a value
 col_ind        int                  to store a value
  flag          int       to check if there is a saddle pt. or not 
    i           int            control variable to run loop
    j           int            control variable to run loop
    k           int            control variable to run loop */

                 






