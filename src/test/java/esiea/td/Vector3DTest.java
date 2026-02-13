package esiea.td;


import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import esiea.td.vector3d.Vector3D;

public class Vector3DTest {

    @Test
    void TestVoidConstructor() {
        Vector3D v = new Vector3D();
        assertEquals(0.0, v.getX());
        assertEquals(0.0, v.getY());
        assertEquals(0.0, v.getZ());
    }

    @Test
    void TestConstructorWithValues() {
        Vector3D v = new Vector3D(1, 2, 3);
        assertEquals(1, v.getX());
        assertEquals(2, v.getY());
        assertEquals(3, v.getZ());
    }

    @Test
    void TestCopyConstructor() {
        Vector3D original = new Vector3D(4, 5, 6);
        Vector3D copy = new Vector3D(original);

        assertEquals(original.getX(), copy.getX());
        assertEquals(original.getY(), copy.getY());
        assertEquals(original.getZ(), copy.getZ());
    }

    @Test
    void TestDotProduct() {
        Vector3D v1 = new Vector3D(1, 2, 3);
        Vector3D v2 = new Vector3D(4, 5, 6);

        double dot = v1.Dot(v2);

        assertEquals(32, dot); // 1*4 + 2*5 + 3*6
    }

    @Test
    void TestCrossProduct() {
        Vector3D v1 = new Vector3D(1, 0, 0);
        Vector3D v2 = new Vector3D(0, 1, 0);
        Vector3D result = new Vector3D();

        result.Cross(v1, v2);

        assertEquals(0, result.getX());
        assertEquals(0, result.getY());
        assertEquals(1, result.getZ());
    }

    @Test
    void TestLength() {
        Vector3D v = new Vector3D(3, 4, 12);

        double length = v.Length();

        assertEquals(13, length);
    }
}
