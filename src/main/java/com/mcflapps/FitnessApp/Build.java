package com.mcflapps.FitnessApp;

public class Build {
	private String workout;
	private String title;
	private String setType;
	private int setOne;
	private int setTwo;
	private int setThree;
	private int setFour;
	

	public Build() {
		
	}
	
	public Build(String workout, String title, int setOne, int setTwo, int setThree) {
		this.workout = workout;
		this.title = title;
		this.setOne = setOne;
		this.setTwo = setTwo;
		this.setThree = setThree;
		
	}
	
	public Build(String workout, String title, int setOne, int setTwo, int setThree, int setFour) {
		this.workout = workout;
		this.title = title;
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

	public int getSetOne() {
		return setOne;
	}

	public void setSetOne(int setOne) {
		this.setOne = setOne;
	}

	public int getSetTwo() {
		return setTwo;
	}

	public void setSetTwo(int setTwo) {
		this.setTwo = setTwo;
	}

	public int getSetThree() {
		return setThree;
	}

	public void setSetThree(int setThree) {
		this.setThree = setThree;
	}

	public int getSetFour() {
		return setFour;
	}

	public void setSetFour(int setFour) {
		this.setFour = setFour;
	}
	
	public String toString() {
		return workout + ": Exercise: " + title  + ", " + setOne + " Reps, " + setTwo + " Reps, " + setThree + " Reps, " + setFour + " Reps ";
	}

}
