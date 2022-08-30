//Write a program to display the mirror image of a matrix entered by user
import java.io.*;
class Mirror_Matrix
{
   public static void main(String args[])throws IOException
   {
      int M = 0, x = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the no. of rows");
      M = Integer.parseInt(br.readLine());
      int A[][] = new int [M][M];
      int B[][] = new int [M][M];
      if(M > 2 && M < 22)
      {
         x = M * M;
         System.out.println("Enter " + x + " numbers in the square matrix");
         for(int i = 0; i < M; i++)
         {
            for(int j = 0; j < M; j++)
            {
               A[i][j] = Integer.parseInt(br.readLine());
            }
         }
         System.out.println("");
         System.out.println("The matrix entered is as follows");
         for(int i = 0; i < M; i++)
         {
            for(int j = 0; j < M; j++)
            {
               System.out.print(A[i][j] + " ");
            }
            System.out.println("");
         }    
         System.out.println("");
         System.out.println("The mirror image of this matrix is as follows");
         for(int i = 0; i < M; i++)
         {
            for(int j = 0; j < M; j++)
            {
               B[i][j] = A[i][(M-1)-j];
            }
         }
         for(int i = 0; i < M; i++)
         {
            for(int j = 0; j < M; j++)
            {
               System.out.print(B[i][j] + " ");
            }
            System.out.println("");
         }    
      }
      else
      {
         System.out.println("2 < M < 22 must be true. Sorry."); 
      }
   }
}