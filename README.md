# SER322-Project
ASU SER322 Group Project. Banking system using mySQL 

Instructions:

1) Add SER322-Project to eclipse or other IDE.

2) Add resource packager to class path. right click on SER322-Project > Run As > Run Configurations > ClassPath > SER322-Project > advance(right) > add Folders > lib > src > resources.

3) Add dependencies to class path.
	RightClick on project > BuildPath > Configure build path > libraries > add Jars > lib > mysql-connector-java-8.0.11.jar
	
4) Run main method found in Start.


Updates-

1) Server is hosted on Gear Host so no need to have a local server 
running. 

2) Queries may be slow depending on web connection and due to Gear host having a
slow bandwidth. 


Known Bugs- 

1) Date fields sometimes do not retrieve right dates.
2) Adding new Accounts does not work as well as all other additions.
3) Can only search for one field at a time. Inserting values into 
	multiple fields will take the last input and run a query on that. 



