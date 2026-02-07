package stream_api;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;


class Movie{
	private String name;
	private double rating;
	private int releaseYear;
	
	
	public Movie(String name, double rating, int releaseYear) {
		this.name = name;
		this.rating = rating;
		this.releaseYear = releaseYear;
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getRating() {
		return rating;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	@Override
	public String toString() {
	    return "Movie Name: " + name +
	           ", Rating: " + rating +
	           ", Release Year: " + releaseYear;
	}
	
}

public class TopFiveTrendingMovies {

	public static void main(String[] args) {
		
		List<Movie> movieList=new ArrayList<>();
		movieList.add(new Movie("Inception", 8.8, 2010));
        movieList.add(new Movie("Interstellar", 8.6, 2014));
        movieList.add(new Movie("Joker", 8.5, 2019));
        movieList.add(new Movie("Avengers: Endgame", 8.4, 2019));
        movieList.add(new Movie("The Dark Knight", 9.0, 2008));
        movieList.add(new Movie("Dune", 8.2, 2021));
        movieList.add(new Movie("Tenet", 7.5, 2020));
        
        List<Movie>top5TrendingMovies=movieList.stream()
        		.filter(movie ->movie.getRating()>=7.8)
        		.sorted(Comparator.comparing(Movie::getRating).reversed()
        				.thenComparing(Movie::getReleaseYear).reversed())
        		.limit(5)
        		.collect(Collectors.toList());
        
        System.out.println("Top 5 Trending Movies:");
        top5TrendingMovies.forEach(System.out::println);
        
	}
}
