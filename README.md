# business-rules-assignment


Problem Statement 2: Business Rules Engine



Author: Aniruddha Anikhindi
Version : 1.0
Date : 08/02/2022

## Design assumptions :

World is now moving to api's so decided to create API based functionality for this assignment

Sample SpringBoot application along with controller with service is plugged with Drools which is a famous business rules engine.


Why Drools:
As per the requirements, looks like its the best case for drools implementation specially with decision table features.
Drools decision table (excel based business rules) allows less maintenance & high readability with focus to non technology users as well like BA, Product Owners etc



## Development approach :
TDD first : Written all possible test cases using Restassured library assuming every requirement as api call.
Unit tests are failed & started implementing code in a TDD style.

Below are the payment types used:

1. Physical product :PHYPRD
2. Book :BOOK
3. Membership :MEMBERSHIP
4. Upgrade membership: UPG_MEMBERSHIP
5. Video: VIDEO

Along with this there is additional design parameter called -> attrName which can be used for attribute name of parent payment type 

For example:

Request for VIDEO payment type with name parameter:

{
    "paymentType":"PHYPRD",
    "attrName":"LEARNING_TO_SKI"
}



### Technologies used:
Java, Maven, SpringBoot, Drools Rule Engine, RestAssured, POSTMAN


#### Testing:

Please refer to business_rules_testing_details.pdf in this directory for test results (unit testing & POSTMAN)



#### How to run:
1. Clone this url : https://github.com/aapune/business-rules-assignment.git
2. Run maven install
3. Run SpringBootDroolsApp -> this will run application
4. Application will be up & running at this url : http://localhost:9999
5. Use POST methods on this url for any business rules : http://localhost:9999/get-output


Request example :

payment type is UPGRADE MEMBERSHIP

{
    "paymentType":"UPG_MEMBERSHIP"
}



### Changing rules:

If you want to change rules please change & review in drools decision excel sheet :  <CLONED_DIRECTORY>\src\main\resources\rules\order-rules.xlsx