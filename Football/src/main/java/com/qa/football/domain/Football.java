package com.qa.football.domain;

public class Football {
	
	private long id;
	private String surname;
	private String firstName;
	private int age;
	private String team;
	private Boolean rightFooted;
	
	public Football() {
		super();
	}
	//Constructor without ID
	public Football(String surname, String firstName, int age, String team, Boolean rightFooted) {
		super();
		this.surname = surname;
		this.firstName = firstName;
		this.age = age;
		this.team = team;
		this.rightFooted = rightFooted;
	}
	//Constructor with ID
	public Football(long id, String surname, String firstName, int age, String team, Boolean rightFooted) {
		super();
		this.id = id;
		this.surname = surname;
		this.firstName = firstName;
		this.age = age;
		this.team = team;
		this.rightFooted = rightFooted;
	}
	
	
	
}
