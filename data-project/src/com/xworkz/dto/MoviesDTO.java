package com.xworkz.dto;

import java.util.Arrays;

public class MoviesDTO {
	private String name;
	private String type;
	private String director;
	private String language;
	private Double rating;
	private Double budget;
	private String hero;
	private String heroine;
	private Integer noOfSongs;
	private String[] producers;
	private String cinematography;
	private String screenPlayBy;
	private String storyBy;
	private String editedBy;
	private String country;

	public MoviesDTO() {
		System.out.println("default constructor");
	}

	@Override
	public String toString() {
		return "MoviesDTO [name=" + name + ", type=" + type + ", director=" + director + ", language=" + language
				+ ", rating=" + rating + ", budget=" + budget + ", hero=" + hero + ", heroine=" + heroine
				+ ", noOfSongs=" + noOfSongs + ", producer=" + Arrays.toString(producers) + ", cinematography="
				+ cinematography + ", screenPlayBy=" + screenPlayBy + ", storyBy=" + storyBy + ", editedBy=" + editedBy
				+ ", country=" + country + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Double getRating() {
		return rating;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public Double getBudget() {
		return budget;
	}

	public void setBudget(Double budget) {
		this.budget = budget;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	public Integer getNoOfSongs() {
		return noOfSongs;
	}

	public void setNoOfSongs(Integer noOfSongs) {
		this.noOfSongs = noOfSongs;
	}

	public String[] getProducers() {
		return producers;
	}

	public void setProducers(String[] producers) {
		this.producers = producers;
	}

	public String getCinematography() {
		return cinematography;
	}

	public void setCinematography(String cinematography) {
		this.cinematography = cinematography;
	}

	public String getScreenPlayBy() {
		return screenPlayBy;
	}

	public void setScreenPlayBy(String screenPlayBy) {
		this.screenPlayBy = screenPlayBy;
	}

	public String getStoryBy() {
		return storyBy;
	}

	public void setStoryBy(String storyBy) {
		this.storyBy = storyBy;
	}

	public String getEditedBy() {
		return editedBy;
	}

	public void setEditedBy(String editedBy) {
		this.editedBy = editedBy;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
