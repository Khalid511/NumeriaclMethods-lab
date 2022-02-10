import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        double a = scanNum.nextDouble();
        double b = scanNum.nextDouble();
        while(true) {
            if(Equation.eqTion(a)*Equation.eqTion(b)<0) {
                FalsePosition.falsePosition(a, b);
                break;
            }

            else
                System.out.println("Please enter a valid interval!");
        }
    }
}