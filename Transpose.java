//WAP to find the transpose of a matrix
import java.io.*;
class Transpose
{
   public static void main(String args[])throws IOException
   {
      int r = 0, c = 0, x = 0, z = 0, t = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter no. of rows");
      r = Integer.parseInt(br.readLine());
      System.out.println("Enter no. of columns");
      c = Integer.parseInt(br.readLine());
      x = r * c;
      int A[][] = new int [r][c];
      int B[] = new int [x];
      System.out.println("Enter " + x + " numbers to array A");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine()); 
            B[z] = A[i][j];
            z++;
         }
      }
      System.out.println("The matrix entered is as follows"); 
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            System.out.print(A[i][j] + " "); 
         }
         System.out.println(""); 
      }
      t = r;
      r = c;
      c = t;
      z = 0;
      int C[][] = new int [r][c];
      System.out.println(" "); 
      System.out.println("The new matrix is as follows"); 
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            C[i][j] = B[z];
            z++;
         }
      }
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            System.out.print(C[i][j] + " ");
         }
         System.out.println("");
      }
   }
}
