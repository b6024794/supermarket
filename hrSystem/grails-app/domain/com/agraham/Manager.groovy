package com.agraham

class Manager {
	
	String fullName
	String userName
	String password
	String employeeEmail
	String office
	String department

	String toString(){
	
	return fullName
	
	}

	static hasMany = [employees:Employee, team_leaders:Team_leader]

    static constraints = {
	
	fullName blank: false, nullable: false
	userName blank: false, nullable: false
	password blank: false, nullable: false
	employeeEmail blank: false, nullable: false
	office blank: false, nullable: false
	department blank: false, nullable: false
	employees blank: true, nullable: true
	team_leaders blank: true, nullable: true

    }
}
