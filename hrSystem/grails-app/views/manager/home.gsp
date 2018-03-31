<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
	<asset:stylesheet src="home.css" />
    <title>Manager Hompage</title>
</head>
<body>
	<div id ="content" role="main">
		<div class="row">
		
			<div class="first">
				<h3> Manager homapage</h3>
				<p></p>
				<button type="button" class="btn btn-success">
					<g:link controller="employee" action="create"> Add employee</g:link>
				</button>

				<button type="button" class="btn btn-success">
					<g:link controller="Team_leader" action="create"> Add Team Leader</g:link>
				</button>

				<button type="button" class="btn btn-success">
					<g:link controller="team" action="create"> Add Team</g:link>
				</button>
	
				<button type="button" class="btn btn-success">
					<g:link controller="shift" action="create"> Add Shift</g:link>
				</button>
			</div>


		</div>
	</div>
</body
</html>
