# Sample-User-Management
 
Use Maven commands like:

 - mvn clean install
 - mvn site
 - mvn site:stage
 
Coverage Report: mvn cobertura:cobertura
 
Start REST app:
 cd rest-app
 mvn jetty:run


Start WEB app:
 cd web-app
 mvn jetty:run
 
Try CURL requests like:

curl -v localhost:8088/users

curl -H "Content-Type: application/json" -X POST -d '{"login":"xyz","password":"xyz"}' -v localhost:8088/user

curl -X PUT -v localhost:8088/user/2/l1/p1/d1

curl -v localhost:8088/user/login/userLogin1

curl -v localhost:8088/user/1

Start Web app:
 cd web-app
 mvn jetty:run

and open link http://localhost:8080/users 