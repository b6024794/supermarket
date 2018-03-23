package com.agraham

class Team_leader {

	String fullName
	String department
	String sectionName
	String officePhone
	String employeeEmail
	String employeeID
	String password
	Manager manager
	Team team
	
	static hasMany = [employees:Employee]


    static constraints = {

	fullName blank: false, nullable: false
	department blank: false, nullable: false
	sectionName blank: false, nullable: false
	officePhone blank: false, nullable: false
	employeeEmail blank: false, nullable: false
	employeeID blank: false, nullable: false
	password blank: false, nullable: false

	team  blank: true, nullable: true
	employees blank: true, nullable: true
    }
}
