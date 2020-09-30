Feature: Facebook App Testing

Scenario Outline: Facebook App Open

Given User can open the fblogin page
When User can enter "<username>"
Then User can enter password "<Password>"
Then User can click login button
Then click the logout link
Then click the logout button
And Close the browser

Examples:
    | username | Password |
    | 9573705757 | azar5757 |
    | 123456 | azar|