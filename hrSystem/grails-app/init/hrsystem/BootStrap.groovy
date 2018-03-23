package com.agraham

class BootStrap {

    def init = { servletContext ->

def jack = new Manager{

	fullName: 'Jack Lowbar',
	userName: 'Jlowbar',
	password: 'password123',
	employeeEmail: 'JLowbar@email.com',
	office: 'b1234',
	department: 'testing',

	
	


	}


    }.save
    def destroy = {
    }
}
