package esiea.td.math;

public final class MathUtils{
    private MathUtils(){
        // Utility class
    }

    public static int Add(int first1, int second1)
    {
        return first1 + second1;
    }

    public static float Add(float first1, float second1)
    {
        return first1 + second1;
    }

    public static int Subtract(int first, int second)
    {
        return first - second;
    }

    public static float Subtract(float first, float second)
    {
        return first - second;
    }

    public static int Multiply(int multiplicand, int multiplier)
    {
        return multiplicand * multiplier;
    }

    public static float Multiply(float multiplicand, float multiplier)
    {
        return multiplicand * multiplier;
    }

    public static float Divide(int dividend, int divisor)
    {
        if (divisor == 0)
        {
            throw new ArithmeticException("Cannot divide by zero (0).");
        }

        return (float) dividend / divisor;
    }

    public static float Divide(float dividend, float divisor)
    {
        if (divisor == 0.0)
        {
            throw new ArithmeticException("Cannot divide by zero (0).");
        }

        return dividend / divisor;
    }
}
