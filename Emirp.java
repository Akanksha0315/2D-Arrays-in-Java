/* Program to check if a number entered by user is Emirp or not
 * Emirp Number - If a number is prime and the reverse of the number is also prime then it is Emirp
  Eg. 13
   as, 13 is prime and 31 is also prime */
import java.io.*; //importing java.io package
class Emirp //start of class
{
    public static void main(String args[])throws IOException //start of main method
    {
       int num = 0, check = 0, digit = 0, rev_num = 0, count = 0;
       //initializing variables
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       System.out.println("Enter a number");
       num = Integer.parseInt(br.readLine());
       //taking input from user
       for(int i = 1; i <= num; i++) //counting number of factors
       {
          if((num % i) == 0)
          {
              check++;
            }//end of if statement
        }//end of for loop
       if(check == 2) //checking if number entered by user is prime or not
       {
          for(int i = num; i > 0; i = i/10) //finding the reverse of the number entered by user
          {
             digit = i % 10; //extracting digit
             rev_num = (rev_num *10) + digit; //formulating reverse of number entered by user
           }//end of for loop
          for(int i = 1; i <= rev_num; i++) //checking if reverse of number entered by user is prime
          {
             if((rev_num % i) == 0)
             {
                count++;
             } //end of if statement
           } //end of for loop
          if(count == 2) //checking if reversed number is prime or not
          {
             System.out.println(num + " is a Emirp Number");
            }
          else
          {
             System.out.println(num + " is NOT a Emirp Number");              
           } //end of if-else statement
        }
       else
       {
           System.out.println(num + " is NOT a Emirp Number");
        } //end of if else statement
    } //end of main method
}//end of class
/**VDT
 VARIABLE   DATATYPE               DESCRIPTION
 
   num        int            to take input from user 
  check       int           to count number of factors
  digit       int     to extract digits from original number
 rev_num      int            to store reversed number
  count       int           to count number of factors
    i         int          control variable to run loop 
 */


