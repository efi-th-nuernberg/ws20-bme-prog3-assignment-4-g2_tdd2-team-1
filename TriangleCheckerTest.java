import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleCheckerTest {
    
@Test

public void testNoneTriangleNegativeNumbers() {

// Arrange

float a = -2;

float b = -2;

float c = -2;

// Act

TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

// Assert

assertEquals(TriangleChecker.TriangleType.NONE, type);

}
    @Test
    public void testValidTriangle() {

        // Arrange
        float a = 2;
        float b = 3;
        float c = 4;

        // Act
        TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

        // Assert
        assertEquals(TriangleChecker.TriangleType.NORMAL, type);

    }

    
    @Test
    public void testEquilateralTriangle() {

      // Arrange
        float a = 3;
        float b = 3;
        float c = 3;

      // Act
      TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

      // Assert
      assertEquals(TriangleChecker.TriangleType.EQUILATERAL, type);
    }

    @Test
    public void testNoneTriangle() {

      // Arrange
        float a = 10;
        float b = 4;
        float c = 5;

      // Act
      TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

      // Assert
      assertEquals(TriangleChecker.TriangleType.NONE, type);
    }

    @Test
    public void testIsoscelesTriangle() {

      // Arrange
        float a = 6;
        float b = 6;
        float c = 5;

      // Act
      TriangleChecker.TriangleType type = TriangleChecker.checkTriangle(a, b, c);

      // Assert
      assertEquals(TriangleChecker.TriangleType.ISOSCELES, type);
    }


    
}
