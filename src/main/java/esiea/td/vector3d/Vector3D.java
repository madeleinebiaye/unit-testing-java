package esiea.td.vector3d;

public class Vector3D extends Entity3D{
    public Vector3D(){
        super();
    }

    public Vector3D(Entity3D entity3D){
        super(entity3D);
    }

    public Vector3D(double x, double y, double z) {
        super(x, y, z);
    }

    /// <summary>
    /// Sets this vector to the vector cross product of vector one and vector two
    /// </summary>
    /// <param name="vector1">First vector</param>
    /// <param name="vector2">Second vector</param>
    public void Cross(Vector3D vector1, Vector3D vector2){
        setX(vector1.getY() * vector2.getZ() - vector1.getZ() * vector2.getY());
        setY(vector2.getX() * vector1.getZ() - vector2.getZ() * vector1.getX());
        setZ(vector1.getX() * vector2.getY() - vector1.getY() * vector2.getX());
    }

    /// <summary>
    /// Returns the dot product of this vector and another one.
    /// </summary>
    /// <param name="vector">Input vector</param>
    /// <returns>Dot product of both vectors</returns>
    public double Dot(Vector3D vector){
        return getX() * vector.getX() + getY() * vector.getY() + getZ() * vector.getZ();
    }

    /// <summary>
    /// Returns the length (magnitude) of this vector
    /// </summary>
    /// <see cref="https://mathinsight.org/definition/magnitude_vector"/>
    /// <returns>Vector length</returns>
    public double Length(){
        return Math.sqrt(getX() * getX() + getY() * getX() + getZ() * getX());
    }
}
