package org.Practice6_2_1.org;

enum Suit
{
	CLUBS("black"), DIAMONDS("red"), HEARTS("red"), SPADES("black");
	
	
	private final String color;
	
	private Suit(String suitColor) {
		
		color=suitColor;

	}
	
	public String getColor() {
		
		return color;
	}
}



