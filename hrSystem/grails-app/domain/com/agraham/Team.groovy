package com.agraham

class Team {
	String teamName
	int noOfEmployees
	String descript
	String sectionName

    static constraints = {

	teamName blank: false, nullable: false
	noOfEmployees blank: false, nullable: false
	sectionName blank: false, nullable: false


	
    }
}
