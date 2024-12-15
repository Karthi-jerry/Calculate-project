import java.util.Scanner;

public class Calcuate {
    public static void main(String[] args) {
        
          Scanner scan = new Scanner(System.in);

          int num1 = scan.nextInt();

          int num2 = scan.nextInt();

          char operator = scan.next().charAt(0);

          int result = 0;

          switch (operator) {
            case '+':
                result = num1+num2;
                break;
            case '-':
            result = num1 - num2;
            break;
            case '*':
            result = num1*num2;
            break;
            case '/':
            if (num2 !=0) {
                result = num1/num2;
            }
            else{
                 System.out.println("Not Allowed");
            }
            break;
          
            default:
            System.out.println("Not valid operator");
                break;
          
            }

            System.err.println("Result :"+ result);



    
}
}