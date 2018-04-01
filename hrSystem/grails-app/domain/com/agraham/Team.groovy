package com.agraham

class Team {
	String teamName
	int noOfEmployees
	String descript
	String sectionName
	Team_leader team_leader
	Shift shifts

	String toString(){
	
	return teamName	
	
	}	


	static hasMany =[task:Task, employees:Employee]
	

    static constraints = {

	teamName blank: false, nullable: false
	noOfEmployees blank: false, nullable: false
	sectionName blank: false, nullable: false
	descript blank: false, nullable: false, widget:'textarea'
	employees blank: true, nullable: true
	task blank: true, nullable: true


	
    }
}
