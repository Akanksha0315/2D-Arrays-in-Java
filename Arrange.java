//Write a program to arrange the matrix in ascending order
import java.io.*;
class Arrange
{
   public static void main(String args[])throws IOException
   {
      int r = 0, c = 0, x = 0, z = 0, t = 0;
      InputStreamReader isr = new InputStreamReader (System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter no. of rows");
      r = Integer.parseInt(br.readLine());
      System.out.println("Enter no. of columns");
      c = Integer.parseInt(br.readLine());
      x = r * c;
      int A[][] = new int [r][c];
      int B[] = new int [x];
      int C[][] = new int [r][c];
      System.out.println("Enter " + x + " numbers in Array");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {   
            A[i][j] = Integer.parseInt(br.readLine());
            B[z] = A[i][j];
            z++;
         }
      }
      for(int i = 0; i < x; i++)
      {
         for(int j = 0; j < (x - 1); j++)
         {
            if(B[j] > B[j+1])
            {
               t = B[j];
               B[j] = B[j+1];
               B[j+1] = t;
            }
         }
      }
      System.out.println("The matrix in acsending order is as follows");
      z = 0;
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {   
            C[i][j] = B[z];
            z++;
            System.out.print(C[i][j]+ " ");
         }
         System.out.println("");
      }
   }
}



 