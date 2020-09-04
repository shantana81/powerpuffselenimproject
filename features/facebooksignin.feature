 Feature: User want to sign in to the Facebook

 Scenario Outline: Positve sign in  with valid email address and password

 Given user navigates Facebook homepage
 When When user enter "<E-Mail Address>" and "<password>"
 And user click on log in button
 Then user successfully login to the system
 
 Examples:
 
 |E-Mail Address      |password |
 |itsmeshitu@yahoo.com|Ayat2011!|
 

