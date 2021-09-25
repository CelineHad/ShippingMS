## SHIPMENT API
### This api handles shipment requests depending on the requested shipping company

<br>

### Used Software Technologies :
1. #### MYSQL Database 
2. #### inteliJ 
3. #### Spring boot framework
<br>
<br>

### To run this code you need to follow the below steps:
1. #### Download MYSQL database and create a schema 
2. #### import the following tables to your schema

  [fedexSchema](./Schema/mydb_fedex.sql)
<br>
  [upsSchema](./Schema/mydb_ups.sql)
  
3. #### go to [application.properties](./src/main/resources/application.properties) and change the properties depending on your db information
4. #### now you can run the application .

<br>

### Design Pattern:
#### I used factory method design pattern because the shipment type won't be specified before runtime 

<br>

### Testing :
#### I used Junit5 and Mockito to test the API
