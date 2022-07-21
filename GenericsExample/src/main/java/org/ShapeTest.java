package org;

import java.util.List;

public class ShapeTest {
public void drawShape(List<? extends Shape> list)
{
	for(Shape s:list)
	{
		s.draw();
	}
}
}
