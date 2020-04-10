package com.training.consumer.demo;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Movie {

	 String moviename;
	 String hero;
	 String heroine;
	
	public Movie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Movie(String moviename, String hero, String heroine) {
		super();
		this.moviename = moviename;
		this.hero = hero;
		this.heroine = heroine;
	}
	



	public static void addMovie(ArrayList<Movie> list) {
		list.add(new Movie("Jaane tu ya Jaane na", "Imran Khan", "Genelia Dsouza"));
		list.add(new Movie("Ye jawani hai deewani", "Ranbir Kapoor", "Deepika Padukone"));
		list.add(new Movie("Street Dancer 3d", "Varun Dhawan", "Shradha Kapoor"));
	}
	
	public static void main(String[] args) {
		
		ArrayList<Movie> list = new ArrayList<Movie>();
		addMovie(list);
		
		Consumer<Movie> c = m -> {
			System.out.println("Movie Name: " + m.moviename);
			System.out.println("Hero: " + m.hero);
			System.out.println("Heroine: " + m.heroine);
		};
		
		for(Movie m : list) {
			c.accept(m);
		}
		
	}
	
	
	}
