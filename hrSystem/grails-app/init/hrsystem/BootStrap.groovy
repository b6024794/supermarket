package com.agraham

class BootStrap {

    def init = { servletContext ->

//creating new shifts

def eveningShift = new Shift(

	timeOfDay: 'Evening',
	daysOfWeek: 'Monday,Wednesday,Friday',
	numberOfHours: 6,
	startingTime: '4:00PM'

	).save()

def morningShift = new Shift(

	timeOfDay: 'morning',
	daysOfWeek: 'Tuesday,Wednesday,Thursday',
	numberOfHours: 9,
	startingTime: '6:00AM'

	).save()



//creating managers

def jack = new Manager(

	fullName: 'Jack Lowbar',
	userName: 'Jlowbar',
	password: 'password123',
	employeeEmail: 'JLowbar@email.com',
	office: 'b1234',
	department: 'testing'
	).save()

def steve = new Manager(

	fullName: 'Steve Crossbar',
	userName: 'SCrossbar',
	password: 'Crossbar123',
	employeeEmail: 'SCrossbar@email.com',
	office: 'b1235',
	department: 'Shelve Stacking'
	).save()

//creating Employees

def Sara = new Employee(
	fullName: 'Sara Johnson',
	dateOfBirth: new Date ('10/10/1998'),
	residence: '10 crawford Drive',
	hourlyRate: 9.80,
	dateEmployed: new Date ('05/05/2012'),
	taxCode:'ADS3',
	contract:'Part-Time',
	employeeID: 4,
	shift: eveningShift,
	manager: steve
	
	).save()

def Keith = new Employee(
	fullName: 'Keth Castlton',
	dateOfBirth: new Date ('9/11/1998'),
	residence: '67 Hill Road',
	hourlyRate: 9.80,
	dateEmployed: new Date ('07/07/2012'),
	taxCode:'ADS4',
	contract:'Part-Time',
	employeeID: 5,	
	shift: morningShift,
	manager: steve

	).save()

def Andy = new Employee(
	fullName: 'Andrew Graham',
	dateOfBirth: new Date ('13/06/1998'),
	residence: '17 High Street',
	hourlyRate: 9.80,
	dateEmployed: new Date ('10/03/2012'),
	taxCode:'ADS5',
	contract:'Full-Time',
	employeeID: 6,	
	shift: eveningShift,
	manager: jack

	).save()





//creating tasks

def cleanShop = new Task(


	taskName:'Clean Shop',
	numberOfPeople: 4,
	sectionName: 'Cleaners',
	timeRequired:'3 hours',
	description: 'Tidy shop floor and shevles for next day',
	department: 'All',
	taskCompleted: false
).save()

def stackShelves = new Task(


	taskName:'Restock Shelves',
	numberOfPeople: 7,
	sectionName: 'All sections',
	timeRequired:'4 hours',
	description: 'Restock all low products',
	department: 'All',
	taskCompleted: false
).save()




//creating team leaders

def Leader1 = new Team_leader(

	fullName: 'Cameron Farbarn',
	department: 'Electronics',
	sectionName: 'Computers',
	officePhone: '07467884557',
	employeeEmail: 'CFarbarn@shop.com',
	employeeID: 'GGE7',
	password: 'strongpass',
	manager: steve).save()
	
def Leader2 = new Team_leader(

	fullName: 'Jessica Jones',
	department: 'Clothes',
	sectionName: 'Shoes',
	officePhone: '07555333444',
	employeeEmail: 'JJones@shop.com',
	employeeID: 'GGE8',
	password: 'strongpass123',
	manager: jack


	).save()

//creating new teams

def cleaners = new Team(

	teamName: 'Cleaners',
	noOfEmployees: 5,
	descript: 'team to clean and maintin the shops',
	sectionName: 'Any',
	team_leader: Leader1,
	shifts: morningShift


	).save()

def electronics = new Team(

	teamName: 'Electronics',
	noOfEmployees: 8,
	descript: 'Responsable for the electronics department',
	sectionName: 'Tecnology',
	team_leader: Leader2,
	shifts: eveningShift


	).save()	

//Adding detials to relationships

	//adding employee to teams
	electronics.addToEmployees(Sara)
	electronics.addToEmployees(Keith)	
	cleaners.addToEmployees(Andy)
	electronics.addToEmployees(Keith)
	
	//add tasks to teams

	cleanShop.addToTeams(electronics)
	cleanShop.addToTeams(cleaners)
	stackShelves.addToTeams(electronics)
	
	

	//adding employes to managers
	
	steve.addToEmployees(Andy)
	steve.addToEmployees(Keith)
	jack.addToEmployees(Sara)
	jack.addToEmployees(Keith)
	
	//adding team leaders to managers
	
	jack.addToTeam_leaders(Leader1)
	steve.addToTeam_leaders(Leader2)

	//adding employees to teamLeaders
	
	Leader1.addToEmployees(Andy)
	Leader1.addToEmployees(Sara)
	Leader2.addToEmployees(Keith)



	//adding tasks to employees
	
	cleanShop.addToEmployees(Andy)
	cleanShop.addToEmployees(Sara)
	stackShelves.addToEmployees(Andy)
	stackShelves.addToEmployees(Keith)

	//adding shifts to tasks
	cleanShop.addToShifts(eveningShift)
	cleanShop.addToShifts(morningShift)
	stackShelves.addToShifts(eveningShift)

    }
    def destroy = {
    }
}
