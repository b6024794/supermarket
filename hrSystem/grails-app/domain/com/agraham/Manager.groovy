package com.agraham

class Manager {
	
	String fullName
	String userName
	String password
	String employeeEmail
	String office
	String department
	Team_leader team_leader

	static hasMany = [employees:Employee, team_leaders:Team_leader]

    static constraints = {
	
	fullName blank: false, nullable: false
	userName blank: false, nullable: false
	password blank: false, nullable: false
	employeeEmail blank: false, nullable: false
	office blank: false, nullable: false
	department blank: false, nullable: false
	employees blank: false, nullable: false
	team_leaders blank: false, nullable: false

    }
}
