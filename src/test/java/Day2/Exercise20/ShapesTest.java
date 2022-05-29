package Day2.Exercise20;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapesTest {
    @Test
    void shouldCalculatePerimeterForRectangle(){
        //given
        Shape rectangle = new Rectangle(3, 4);
        //when
        double result = rectangle.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(14);
    }
    @Test
    void shouldCalculatePerimeterForTriangle(){
        //given
        Shape triangle = new Triangle(3, 4, 5);
        //when
        double result = triangle.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(12);
    }
    @Test
    void shouldCalculatePerimeterForHexagon(){
        //given
        Shape hexagon = new Hexagon(3);
        //when
        double result = hexagon.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(18);
    }

}