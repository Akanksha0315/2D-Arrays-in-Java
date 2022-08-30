//Program to check if a Matrix is Symmetric Matrix or not
import java.io.*;
class Symmetric_Matrix
{
   public static void main(String args[])throws IOException
   {
      int r = 0, c = 0, flag = 0, left = 0, right = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the number of rows");
      r = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of columns");
      c = Integer.parseInt(br.readLine());
      int A[][] = new int [r][c];
      int x = r * c;
      System.out.println("Enter " + x + " number");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine());
         }
      }
      System.out.println("The matrix entered is as follows: ");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            System.out.print(A[i][j] + " ");
         }
         System.out.println("");
      }
      if(r == c)
      {
         for(int i = 0; i < r; i++)
         {
            for(int j = 0; j < c; j++)
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
         for(int i = 0; i < r; i++)
         {
            for(int j = 0; j < c; j++)
            {
               if(i == j)
               {
                  left = A[i][j] + left;
               }
               if((i+j) == (r-1))
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
      }
      else
      {
         System.out.println("THE MATRIX ENTERED IS A SYMMETRIC MATRIX");
      }
    }
}
         
        
         