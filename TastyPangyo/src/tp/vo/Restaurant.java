package tp.vo;

import java.io.Serializable;
import java.util.List;

public class Restaurant  implements Serializable{

	
	private int restaurantId;
	private String foodCategory, location, restaurantName, restaurantTelNum, introduction;
	private int hits;
	private List<Review> reviewList;
	
	public Restaurant(){}

	
	
	
}
