package com.agraham

class Shift {

	String timeOfDay
	String daysOfWeek
	int numberOfHours
	String startingTime


    static constraints = {
	timeOfDay blank: false, nullable: false
	daysOfWeek blank: false, nullable: false
	numberOfHours blank: false, nullable: false, max: 13
	startingTime blank: false, nullable: false
    }
}
