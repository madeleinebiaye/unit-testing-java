package esiea.td.vector3d;

public class Entity3D {
    public Entity3D(){
        X = 0f;
        Y = 0f;
        Z = 0f;
    }

    public Entity3D(Entity3D entity3D){
        X = entity3D.X;
        Y = entity3D.Y;
        Z = entity3D.Z;
    }

    public Entity3D(double x, double y, double z){
        setX(x);
        setY(y);
        setZ(z);
    }

    private double X;
    private double Y;
    private double Z;

    public double getX() {
        return X;
    }

    protected void setX(double x) {
        this.X = x;
    }

    public double getY() {
        return Y;
    }

    protected void setY(double y) {
        this.Y = y;
    }

    public double getZ() {
        return Z;
    }

    protected void setZ(double z) {
        this.Z = z;
    }

    /// <summary>
    /// Sets the value of this entity to the scalar multiplication of itself
    /// </summary>
    /// <param name="scale">Scale factor to apply</param>
    public void Scale(double scale){
        X *= scale;
        Y *= scale;
        Z *= scale;
    }

    /// <summary>
    /// Sets the value of this entity to the scalar multiplication of the given entity
    /// </summary>
    /// <param name="scale">Scale factor to apply</param>
    /// <param name="entity3D">Base entity</param>
    public void Scale(double scale, Entity3D entity3D){
        X = scale * entity3D.X;
        Y = scale * entity3D.Y;
        Z = scale * entity3D.Z;
    }

    /// <summary>
    /// Sets the value of this entity to the sum of itself and the given entity
    /// </summary>
    /// <param name="entity3D">Entity to add</param>
    public void Add(Entity3D entity3D){
        X += entity3D.X;
        Y += entity3D.Y;
        Z += entity3D.Z;
    }

    /// <summary>
    /// Returns a string that contains the values of this Entity3d.
    /// The form is (x,y,z), with three decimal places.
    /// </summary>
    /// <returns>String representation of the Entity3D</returns>
    /// @Override
    public String toString(){
        return "(" + X + "," + Y + "," + Z + ")";
    }

    @Override
    public int hashCode(){
        long bits = 31L + Double.doubleToLongBits(X);
        bits = 31L * bits + Double.doubleToLongBits(Y);
        bits = 31L * bits + Double.doubleToLongBits(Z);
        return (int) (bits ^ (bits >> 32));
    }

    /// <summary>
    /// Tests for equality of the current Entity3d with an object passed in parameter
    /// </summary>
    /// <param name="obj">Object to compate to</param>
    /// <returns>True if equal, false otherwise</returns>
    @Override
    public boolean equals(Object obj){
        Entity3D entity3d = (Entity3D) obj;
        return X == entity3d.X && Y == entity3d.Y;
    }

    /// <summary>
    /// Returns true if the distance between this entity and entity t1 is less than or equal to the epsilon parameter,  otherwise returns false.
    /// The max distance is equal to MAX[abs(x1-x2), abs(y1-y2), abs(z1-z2)].
    /// </summary>
    /// <param name="entity3D">Entity3D to compate to</param>
    /// <param name="epsilon">Epsilon value</param>
    /// <returns>True if equal, false otherwise</returns>
    public boolean EpsilonEquals(Entity3D entity3D, double epsilon){
        double difference = X - entity3D.X;

        if (Double.isNaN(difference)) return false;
        if ((difference < 0 ? -difference : difference) > epsilon) return false;

        difference = Y - entity3D.Y;
        if (Double.isNaN(difference)) return false;
        if ((difference < 0 ? -difference : difference) > epsilon) return false;

        difference = Z - entity3D.Z;
        if (Double.isNaN(difference)) return false;
        if ((difference < 0 ? -difference : difference) > epsilon) return false;

        return true;
    }
}
