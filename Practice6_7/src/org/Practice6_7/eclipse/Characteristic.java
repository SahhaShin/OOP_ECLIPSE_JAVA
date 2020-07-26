package org.Practice6_7.eclipse;
import java.util.Scanner;
public class Characteristic {
	
	String description;
	int rating;
	
	public Characteristic(String description){
		this.description=description;
		this.rating=0;
	}
	
	public void setRating(int aRating) {
		if(isValid(aRating)) {
			this.rating=aRating;
		}
		
	}
	public void setRating()
	{
	    Scanner keyboard = new Scanner(System.in);
	    System.out.print("Please Enter rating 1~10: ");
	    this.rating=keyboard.nextInt();
	    
	    while(!isValid(rating)) {
	    	System.out.print("Please Enter rating 1~10: ");
	    	rating=keyboard.nextInt();
	    }
	    
	}
	
	//isValid 라인 start
	private boolean isValid(int aRating) {
		if(aRating>=1&&aRating<=10) {
			return true;
		}
		else return false;
	}
	
	
	//isValid라인 end
	
	
	public String getDescription() {
		
		return description;
	}
	
	public int getRating() {
		return rating;
	}

	public double getCompatibility(Characteristic otherRating)
    {
        if(isMatch(otherRating))
        {
        	return getCompatibilityMeasure(otherRating);
        }
        else
        {
            return 0;
        }
    }
	private double getCompatibilityMeasure(Characteristic otherRating) {
		int rate1=getRating();
		int rate2=otherRating.getRating();
		double measure=0;
		if(rate1!=0&&rate2!=0) 
			measure=1-(Math.pow((rate1-rate2),2.0)/81);
		
		measure=Math.round(measure*1000.0)/1000.0;
		return measure;
	}
	
	
	private boolean isMatch(Characteristic otherRating)
	{
	    if(getDescription()==otherRating.getDescription())
	    {
	        return true;
	    }
	    else
	    {
	        return false;
	    }
	}

}
