package esiea.td.vector3d;

public class VectorMathsTools{
    public static long DoubleToLongBits(double baseDouble){
        // Check for +0 or -0
        return baseDouble == 0f ? 0L : Double.doubleToLongBits(baseDouble);
    }
}
