package com;

import java.util.ArrayList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	List<Chair> chairList=new ArrayList();
	Chair c1=new Chair();
	Chair c2=new Chair();
	Chair c3=new Chair();
	chairList.add(c1);
	chairList.add(c2);
	chairList.add(c3);
	FurnitureTest obj=new FurnitureTest();
	obj.makeFurniture(chairList);
	
	List<Table>tableList=new ArrayList();
	Table t1=new Table();
	Table t2=new Table();
	Table t3=new Table();
	tableList.add(t1);
	tableList.add(t2);
	tableList.add(t3);
	obj.makeFurniture(tableList);
}
}
