//Write a program to find the difference between two matrices
import java.io.*;
class Subtract
{
   public static void main(String args[])throws IOException
   {
      int r = 0, c = 0, x = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter no. of rows");
      r = Integer.parseInt(br.readLine());
      System.out.println("Enter no. of columns");
      c = Integer.parseInt(br.readLine());
      int A[][] = new int [r][c];
      int B[][] = new int [r][c];
      int C[][] = new int [r][c];
      x = r * c;
      System.out.println("Enter " + x + " numbers for array A");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         { 
            A[i][j] = Integer.parseInt(br.readLine());  
         }
      }
      System.out.println("Enter " + x + " numbers for array B");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         { 
            B[i][j] = Integer.parseInt(br.readLine());  
         }
      }
      System.out.println("The difference between the two arrays is as follows");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         { 
            C[i][j] = A[i][j] - B[i][j];  
         }
      }
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         { 
            System.out.print(C[i][j] + " ");  
         }
         System.out.println();
      }
   }
}
