package org.Practice5_12.eclipse;


public class MoviePlay {

	public static void main(String[] args) {
		System.out.println("\n---------movie1 add---------\n");
		Movie movie1 = new Movie("Captain"); 
		movie1.information();
		
		System.out.println("\n---------set the Movie Name---------\n");
		movie1.setName("Captain");
		
		
		System.out.println("\n---------set the MPAA rating---------\n");
		movie1.setRating("R");
		movie1.information();
		
		System.out.println("\n---------set the 5rating---------\n");
		movie1.addRating(1);
		movie1.addRating(2);
		movie1.addRating(3);
		movie1.addRating(4);
		movie1.addRating(5);
		movie1.information();
		
		
		System.out.println("\n\n\n---------movie2 add---------\n");
		Movie movie2 = new Movie("LALALAND", "PG");
		
		System.out.println("\n---------set the 5rating---------\n");
		movie2.addRating(4);
		movie2.addRating(5);
		movie2.addRating(3);
		movie2.addRating(4);
		movie2.addRating(5);
		
		movie2.information();
		System.out.println("\n\nmovie1 and movie2 equal?: " + movie1.equal(movie2));

	}

}
