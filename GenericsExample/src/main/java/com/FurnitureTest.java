package com;

import java.util.List;

public class FurnitureTest {
	public void makeFurniture(List<? extends Furniture> list)
	{
		for(Furniture f:list)
		{
			f.make();
		}
	}
}
