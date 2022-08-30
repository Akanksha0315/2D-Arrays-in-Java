// Program to perform Multiplication of two Matrices
import java.io.*; //importing java.io package
class Multiplication //start of class 
{
    public static void main(String args[])throws IOException //start of main method
    {
        int r1 = 0, c1 = 0, r2 = 0, c2 = 0, x = 0, y = 0, sum = 0;
        //initializing variables
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter number of rows in Matrix A");
        r1 = Integer.parseInt(br.readLine()); 
        System.out.println("Enter number of columns in Matrix A");
        c1 = Integer.parseInt(br.readLine());
        System.out.println("Enter number of rows in Matrix B");
        r2 = Integer.parseInt(br.readLine());
        System.out.println("Enter number of columns in Matrix B");
        c2 = Integer.parseInt(br.readLine());
        //taking input from user
        System.out.println(" ");
        x = r1 * c1;
        y = r2 * c2;
        //calculating number of elements in each 2D Array(/Matrix)
        if(c1 == r2)//condition for multipication of two Matrices
        {
            int A[][] = new int[r1][c1];
            int B[][] = new int[r2][c2];
            int C[][] = new int[r1][c2];
            //initializing required 2D Arrays
            System.out.println("Enter " + x + " numbers to Matrix A");
            for(int i = 0; i < r1; i++)
            {
                for(int j = 0; j < c1; j++)
                {
                    A[i][j] = Integer.parseInt(br.readLine());
                }
            }//end of nested for loop
            //taking input of each element of Matrix from user 
            System.out.println(" ");
            System.out.println("Enter " + y + " numbers to Matrix B");
            for(int i = 0; i < r2; i++)
            {
                for(int j = 0; j < c2; j++)
                {
                    B[i][j] = Integer.parseInt(br.readLine());
                } 
            }//end of nested for loop
            //taking input of each element of Matrix from user 
            System.out.println(" ");
            System.out.println("Matrix A");
            for(int i = 0; i < r1; i++)
            {
                for(int j = 0; j < c1; j++)
                {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println("");
            }//end of nested for loop
            //displaying Matrix A
            System.out.println(" ");
            System.out.println("Matrix B");
            for(int i = 0; i < r2; i++)
            {
                for(int j = 0; j < c2; j++)
                {
                    System.out.print(B[i][j] + " ");
                }
                System.out.println();
            }//end of nested for loop
            //displaying Matrix B
            System.out.println(" ");
            for(int i = 0; i < r1; i++) //Multiplication of Matrices
            {
                for(int j = 0; j < c2; j++)
                {
                    for(int k = 0; k < r2; k++)
                    {
                        sum = sum + (A[i][k] * B[k][j]);
                        //calculating the sum required for each element
                    }
                    C[i][j] = sum;
                    sum = 0;
                }
            }//end of nested for loop
            System.out.println("PRODUCT OF TWO MATRICES (A and B)");
            System.out.println("MATRIX C");
            for(int i = 0; i < r1; i++)
            {
                for(int j = 0; j < c2; j++)
                {
                    System.out.print(C[i][j]+ " ");
                }
                System.out.println();
            }//end of nested for loop
            //displaying product of 2 Matrices (Matrix C)
            System.out.println(" ");
        }
        else
        {
            System.out.println("Multiplication of the two matices is not possible");
            //displaying possible output
        }
        System.out.println(" ");
    }//end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE                     DESCRIPTION
 
    r1        int                  to take input from user 
    c1        int                  to take input from user
    r2        int                  to take input from user
    c2        int                  to take input from user
    x         int    to store the product of rows and columns of Matrix A
    y         int    to store the product of rows and columns of Matrix B
  A[][]       int             to store elements of first matrix 
  B[][]       int             to store elements of second matrix 
  C[][]       int        to store elements of product of two matrices
   sum        int       to store required sum to form elements of matrix  
    i         int               control variable to run loop 
    j         int               control variable to run loop 
 */