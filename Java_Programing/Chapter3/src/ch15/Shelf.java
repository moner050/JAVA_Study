package ch15;

import java.util.ArrayList;

public class Shelf {

	// 상속을 방지하기 위해서 
	protected ArrayList<String> shelf;
	
	public Shelf()
	{
		shelf = new ArrayList<String>();
	}
	
	public ArrayList<String> getShelf()
	{
		return shelf;
	}
	
	public int getCount()
	{
		return shelf.size();
	}
	
}
