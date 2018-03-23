package com.agraham

class Task {

	String taskName
	int numberOfPeople
	String sectionName
	String timeRequired
	String description
	String department
	Boolean taskCompleted

	static hasMany = [shifts:Shift,employees:Employee]

    static constraints = {

	taskName blank: false, nullable: false
	numberOfPeople blank: false, nullable: false
	sectionName blank: false, nullable: false
	timeRequired blank: false, nullable: false
	description blank: false, nullable: false
	taskCompleted blank: false, nullable: false
	
	shifts blank: true, nullable: true
	employees blank: true, nullable: true
    }
}
