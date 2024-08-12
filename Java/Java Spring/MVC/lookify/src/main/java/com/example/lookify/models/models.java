package com.example.lookify.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Size;

@Entity
public class Song{
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    @Size(min = 5, message = "Title must be at least 5 characters")
	    private String title;
	    
	    @Size(min = 5, message = "Artist must be at least 5 characters")
	    private String artist;

	    @Min(value = 1, message = "Rating must be between 1 and 10")
	    @Max(value = 10, message = "Rating must be between 1 and 10")
	    private int rating;
	    
	    public Song() {
			// TODO Auto-generated constructor stub
		}

		public Song(String title, String artist, int rating) {
			super();
			this.title = title;
			this.artist = artist;
			this.rating = rating;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getArtist() {
			return artist;
		}

		public void setArtist(String artist) {
			this.artist = artist;
		}

		public int getRating() {
			return rating;
		}

		public void setRating(int rating) {
			this.rating = rating;
		}

		@Override
		public String toString() {
			return "Lookify [id=" + id + ", title=" + title + ", artist=" + artist + ", rating=" + rating + "]";
		}


	   
	    
}
}
