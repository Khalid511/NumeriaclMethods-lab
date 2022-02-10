public class FalsePosition {
    public static void falsePosition(double a, double b) {
        double c = 0;
        while((b-a)>=0.00001) {
            c = a - ((Equation.eqTion(a)*(b-a))/(Equation.eqTion(b) - Equation.eqTion(a)));
            if(Equation.eqTion(a)*Equation.eqTion(c)<0)
                b = c;
            else if(Equation.eqTion(a)*Equation.eqTion(c)>0)
                a = c;
            else
                break;
        }

        System.out.println("Root = "+c);
    }
}