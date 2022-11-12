public class Math_Class {

    private double x,y,rad;

    public Math_Class() {

    }
    public  Math_Class(double x){
        this.x = x;
        rad = x * Math.PI / 180.0;
    }

    public double calculate() throws CalcException {
            try{
                    y = Math.tan(x)/(Math.sin(4*x) - 2 * Math.cos(x) );

                if (y==Double.NaN || y==Double.NEGATIVE_INFINITY ||
                        y==Double.POSITIVE_INFINITY || x==90 || x== -90)
                    throw new ArithmeticException();
            }
            catch (ArithmeticException ex)
            {
                    if(x == rad/2 || x == (3*rad)/2||(Math.sin(4*x) - 2 * Math.cos(x) == 0))
                        throw new CalcException("Exception reason: Illegal value of X for tangent calculation");

                    else
                        throw new CalcException("Unknown reason of the exception during exception calculation");
            }


        return y;
    }
}
