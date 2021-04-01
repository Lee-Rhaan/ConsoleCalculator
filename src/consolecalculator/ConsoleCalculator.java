/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolecalculator;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Maggie
 */
class Calculator
{
    int intInput1;
    int intInput2;
    
    void mSubtraction()
    {
        System.out.print("The value is: ");
        System.out.println(intInput1 - intInput2);
    }
    
    void mAddition()
    {
        System.out.print("The value is: ");
        System.out.println(intInput1 + intInput2);
    }
    
    void mMultiplication()
    {
        System.out.print("The value is: ");
        System.out.println(intInput1 * intInput2);
    }
    
    void mDivision()
    {
        System.out.print("The value is: ");
        System.out.println(intInput1 / intInput2);
    }
}

public class ConsoleCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Calculator clsCalc = new Calculator();
        char choice;
        Scanner sc = new Scanner(System.in);
        
        do
        {
            System.out.println("Choose an option below: ");
            System.out.println("  '1'. Addition");
            System.out.println("  '2'. Subtraction");
            System.out.println("  '3'. Multiplication");
            System.out.println("  '4'. Division \n");
            System.out.println("Enter option below: ");
            choice = (char) System.in.read();
        }
        while(choice < '1' || choice > '4');
        {
            
        }
        
        switch(choice)
        {
            case '1' : System.out.println("Enter number below: ");
            clsCalc.intInput1 = sc.nextInt();
            System.out.println("Enter second number below: ");
            clsCalc.intInput2 = sc.nextInt();
            clsCalc.mAddition();
            break;
            
            case '2' : System.out.println("Enter number below: ");
            clsCalc.intInput1 = sc.nextInt();
            System.out.println("Enter second number below: ");
            clsCalc.intInput2 = sc.nextInt();
            clsCalc.mSubtraction();
            break;
            
            case '3' : System.out.println("Enter number below: ");
            clsCalc.intInput1 = sc.nextInt();
            System.out.println("Enter second number below: ");
            clsCalc.intInput2 = sc.nextInt();
            clsCalc.mMultiplication();
            break;
            
            case '4' : System.out.println("Enter number below: ");
            clsCalc.intInput1 = sc.nextInt();
            System.out.println("Enter second number below: ");
            clsCalc.intInput2 = sc.nextInt();
            clsCalc.mDivision();
            break;
        }
    }
    
}
