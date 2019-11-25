package trianglepackage;

import org.junit.jupiter.api.*;

public class TriangleTest {

    private Triangle triangle;
    @BeforeEach
    public void setup(){
        triangle = new Triangle(3,3,3);
    }

    @Test
    void testGetPerimeter(){
        int expected = 9;
        Assertions.assertEquals(expected,triangle.getPerimeter(),"Should be 9.");
    }
}
