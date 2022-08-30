/*
 Program to check whether a number entered by user is a Disarium Number of not 

 Disarium Number - Sum of its digits powered with their respective position is equal to the 
  original number
  Eg. 135 is a Disarium number:
  1^1 + 3^2 + 5^3 = 135
 */
import java.io.*; //importing java.io package
class Disarium //start of class
{
   int num = 0;
   int size;
   int sum;
   //initializing variables
   Disarium(int nn) //constructor
   {
      num = nn; //to store original number
      size = 0; //to store size of number
      //giving values to variables
   }//end of constructor
   void countDigit() //method to count number of digits
   {
      int digit = 0;
      int a = num;
      while(a > 0)
      {
         digit = a % 10;
         a = a / 10;
         size++;
         //calculating number of digits
      }//end of while loop
   }//end of countDigit() method
   int sumofDigits(int n, int p)//method to find the sum of digits as per given conditions
   {
      while(n > 0)
      {
         int d = n % 10;
         sum = sum + (int)Math.pow(d,size);
         p--;
         n = n / 10;
      }//end of while loop
      return sum;
   }//end of sumofDigit() method
   void check()
   {
      if(sum == num)
      {
         System.out.println("The number " + num + " entered is a Disarium Number");
      }
      else
      { 
         System.out.println("The number " + num + " is NOT a Disarium Number");
       }//end  of if - else statement 
   }//end of check() method
   public static void main(String args[])throws IOException
   {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      System.out.println("Enter a number:");
      int nn = Integer.parseInt(br.readLine());
      Disarium ds = new Disarium(nn);
      ds.countDigit();
      ds.check();
    }//end of main method
}//end of class