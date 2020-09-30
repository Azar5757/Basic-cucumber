Feature: Facebook App Testing1

Scenario Outline: Facebook App Open

Given User can open the fblogin page1
When User can enter "<username>"
Then User can enter password "<Password>"
Then User can click login button1
Then click the logout link1
Then click the logout button1
And Close the browser1

Examples:
    | username | Password |
    | 9573705757 | azar5757 |
    | 123456 | azar|