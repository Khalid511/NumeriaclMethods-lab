import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanNum = new Scanner(System.in);
        double a, b;
        while(true) {
            a = scanNum.nextDouble();
            b = scanNum.nextDouble();
            if(Equation.eqnTion(a)*Equation.eqnTion(b)<0) {
                Bisection.opeRation(a, b);
                break;

            }

            else
                System.out.println("Enter the right interval please");

        }

    }
}