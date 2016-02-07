package com.ust;


/**
 * Hello world!
 *
 */
public class App  implements java.io.Serializable
{
   /**
	 * 
	 */
	private static final long serialVersionUID = 3152413949083861783L;
	@org.kie.api.definition.type.Label(value = "totalCost")
private int totalCost; 

public int getTotalCost() {
	return totalCost;
}

public void setTotalCost(int totalCost) {
	this.totalCost = totalCost;
}
}
