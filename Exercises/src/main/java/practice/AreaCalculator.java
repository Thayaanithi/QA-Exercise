package practice;

import javafx.scene.shape.Circle;

public class AreaCalculator {
	public double calculateAreaRectangle(Rectangle rect){
        return rect.getLength() * rect.getWidth();
    }
    public double calculateAreaCircle(Circle circle){
        return circle.getRadius() * circle.getRadius() * Math.PI;
    }
}
