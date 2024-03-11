Feature: Login feature

Scenario: Verify the login with valid username and valid password
Given User launch application
Then User Enter username 
Then User Enter password
Then User Click on Button "loginButton"
Given User is on "HomePage"
Then User Click on Button "Home"
Then User Enter into the textbox "Firstname" "Jnanesh"
Then User Enter into the textbox "Lastname" "Mahadevaswamy"
Then User click on check box ""
Then User click on radio button ""
Then User Selects value from the  drop down "" ""
Then user clicks on a link ""
Then User enters value into the textarea "" ""
Then User verify the text "incorrectcredential" "Please enter the valid username or password" 




Scenario: Verify the login with valid username and valid password
Given User launch application
Given User is on "LoginPage" 
Then User Enter into the textbox "username" "admin123@gmail.com"
Then User Enter into the textbox "password" "admin123"
Then User Click on Button "loginButton"





