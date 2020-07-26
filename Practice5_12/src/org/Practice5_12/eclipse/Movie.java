package org.Practice5_12.eclipse;


public class Movie {

	String movie_name;
	String MPAA_rating;
	
	//5가지 rate
	private int terrible_rate=0;//1
	private int bad_rate=0;//2
	private int ok_rate=0;//3
	private int good_rate=0;//4
	private int great_rate=0;//5
	
	private double average=0;
	
	
	//둘 다 입력안하는 acessor이 있을 수도
	public Movie()
	{
		movie_name = ".";
		MPAA_rating = ".";
	}

	//mpaa만 입력하는 acessor이 있을 수도
	public Movie(String initialName)
	{
		movie_name = initialName;
		MPAA_rating = ".";
	}
	//둘다 입력해주는 acessor이 있을수도
	public Movie(String initialName, String initialRating)
	{
		movie_name = initialName;
		MPAA_rating = initialRating;
	}
	
	
	
	

	//엑세서 세터
	public void setName(String newName)
	{
		movie_name = newName;
	}

	public void setRating(String newRating)
	{
		MPAA_rating = newRating;
	}

	
	//뮤테이터 게터

	public String getName()
	{
		return movie_name;
	}

	public String getRating()
	{
		return MPAA_rating;
	}
	
	//1~5점 사이인지 판별
	public void addRating(int rate) {
		if(rate==1) {
			this.terrible_rate++;
		}
		
		else if(rate==2) {
			this.bad_rate++;
		}
		
		else if(rate==3) {
			this.ok_rate++;
		}
		
		else if(rate==4) {
			this.good_rate++;
		}
		
		else if(rate==5) {
			this.great_rate++;
		}
		else {
			System.out.println("Please Enter a number 1~5");
		}
	}
	
	public double getAverage() {
		double average=(1*terrible_rate+2*bad_rate+3*ok_rate+4*good_rate+5*great_rate)/5.0;
		return average;
		
	}
	
	public void information()
	{
		System.out.println("*Information*");
		System.out.println("Name: " + getName());  
		System.out.println("Rating: " + getRating());
		System.out.println("Average: " + getAverage());
		System.out.println("terrible_rate: "+terrible_rate);
		System.out.println("bad_rate: "+bad_rate);
		System.out.println("ok_rate: "+ok_rate);
		System.out.println("good_rate: "+good_rate);
		System.out.println("great_rate: "+great_rate);
	}
	
	
	
	public boolean equal(Movie otherObject)
	{
		return (this.MPAA_rating.equalsIgnoreCase(otherObject.MPAA_rating)) && (this.average == otherObject.average);
	}
}
