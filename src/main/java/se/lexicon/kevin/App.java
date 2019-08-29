package se.lexicon.kevin;

import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        System.out.println("Calculator");
        Scanner inp = new Scanner(System.in);
        boolean keepAlive = true;
      while (keepAlive)
      {

          double num1;
          double num2;


          System.out.println("enter your first number");
          num1 = inp.nextDouble();


          System.out.println("enter a operator: \n1: add \n2: sub\n3: div \n4: mult \n ");
          int ope = inp.nextInt();



          System.out.println("enter your second number");
          num2 = inp.nextDouble();

          switch (ope)
          {
              case 1:
                  System.out.println(add(num1, num2));

                  break;
              case 2:
                  System.out.println(sub(num1, num2));
                  break;
              case 3:
                  System.out.println(div(num1, num2));
                  break;
              case 4:
                  System.out.println(mult(num1, num2));
                  break;
              default:
                  System.out.println("you did something wrong please try again");
                  break;
          }

                System.out.println("what do you want do do?\n1: try again\n0:quit ");
                int runOrQuit = inp.nextInt();
                switch (runOrQuit)
                {
                    case 1:
                        keepAlive = true;
                        break;
                    case 0:
                        keepAlive = false;
                        break;
                }
      }
    }//end of main;




    public static double add( double num1, double num2){

        double result = num1+num2;
        return result;


    }//end of add
    public static int add(String[][] array){
     array
    }

    public static double sub(double num1, double num2){
        double result = num1 - num2;
        return result;

    }//end of sub
    public static double div(double num1, double num2){
        double result;
        if (num2 == 0)
        {
            System.out.println("you cant divide it by zero");
            result = 0;
        }
        else {
            result = num1 / num2;
        }

        return result;
    }//end of div

    public static double mult(double num1, double num2){
        double result = num1*num2;
        return result;
    }//end of mult

}//end of app
