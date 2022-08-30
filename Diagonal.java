//WAP to find the sum of the left and right diagonals
import java.io.*;
class Diagonal
{
   public static void main(String args[])throws IOException
   {
      int r = 0, c = 0, x = 0, left  = 0, right = 0, diagonal = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the number of rows");
      r = Integer.parseInt(br.readLine());
      System.out.println("Enter the number of columns");
      c = Integer.parseInt(br.readLine());
      int A[][] = new int [r][c];
      x = r * c;      
      System.out.println("Enter " + x + " numbers in array");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j< c; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine());            
         }
      }
      if(r == c)
      {
         System.out.println("");
         System.out.println("The sum of the left and right diagonals is as follows");
         for(int i = 0; i < r; i++)
         {
            left = left + A[i][i];
         }
         for(int i = 0; i < r; i++)
         {
            for(int j = 0; j < c; j++)
            {
               if((i+j) == (r-1))
               {
                  right = right + A[i][j];
                }
            }
         }
         diagonal = left + right;
         System.out.println(diagonal);
       }
      else
      {
          System.out.println("The matrix must be a square matrix to find the sum of diagonals");
      }
   }
}
    
    
        


      
      