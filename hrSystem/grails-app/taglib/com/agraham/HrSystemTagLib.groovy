package com.agraham

class HrSystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
    static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

	def loginToggle = {
		out << "<div style='margin: 15px 0 40px;'>"
		if (request.getSession(false) && session.user){
			out << "<span style='float:center; margin-left: 15px'>"
			out << "Welcome ${session.user}."
			out << "</span><span style='float:right;margin-right:15px'>"
			

			if (session.job == "manager"){
								
				out << "<a href='${createLink(controller:'manager', action:'logout')}'>"
				out << "Logout </a>"

				out << "<a href='${createLink(controller:'manager', action:'homepage')}'>"
				out << "home </a>"
							
				}
		
			else{
				out << "<a href='${createLink(controller:'team_leader', action:'logout')}'>"
				out << "Logout </a>"


				out << "<a href='${createLink(controller:'team_leader', action:'homepage')}'>"
				out << "Home </a></span>"				
				}

			out << "<br/>"


			


		}
		else{
			out << "<span style='float:right;margin-right:10px'>"
			out << "<a href='${createLink(controller:'manager', action:'login')}'>"
			out << "Login- Manager </a></span>"

			out << "<span style='float:right;margin-right:10px'>"
			out << "<a href='${createLink(controller:'team_leader', action:'login')}'>"
			out << "Login-Team leader </a></span>"
			}
			out << "</div><br/>"

	}
	

}
