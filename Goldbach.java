/*Program to check if number entered by user is a Goldback number or not
 A GOLDBACK Number is a positive even integer that can be expressed as the sum of two odd primes
 *NOTE: All even integer numbers greater than 4 are Goldback numbers */
import java.io.*; //importing io package 
class Goldbach //start of class
{
  public static void main(String args[])throws IOException //start of main method
  {
    int num = 0, count = 0, k = 0, flag = 0;
    //initializing variables
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println("Enter a number to check if it is Goldbach");
    num = Integer.parseInt(br.readLine());
    //taking input from user
    if(num > 9 && num < 50 && (num % 2) == 0)
    {
      for(int i = 3; i <= num/2; i++) //setting appropriate range to be checked
      {
        count = 0;
        for(int j = 1; j <= i; j++)
        {
          if((i%j) == 0) //condition for factor
          {
            count++; //counting the number of factors
          }//end of if statement
        }//end of for loop
        if(count == 2) //condition for prime
        {
          k = num - i; 
          //finding the number whose sum with 'i' will give same value as number entered
          count = 0; //initialazing to zero
          for(int j = 1; j <= k; j++)
          {
            if((k%j) == 0) //condition for factor
            {
              count++; //counting the number of factors
            }//end of if statement
          }//end of for loop
          if(count == 2)
          {
            System.out.println(num + " = " + i + " + " + k);
            flag = 1;
          }//end of if statement 
        }//end of if statement 
      }//end of for loop
      if(flag == 1) //to display the required message
      {
        System.out.println(num + " is a Goldbach number");
      }
      else
      {
        System.out.println(num + " is NOT a Goldbach number"); 
       }//end of if-else statement
    }
    else
    {
      System.out.println(num + " is NOT a Goldbach number"); 
    }//end of if else statement
  }//end of main() method 
}//end of class
/**VDT
Variable   Datatype           Description
  num        int        to take input from user
  count      int    to count the number of factors
  k          int           to store a value
  flag       int           to store a value
  i          int     control variable to run loop
  j          int     control variable to run loop  */