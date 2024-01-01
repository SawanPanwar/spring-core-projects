package com.rays.autowire.bytype;

public class Movie {

	private String title;
	private Review review;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Review getReview() {
		return review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", review=" + review + "]";
	}

}
