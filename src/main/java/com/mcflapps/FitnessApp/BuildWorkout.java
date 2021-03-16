package com.mcflapps.FitnessApp;

public class BuildWorkout{

	private String workout;
	private String title;
	private String setType;
	private String setOne;
	private String setTwo;
	private String setThree;
	private String setFour;
	

	public BuildWorkout() {
		
	}
	public BuildWorkout(String workout, String title, String setType, String setOne, String setTwo) {
		this.workout = workout;
		this.title = title;
		this.setType = setType;
		this.setOne = setOne;
		this.setTwo = setTwo;
		
	}
	
	public BuildWorkout(String workout, String title, String setType, String setOne, String setTwo, String setThree) {
		this.workout = workout;
		this.title = title;
		this.setType = setType;
		this.setOne = setOne;
		this.setTwo = setTwo;
		this.setThree = setThree;
		
	}
	
	public BuildWorkout(String workout, String title, String setType, String setOne, String setTwo, String setThree, String setFour) {
		this.workout = workout;
		this.title = title;
		this.setType = setType;
		this.setOne = setOne;
		this.setTwo = setTwo;
		this.setThree = setThree;
		this.setFour = setFour;
		
	}
	
	

	public String getWorkout() {
		return workout;
	}

	public void setWorkout(String workout) {
		this.workout = workout;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getSetType() {
		return setType;
	}

	public void setSetType(String setType) {
		this.setType = setType;
	}

	public String getSetOne() {
		return setOne;
	}

	public void setSetOne(String setOne) {
		this.setOne = setOne;
	}

	public String getSetTwo() {
		return setTwo;
	}

	public void setSetTwo(String setTwo) {
		this.setTwo = setTwo;
	}

	public String getSetThree() {
		return setThree;
	}

	public void setSetThree(String setThree) {
		this.setThree = setThree;
	}

	public String getSetFour() {
		return setFour;
	}

	public void setSetFour(String setFour) {
		this.setFour = setFour;
	}
	
	public String toString() {
		return workout + ": Exercise: " + title  + " Set Type: " + setType + ", " + setOne + ", " +  setTwo + ", " + setThree + ", " + setFour + " ";
	}
}
