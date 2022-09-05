package com.xworkz.dto.data;

import java.io.Serializable;

public class FilmDTO implements Serializable {
	private String name;
	private String language;
	private String hero;
	private String heroine;
	private String director;
	private String producer;
	private String type;
	private double budget;
	private int ageOfHero;
	private int ageOfHeroine;

	private boolean subtitles;
	private double heightOfHero;
	private double heightOfHeroine;
	private String Writer;
	private double rating;
	private String editing;
	private double sizeOfFilm;
	private int noOfLanguages;
	private int noOfLocationUsed;
	private int noOfSongs;

	private String singerName;
	private String typeOfCameraUsed;
	private int noOfCameraUsed;
	private double priceOfCamera;
	private int noOfCostumesUsed;
	private String typeOfVideo;
	private double cameraPixels;
	private String songCompositionBy;
	private int noOfComedians;
	private int noOfKissingScene;

	private boolean familyMovie;
	private String filmGrade;
	private int noOfShootingDays;
	private int noOfShootingLocations;
	private double noOfAwards;
	private String villainName;
	private int ageOfVillain;
	private int noOfActors;
	private int noOfActress;
	private int noOfVehiclesUsed;

	private int noOfShoesUsed;
	private int noOfBikesUsed;
	private int noOfCarsUsed;
	private int noOfDogsUsed;
	private boolean dogsUsed;

	public FilmDTO() {
		System.out.println("Default constructor");
	}

	@Override
	public int hashCode() {

		return 21;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("it is not null");
			if (obj instanceof FilmDTO) {
				FilmDTO c = (FilmDTO) obj;
				if (c.name.equals(this.name) && c.language.equals(this.language)) {
					System.out.println(this.name + " & " + this.language);
					return true;
				} else {
					System.err.println("it is not equal");
				}
			} else {
				System.err.println("it is not instanceof");
			}
		}
		return super.equals(obj);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public int getAgeOfHero() {
		return ageOfHero;
	}

	public void setAgeOfHero(int ageOfHero) {
		this.ageOfHero = ageOfHero;
	}

	public int getAgeOfHeroine() {
		return ageOfHeroine;
	}

	public void setAgeOfHeroine(int ageOfHeroine) {
		this.ageOfHeroine = ageOfHeroine;
	}

	public boolean isSubtitles() {
		return subtitles;
	}

	public void setSubtitles(boolean subtitles) {
		this.subtitles = subtitles;
	}

	public double getHeightOfHero() {
		return heightOfHero;
	}

	public void setHeightOfHero(double heightOfHero) {
		this.heightOfHero = heightOfHero;
	}

	public double getHeightOfHeroine() {
		return heightOfHeroine;
	}

	public void setHeightOfHeroine(double heightOfHeroine) {
		this.heightOfHeroine = heightOfHeroine;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String writer) {
		Writer = writer;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public String getEditing() {
		return editing;
	}

	public void setEditing(String editing) {
		this.editing = editing;
	}

	public double getSizeOfFilm() {
		return sizeOfFilm;
	}

	public void setSizeOfFilm(double sizeOfFilm) {
		this.sizeOfFilm = sizeOfFilm;
	}

	public int getNoOfLanguages() {
		return noOfLanguages;
	}

	public void setNoOfLanguages(int noOfLanguages) {
		this.noOfLanguages = noOfLanguages;
	}

	public int getNoOfLocationUsed() {
		return noOfLocationUsed;
	}

	public void setNoOfLocationUsed(int noOfLocationUsed) {
		this.noOfLocationUsed = noOfLocationUsed;
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}

	public String getSingerName() {
		return singerName;
	}

	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}

	public String getTypeOfCameraUsed() {
		return typeOfCameraUsed;
	}

	public void setTypeOfCameraUsed(String typeOfCameraUsed) {
		this.typeOfCameraUsed = typeOfCameraUsed;
	}

	public int getNoOfCameraUsed() {
		return noOfCameraUsed;
	}

	public void setNoOfCameraUsed(int noOfCameraUsed) {
		this.noOfCameraUsed = noOfCameraUsed;
	}

	public double getPriceOfCamera() {
		return priceOfCamera;
	}

	public void setPriceOfCamera(double priceOfCamera) {
		this.priceOfCamera = priceOfCamera;
	}

	public int getNoOfCostumesUsed() {
		return noOfCostumesUsed;
	}

	public void setNoOfCostumesUsed(int noOfCostumesUsed) {
		this.noOfCostumesUsed = noOfCostumesUsed;
	}

	public String getTypeOfVideo() {
		return typeOfVideo;
	}

	public void setTypeOfVideo(String typeOfVideo) {
		this.typeOfVideo = typeOfVideo;
	}

	public double getCameraPixels() {
		return cameraPixels;
	}

	public void setCameraPixels(double cameraPixels) {
		this.cameraPixels = cameraPixels;
	}

	public String getSongCompositionBy() {
		return songCompositionBy;
	}

	public void setSongCompositionBy(String songCompositionBy) {
		this.songCompositionBy = songCompositionBy;
	}

	public int getNoOfComedians() {
		return noOfComedians;
	}

	public void setNoOfComedians(int noOfComedians) {
		this.noOfComedians = noOfComedians;
	}

	public int getNoOfKissingScene() {
		return noOfKissingScene;
	}

	public void setNoOfKissingScene(int noOfKissingScene) {
		this.noOfKissingScene = noOfKissingScene;
	}

	public boolean isFamilyMovie() {
		return familyMovie;
	}

	public void setFamilyMovie(boolean familyMovie) {
		this.familyMovie = familyMovie;
	}

	public String getFilmGrade() {
		return filmGrade;
	}

	public void setFilmGrade(String filmGrade) {
		this.filmGrade = filmGrade;
	}

	public int getNoOfShootingDays() {
		return noOfShootingDays;
	}

	public void setNoOfShootingDays(int noOfShootingDays) {
		this.noOfShootingDays = noOfShootingDays;
	}

	public int getNoOfShootingLocations() {
		return noOfShootingLocations;
	}

	public void setNoOfShootingLocations(int noOfShootingLocations) {
		this.noOfShootingLocations = noOfShootingLocations;
	}

	public double getNoOfAwards() {
		return noOfAwards;
	}

	public void setNoOfAwards(double noOfAwards) {
		this.noOfAwards = noOfAwards;
	}

	public String getVillainName() {
		return villainName;
	}

	public void setVillainName(String villainName) {
		this.villainName = villainName;
	}

	public int getAgeOfVillain() {
		return ageOfVillain;
	}

	public void setAgeOfVillain(int ageOfVillain) {
		this.ageOfVillain = ageOfVillain;
	}

	public int getNoOfActors() {
		return noOfActors;
	}

	public void setNoOfActors(int noOfActors) {
		this.noOfActors = noOfActors;
	}

	public int getNoOfActress() {
		return noOfActress;
	}

	public void setNoOfActress(int noOfActress) {
		this.noOfActress = noOfActress;
	}

	public int getNoOfVehiclesUsed() {
		return noOfVehiclesUsed;
	}

	public void setNoOfVehiclesUsed(int noOfVehiclesUsed) {
		this.noOfVehiclesUsed = noOfVehiclesUsed;
	}

	public int getNoOfShoesUsed() {
		return noOfShoesUsed;
	}

	public void setNoOfShoesUsed(int noOfShoesUsed) {
		this.noOfShoesUsed = noOfShoesUsed;
	}

	public int getNoOfBikesUsed() {
		return noOfBikesUsed;
	}

	public void setNoOfBikesUsed(int noOfBikesUsed) {
		this.noOfBikesUsed = noOfBikesUsed;
	}

	public int getNoOfCarsUsed() {
		return noOfCarsUsed;
	}

	public void setNoOfCarsUsed(int noOfCarsUsed) {
		this.noOfCarsUsed = noOfCarsUsed;
	}

	public int getNoOfDogsUsed() {
		return noOfDogsUsed;
	}

	public void setNoOfDogsUsed(int noOfDogsUsed) {
		this.noOfDogsUsed = noOfDogsUsed;
	}

	public boolean isDogsUsed() {
		return dogsUsed;
	}

	public void setDogsUsed(boolean dogsUsed) {
		this.dogsUsed = dogsUsed;
	}
	
	
	
	

}
