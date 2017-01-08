# SpringRestExample
A sample SpringMVC Rest Application which uses Jackson for Object to JSON conversion.

Instructions:
1. Build the app using maven : mvn clean install
2. Deploy the jar file generated to Tomcat -> webapps directory.

Routes:

Note : use SpringRestExample-0.0.1-SNAPSHOT if manually deployed to Tomcat. If deployed inside Eclipse, then use SpringRestExample instead.

GET:
http://localhost:8080/SpringRestExample-0.0.1-SNAPSHOT/application/user/yourfirstname
Headers:
sname : yoursecondname
address : youraddress

POST:
http://localhost:9090/SpringRestExample-0.0.1-SNAPSHOT/application/postuser
Content:
{
  "fname": "yourfirstname",
  "sname": "yoursecondname",
  "address": "youraddress"
}
Headers:
Content-type : application/json

