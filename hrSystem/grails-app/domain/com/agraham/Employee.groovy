package com.agraham

class Employee {
	
	String fullName
	Date dateOfBirth
	String residence
	Double hourlyRate
	Date dateEmployed
	String taxCode
	String contract
	int employeeID
	Shift shift
	Manager manager

	String toString(){
	
	return fullName	
	
	}

	static hasMany = [tasks:Task, teams:Team]
	static belongsTo = [Team]


    static constraints = {

	fullName blank: false, nullable: false
	dateOfBirth blank: false, nullable: false
	residence blank: false, nullable: false
	hourlyRate blank: false, nullable: false
	dateEmployed blank: false, nullable: false
	taxCode blank: false, nullable: false, unique:true
	contract blank: false, nullable: false
	employeeID blank: false, nullable: false, unique: true


	shift blank: true, nullable: true
	teams nullable: true, blank: true
	tasks nullable: true, blank: true
	


    }
}
