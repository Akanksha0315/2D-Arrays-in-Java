//WAP to check if a matrix entered by user is a scalar matrix or not
import java.io.*;
class Scalar_Matrix
{
   public static void main(String args[])throws IOException
   {
      int r = 0, c = 0, b = 0, flag = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the number of rows in Matrix");
      r = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of columns");
      c = Integer.parseInt(br.readLine());
      int A[][] = new int [r][c];
      int x = r * c;
      System.out.println("Enter " + x + " numbers in Matrix");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine());
         }
      }
      System.out.println("The matrix entered is: ");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            System.out.print(A[i][j] + " ");
         }
         System.out.println("");
      }
      b= A[0][0];
      if(r == c)
      {
         for(int i = 0; i < r; i++)
         {
            for(int j = 0; j < c; j++)
            {
               if((i == j) && (A[i][j] == b))
               {
                  flag = 1;
               }
               else if((i != j) && (A[i][j] == 0))
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
         if(flag == 1)
         {
            System.out.println("The matrix entered by user is a scalar matrix");
         }
         else
         {
            System.out.println("The matrix entered by user is a NOT scalar matrix");
         }
      }
      else
      {
         System.out.println("The matrix entered by user is a scalar matrix");
      }
   }
}

