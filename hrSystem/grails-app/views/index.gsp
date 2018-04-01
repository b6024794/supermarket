<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
	<asset:stylesheet src="index.css" />
    <title>Welcome to Hr shop system</title>
</head>
<body>
    

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h1>HR shop system!</h1>
		

            <p>
	 		Welcome to the shop managment app, please login to access the function to 
			add and remove record about the shop
		</p>


	
	<div class="login">
		<g:loginToggle />

	
	</div>
<!--
            <div id="controllers" role="navigation">
                <h2>Available Controllers:</h2>
                <ul>
                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            </div>
-->
        </section>
    </div>

</body>
</html>
