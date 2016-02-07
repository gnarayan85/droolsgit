package com.ust;

import java.io.Serializable;

/**
 * Hello world!
 *
 */
public class App  implements Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 3152413949083861783L;
private int totalCost;

public int getTotalCost() {
	return totalCost;
}

public void setTotalCost(int totalCost) {
	this.totalCost = totalCost;
}
}
