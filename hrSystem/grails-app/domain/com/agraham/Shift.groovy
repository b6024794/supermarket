package com.agraham

class Shift {

	String timeOfDay
	String daysOfWeek
	int numberOfHours
	String startingTime
	
	static hasMany = [tasks:Task, employees:Employee, teams:Team]
	static belongsTo = [Task]

    static constraints = {
	timeOfDay blank: false, nullable: false
	daysOfWeek blank: false, nullable: false
	numberOfHours blank: false, nullable: false, max: 13
	startingTime blank: false, nullable: false
	tasks nullable: true
	employees blank: false, nullable: false
	teams blank: false, nullable: false
    }
}
