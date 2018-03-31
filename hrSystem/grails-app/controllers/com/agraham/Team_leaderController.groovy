package com.agraham

class Team_leaderController {

    	def scaffold = Team_leader

	def login(){
}

def validate(){

	def user = Team_leader.findByEmployeeEmail(params.employeeEmail)

	if(user && user.password == params.password){

		

		session.user = user
		render view:'home'
		}
	else{
		flash.message = "invalid Email or passsword "
		render view:'login'

		}


	}

def logout(){

	session.user = null

	redirect(uri:'/')

	}
	
}
