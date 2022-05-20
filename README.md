# ATMs Services
1. Java spring-boot microservice using gradle exposing one GET method
   URL: http://localhost:8080/atm/api/atm-details/
   Method: GET
   Body:{
   "url":"https://api.lloydsbank.com/open-banking/v2.2/atms",
   "identification":"LFDCEC11"
   }
2. Logging: SLF4J
3. OpenAPI Swagger URL:
   http://localhost:8080/atm/v3/api-docs
   http://localhost:8080/atm/swagger-ui/index.html
4. Actuator Endpoint:
   http://localhost:8080/atm/actuator
5. jar file: it can be used to run as a docker image
   Name: atm-services-0.0.1-SNAPSHOT.jar
   Location: atm-services/build/libs/atm-services-0.0.1-SNAPSHOT.jar