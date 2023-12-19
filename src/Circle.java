import java.math.BigDecimal;

public class Circle extends Calculate {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        BigDecimal area = new BigDecimal(Math.PI * radius * radius);
        area = area.setScale(2, BigDecimal.ROUND_HALF_UP);
        return area.doubleValue();
    }

    @Override
    public double calculatePerimeter() {
        BigDecimal perimeter = new BigDecimal(2 * Math.PI * radius);
        perimeter = perimeter.setScale(2, BigDecimal.ROUND_HALF_UP);
        return perimeter.doubleValue();
    }
}
