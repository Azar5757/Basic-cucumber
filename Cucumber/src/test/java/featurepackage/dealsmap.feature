Feature: Deal data creation

Scenario: Free CRM create a new deal scenario


Given user is already on login page
When user enters username and password
|username|password|
|azaruddinajju95@gmail.com|Az@r5757|
Then user click the login button
Then user enters deal details
|title|amount|probability|commission|
|testdeal45|2000|10|20|
|testdeal456|4000|20|30|
|testdeal789|6000|30|40|
Then close the browser