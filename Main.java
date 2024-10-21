import java.util.*;
import java.io.*;

public class Main {
  public static void main(String[] args) {

    // int a; //define
    // a = 7; //initalize
    // int b = 7; //declaration

    
    /*int marks = 95; //int
    System.out.println("Score : " + marks);*/

    
    /*double percent = 97.25; //double
    System.out.println("Percent : " + percent);*/

    
    /*boolean pass = true; //boolean
    System.out.println("Pass : " + pass);*/

    
    //System.out.println(13/2); //for quotent

    
    // System.out.println(13%2); //for reminder

    
    /*Scanner enter = new Scanner(System.in);
    int x = enter.nextInt();
    int y = enter.nextInt();
    int sum = x + y;
    System.out.println("sum");*/

    
    /*int a = 40;
    int b = 60;
    System.out.println((a+b > 50) ? "True" : "False") ;*/

    
    /*Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();
    System.out.println((num > 100) ? "True" : "False");*/

    
    /*to get last digit of any large number
    ------ divide it by 10 and get the reminder as last digit
    Scanner enter = new Scanner(System.in);
    int rem = enter.nextInt();
    System.out.println(rem%10);*/

    
    /*Terinary operator--T/F
    Scanner enterNo = new Scanner(System.in);
    int even = enterNo.nextInt();
    int check = even%2;
    System.out.println((check == 1) ? "False" : "True");*/

    
    /*Terniary operator--T/F defined
    Scanner inp1 = new Scanner(System.in);
    int num1 = inp1.nextInt();
    int num2 = inp1.nextInt();
    System.out.println((num1 == 100)? "100" : num1 + num2);*/

    
    /*if else if--
    Scanner newint = new Scanner(System.in);
    int a = newint.nextInt();
    if(a>50){
      System.out.println("Greater than 50");
    }
    else if(a == 50) {
      System.out.println("Equals to 50");
    }
    else{
      System.out.println("Less than 50");
    }*/

    
    //String Character
    /*String x = "Aditya";
    System.out.println(x);

    Scanner inp = new Scanner(System.in);
    String myName = inp.next();
    System.out.println(myName);
    
    int len = myName.length();
    System.out.println(len);
    
    char ch = myName.charAt(1);
    System.out.println(ch);*/


    //Chacter--
    /*Scanner i = new Scanner(System.in);
    char ch = i.next().charAt(0);
    System.out.println(ch);*/
    

    /*Question--
    Scanner i = new Scanner(System.in);
    char ch = i.next().charAt(0);
    if(ch>='A' && ch<='Z'){
        System.out.println("Capital case");
    }else if(ch>='a' && ch<='z'){
        System.out.println("Small case");
    }else if(ch>='0' && ch<='9'){
        System.out.println("Digit");
    }else{
        System.out.println("None");
    }*/

    
    /*Question--
    Scanner i = new Scanner(System.in);
    char c = i.next().charAt(0);
    if(c>='a' && c<='z'){
        if(c>='a'&& c<='w'){

            //converson
            int n = (int)c + 3; //convert the character into integer
            char ch = (char)n; //convert the integer into character

            System.out.println(ch);
        }else{
            System.out.println("Can't jump");
        }
    }else if(c>='A' && c<='Z'){
        if(c>='D'&& c<='Z'){
            int n = (int)c - 3;
            char ch = (char)n;
            System.out.println(ch);
        }else{
            System.out.println("Can't jump");
        }
    }*/

      /*for--
      for(int i=0; i<=2; i++){
          System.out.println("Aditya");
      }*/

      
      /*fibonachi series--
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();

      int a = 0;
      int b = 1;
      
      for(int i=0; i<=n; i++){
          System.out.print(a + " ");
          int sum = a+b;
          a = b;
          b = sum;
      }
      */
      

    /*int n = 3;
      int i = 0;
      int a = 0;
      int b = 1;
      int c;
      while(i<n){
          c = a +b;
          a = b;
          b = c;
          i++;
      }
      System.out.print(a);
      */
  }
}