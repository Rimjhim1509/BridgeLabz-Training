package com.streamapi;

import java.util.Comparator;
import java.util.List;

class Movie {
    String name;
    double rating;
    int releaseYear;

    Movie(String name, double rating, int releaseYear) {
        this.name = name;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }
}

public class Top5Movies {
	public static void main(String[] args) {
		List<Movie> movies = List.of(
	            new Movie("Movie A", 8.5, 2022),
	            new Movie("Movie B", 9.0, 2023),
	            new Movie("Movie C", 7.8, 2021),
	            new Movie("Movie D", 8.9, 2023),
	            new Movie("Movie E", 9.2, 2020),
	            new Movie("Movie F", 8.7, 2022),
	            new Movie("Movie G", 9.1, 2024)
	        );
		//Use filter(), sorted(), limit().
		movies.stream().filter(m -> m.rating >=8.5);
		movies.stream().sorted(Comparator
				.comparingDouble((Movie m)-> m.rating).thenComparingInt(m->m.releaseYear).reversed())
		.limit(5)
		.forEach(m -> System.out.println(m.releaseYear + " | "+ m.name+"| "+m.rating));
	}
}
