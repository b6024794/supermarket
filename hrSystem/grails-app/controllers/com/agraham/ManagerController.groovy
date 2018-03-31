package com.agraham

class ManagerController {

	def scaffold = Manager
	
	def login(){



	}

def validate(){

	def user = Manager.findByUserName(params.username)

	if(user && user.password == params.password){

		

		session.user = user
		render view:'home'
		}
	else{
		flash.message = "invalid username or passsword"
		render view:'login'

		}


	}

def logout(){

	session.user = null

	redirect(uri:'/')

	}
	
}
