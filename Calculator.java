import java.util.Scanner;
public  class Calculator 
{
    public static void main(String[] args) 
    {
        int x, y, opt, add, sub, mul;
        double div;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        x = s.nextInt();
        System.out.print("Enter the second number:");
        y = s.nextInt();
        while(true)
        {
            System.out.println("Enter 1 for addition");
            System.out.println("Enter 2 for subtraction");
            System.out.println("Enter 3 for multiplication");
            System.out.println("Enter 4 for division");
            System.out.println("Enter 5 to Exit");
            opt = s.nextInt();
            switch(opt)
            {
                case 1:
                add = x + y;
                System.out.println("Result: "+add);
                break;
 
                case 2:
                sub = x - y;
                System.out.println("Result: "+sub);
                break;
 
                case 3:
                mul = x * y;
                System.out.println("Result: "+mul);
                break;
 
                case 4:
                div = (double)x / y;
                System.out.println("Result: "+div);
                break;    
 
                case 5:
                System.out.println("Thank you for your participation, Good Bye!!!");
                System.exit(0);
                
                default:
                System.out.println("please enter a valid option");	
            }
        }
    }
}