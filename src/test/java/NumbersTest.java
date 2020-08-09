import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {
    private Sphere sphere;
    private Float radius;

    @Before
    public void init() {
        radius = 3.0f;
        sphere = new Sphere(radius);
    }

    /**
     * ACCEPTANCE CRITERIA
     * Create sphere with a radius
     * Calculate volume
     * Calculate radius of sphere
     */
    @Test
    public void createSphere() {
        // 1: Setup
        // 2: Exercise
        // 3: Assert
        assertNotNull(sphere);
        assertEquals(sphere.getRadius(), radius);

        // 4: Teardown
    }

    @Test
    public void createSphereVolume(){
        // 1: Setup
        double volume = 113.1;

        // 2: Exercise
        // 3: Assert
        assertEquals(sphere.getVolume(), volume, 1);
        // 4: Teardown
    }
}
