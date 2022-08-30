/* Program to check if a matrix entered by user is either a symmetric matrix, a mirror matrix or neither 
 * Symmetric Matrix - a square matrix that is equal to its transpose */
import java.io.*; //importing io package
class Matrices
{
   public static void main(String args[])throws IOException
   {
      int N = 0, flag = 0, left = 0, right = 0;
      int ch = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the number of rows in a square matrix");
      N = Integer.parseInt(br.readLine());
      int A[][] = new int [N][N];
      int x = N * N;
      System.out.println("Enter " + x + " number");
      for(int i = 0; i < N; i++)
      {
         for(int j = 0; j < N; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine());
         }
      }
      System.out.println("");
      System.out.println("The matrix entered is as follows: ");
      for(int i = 0; i < N; i++)
      {
         for(int j = 0; j < N; j++)
         {
            System.out.print(A[i][j] + " ");
         }
         System.out.println("");
      }
      System.out.println("");
      System.out.println("Enter 1 to find display the mirror image of the matrix");
      System.out.println("Enter 2 to check if matrix entered is symmetric or not");
      ch = Integer.parseInt(br.readLine());
      System.out.println("");
      switch(ch)
      {
         case 1: int B[][] = new int [N][N];
         System.out.println("The mirror image of this matrix is as follows");
         for(int i = 0; i < N; i++)
         {
            for(int j = 0; j < N; j++)
            {
               B[i][j] = A[i][(N-1)-j];
            }
         }
         for(int i = 0; i < N; i++)
         {
            for(int j = 0; j < N; j++)
            {
               System.out.print(B[i][j] + " ");
            }
            System.out.println("");
         }    
         break;
         case 2:
          for(int i = 0; i < N; i++)
         {
            for(int j = 0; j < N; j++)
            {
               if(A[i][j] == A[j][i])
               {
                  flag = 1;
                }
               else
               {
                  flag = 0;
                  break;
                }
            }
         }
         for(int i = 0; i < N; i++)
         {
            for(int j = 0; j < N; j++)
            {
               if(i == j)
               {
                  left = A[i][j] + left;
               }
               if((i+j) == (N-1))
               {
                  right = right + A[i][j];
               }
            }
         }
         if(flag == 1)
         {
            System.out.println("THE MATRIX ENTERED IS A SYMMETRIC MATRIX");
            System.out.println("sum of left diagonal = " + left);
            System.out.println("sum of right diagonal = " + right);
         }
         else
         { 
            System.out.println("THE MATRIX ENTERED IS A NOT SYMMETRIC MATRIX"); 
         }
         break;
         default: System.out.println("INVALID INPUT");
      }  
   }
}
         
        
         