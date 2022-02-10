public class Bisection {
    static void opeRation(double a, double b) {
        double c = 0;

        while((b-a)>=0.00001) {
            c = (a+b)/2;

            if(Equation.eqnTion(a)*Equation.eqnTion(c)<0)
                b = c;
            else if(Equation.eqnTion(b)*Equation.eqnTion(c)<0)
                a = c;
            else {

                break;
            }
        }
        System.out.println("The root = "+c);
    }
}
