// Program to diplay Spiral Matrix as per number entered per user
import java.io.*;
class Spiral
{
   public static void main(String args[])throws IOException
   {
      int N = 0, num  = 1;
      int r_1 = 0, c_1 = 0;
      InputStreamReader isr = new InputStreamReader (System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a Natural Number");
      N = Integer.parseInt(br.readLine());
      int A[][] = new int [N][N];
      int r_2 = N-1, c_2 = N-1;
      while (num <= (N*N))
      {
         for(int i = c_1; i <= c_2; i++)
         {
            A[r_1][i] = num++;
         }
         for(int j = r_1+1; j <= r_2; j++)
         {
            A[j][c_2] = num++;
         }
         for(int i = c_2-1; i >= c_1; i--)
         {
            A[r_2][i] = num++;
         }
         for(int j = r_2-1; j >= r_1+1; j--)
         {
            A[j][c_1] = num++;
         }
         c_1++;
         c_2--;
         r_1++;
         r_2--;
       }
      System.out.println("The Spiral Matrix is:");
      for(int i = 0; i < N; i++)
      {
         for(int j = 0; j < N; j++)
         {
            System.out.print(A[i][j]+ "\t");
         }
         System.out.println();
      }
   }
}