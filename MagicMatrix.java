//WAP to check if a matrix entered by user is a magic matrix or not
import java.io.*;
class MagicMatrix
{
   public static void main(String args[])throws IOException
   {
      int r = 0, c = 0, x = 0, left = 0, right = 0, row = 0, column = 0, y = 0, z = 0, flag = 0;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter the no. of rows");
      r = Integer.parseInt(br.readLine());
      System.out.println("Enter the no. of columns");
      c = Integer.parseInt(br.readLine());
      int A[][] = new int [r][c];
      x = r * c;
      System.out.println("Enter " + x + " numbers in array");
      for(int i = 0; i < r; i++)
      {
         for(int j = 0; j < c; j++)
         {
            A[i][j] = Integer.parseInt(br.readLine());
         }
      }
      System.out.println("");
      System.out.println("The matrix entered is as follows");
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
         System.out.println("");
         int B[] = new int [r];
         int C[] = new int [r];
         for(int i = 0; i < r; i++)
         {
            left = left + A[i][i];
         }
         for(int i = 0; i < r; i++)
         {
            for(int j = 0; j< c; j++)
            {
               if((i+j) == (r-1))
               {
                  right = right + A[i][j];
                }
            }
         }
         for(int i = 0; i < r; i++)
         {
            for(int j = 0; j< c; j++)
            {
               row = A[i][j] + row;
            }
            B[y] = row;
            y++;
            row = 0;
         }
        
         for(int i = 0; i < c; i++)
         {
            for(int j = 0; j < r; j++)
            {
               column = A[j][i] + column;
            }
            C[z] = column;
            z++;
            column = 0;
         }
         for(int i = 0; i< r; i++)
         {
            if(B[i] == C[i])
            {
               flag = 1; 
            }
            else
            {
               flag  = 0;
               break;
            }
         }
         if((left == right) && flag ==1)
         {
            System.out.println("The matrix entered is a magic matrix"); 
          }
         else
         {
            System.out.println("The matrix entered is NOT a magic matrix"); 
          }
       }
      else
      {  
         System.out.println("The matrix entered is NOT a magic matrix"); 
      }
   }
}
