package com.RobertLafore.Tree234;

//tree234.java
//demonstrates 234 tree
//to run this program: C>java Tree234App

////////////////////////////////////////////////////////////////
class DataItem {

	public long dData; // one data item

	// --------------------------------------------------------------
	public DataItem(long dd) // constructor
	{
		dData = dd;
	}

	// --------------------------------------------------------------
	public void displayItem() // display item, format “/27”
	{
		System.out.print(" / " + dData);
	}
	// --------------------------------------------------------------
} // end class DataItem
// //////////////////////////////////////////////////////////////