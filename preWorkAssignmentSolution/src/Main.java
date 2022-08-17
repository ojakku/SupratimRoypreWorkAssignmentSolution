import java.util.Scanner;
public class Main
{
      Scanner sc = new Scanner(System.in);
      public void checkPalindrome()
      {
            System.out.println("Enter number : ");
            //funtion to checkPalindrome
            int r, sum = 0, temp;
            int n = sc.nextInt();
            temp = n;
            while(n>0)
            {
                  r = n % 10;
                  sum = (sum * 10) + r;
                  n = n / 10;
            }
            if(temp == sum)
            System.out.println(" is palindrome number");
            else
            System.out.println("not a palindrome number");
      }
      public void printPattern()
      {
            //funtion to printPattern
            System.out.println("Enter number : ");
            int rows = sc.nextInt();
            for(int i = rows - 1; i >= 0; i--)
            {
                  for(int j = 0;j<= i; j++)
                  {
                        System.out.print("*" + " ");
                  }
                  System.out.println();      
            }
            
      }
      public void checkPrimeNumber()
      {
            //funtion to check number is prime or not
            System.out.println("Enter number : ");
            int i, m = 0, flag = 0;
            int n = sc.nextInt();
            m = n/2;
            if(n == 0 || n == 1)
            {
                  System.out.println(n +" is not a prime number");
            }
            else
            {
                  for(i = 2; i <= m; i++)
                  {
                        if(n % i == 0)
                        {
                              System.out.println(n + " is not a prime number");
                              flag = 1;
                              break;
                        }
                  }
                  if(flag == 0)
                  System.out.println(n + " is prime number");
            }
      }
      public void printFibonacciSeries()
      {
            //funtion to print FibonacciSeries
            //initialize the first and second value as 0,1 respectively
            System.out.println("Enter number : ");
            int first = 0, second = 1, n3, i, count = sc.nextInt();
            System.out.println(first + " " + second);
            for(i = 2; i < count; ++i)
            {
                  n3 = first + second;
                  System.out.println(" " + n3);
                  first = second;
                  second = n3;
            }
      }
      //main method contains switch and do while loop
      public static void main(String[] args)
      {
            Main obj = new Main();
            int choice;
            Scanner sc = new Scanner(System.in);
            do{
                  System.out.println("Enter your choice from below list.\n" + "1. Find Palindrome of number.\n" + "2. Print pattern for a given no.\n" + "3. Check whether the no is a prime number.\n" + "4. Print Fibonacci Series.\n" + "--> Enter 0 to Exit. \n");
                  System.out.println();
                  choice = sc.nextInt();
                  switch(choice)
                  {
                        case 0:
                        choice = 0;
                        break;
                        case 1:
                        {
                              System.out.println("Enter number :");
                              obj.checkPalindrome();
                        }
                        break;
                        case 2:
                        {
                              obj.printPattern();
                        }
                        break;
                        case 3:
                        {
                              obj.checkPrimeNumber();
                        }
                        break;
                        case 4:
                        {
                              obj.printFibonacciSeries();
                        }
                        break;
                        default:
                        System.out.println("Invalid choice. Enter a valid no.\n");
                  }
            }
            while(choice != 0);
            System.out.println("Exited Succesfully!");
            sc.close();
      }
}