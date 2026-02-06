package esiea.td;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import esiea.td.vector3d.Entity3D;

public class Entity3DTest {

    @Test
    void TestEntity3DVoidConstructor() {
        Entity3D e = new Entity3D();
        assertEquals(0.0, e.getX());
        assertEquals(0.0, e.getY());
        assertEquals(0.0, e.getZ());
    }

    @Test
    void TestEntity3DCopyConstructor() {
        Entity3D original = new Entity3D(1, 2, 3);
        Entity3D copy = new Entity3D(original);

        assertEquals(original.getX(), copy.getX());
        assertEquals(original.getY(), copy.getY());
        assertEquals(original.getZ(), copy.getZ());
    }

    @Test
    void TestEntity3DConstructor() {
        Entity3D e = new Entity3D(4, 5, 6);
        assertEquals(4, e.getX());
        assertEquals(5, e.getY());
        assertEquals(6, e.getZ());
    }

    @Test
    void TestToString() {
        Entity3D e = new Entity3D(1, 2, 3);
        assertEquals("(1.0,2.0,3.0)", e.toString());
    }

    @Test
    void TestScale() {
        Entity3D e = new Entity3D(1, 2, 3);
        e.Scale(2);

        assertEquals(2, e.getX());
        assertEquals(4, e.getY());
        assertEquals(6, e.getZ());
    }

    @Test
    void TestScaleEntity() {
        Entity3D base = new Entity3D(1, 2, 3);
        Entity3D target = new Entity3D();

        target.Scale(3, base);
        assertEquals(3, target.getX());
        assertEquals(6, target.getY());
        assertEquals(9, target.getZ());
    }

    @Test
    void TestAdd() {
        Entity3D e1 = new Entity3D(1, 1, 1);
        Entity3D e2 = new Entity3D(2, 3, 4);

        e1.Add(e2);

        assertEquals(3, e1.getX());
        assertEquals(4, e1.getY());
        assertEquals(5, e1.getZ());
    }

    @Test
    void TestHashCode() {
        Entity3D e1 = new Entity3D(1, 2, 3);
        Entity3D e2 = new Entity3D(1, 2, 3);

        assertEquals(e1.hashCode(), e2.hashCode());
    }

    @Test
    void TestEquals() {
        Entity3D e1 = new Entity3D(1, 2, 3);
        Entity3D e2 = new Entity3D(1, 2, 3);

        assertTrue(e1.equals(e2));
    }

    @Test
    void TestEpsilonEquals() {
        Entity3D e1 = new Entity3D(1, 2, 3);
        Entity3D e2 = new Entity3D(1.001, 2.001, 3.001);

        assertTrue(e1.EpsilonEquals(e2, 0.01));
        assertFalse(e1.EpsilonEquals(e2, 0.0001));
    }
}
