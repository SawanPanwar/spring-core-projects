package com.rays.autowire.notype;

public class Review {

	private String comment;

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "Review [comment=" + comment + "]";
	}

}
