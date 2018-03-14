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
    static constraints = {

fullName blank: false, nullable: false
dateofBirth blank: false, nullable: false
residence blank: false, nullable: false
hourlyRate blank: false, nullable: false
dateEmployed blank: false, nullable: false
taxCode blank: false, nullable: false, size:6
contract blank: false, nullable: false
employeeID blank: false, nullable: false, unique: true


    }
}
