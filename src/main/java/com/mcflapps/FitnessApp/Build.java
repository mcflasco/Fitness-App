package com.mcflapps.FitnessApp;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Build {
//	private String workout;
//	private String title;
//	
	@Id // specifies your getting a primary key
	private int id;
	private int setOne;
	private int setTwo;
	private int setThree;
	private int setFour;

	public Build() {

	}

	public Build(int id, int setOne, int setTwo, int setThree) {
//		this.workout = workout;
//		this.title = title;
		this.id = id;
		this.setOne = setOne;
		this.setTwo = setTwo;
		this.setThree = setThree;

	}

	public Build(int id, int setOne, int setTwo, int setThree, int setFour) {
//		this.workout = workout;
//		this.title = title;
		this.id = id++;
		this.setOne = setOne;
		this.setTwo = setTwo;
		this.setThree = setThree;
		this.setFour = setFour;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return setOne + " Reps, " + setTwo + " Reps, " + setThree + " Reps, " + setFour + " Reps ";
	}

}
