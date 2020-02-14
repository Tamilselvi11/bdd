Feature: borland registration
@register
Scenario: launch the application click on enter gmo online button
Given i launch the URL 
When i verify the title of the page
Then i click on "enter gmo online" button
Then i enter the "1004" quanity as "10"
When i verify the page title as online catalog



#Scenario: user is lands on online catalog page and enter the quanity and click place an order button
#Given i verified online catalog page
#When  i enter the "1004" quanity as "10"
#Then i clicked place an order button

#Scenario: verified the user lands on place order page
#Given i verified user clicks "Hiking boots" link image is getting displayed
#When i verified the total price 
#Then i clicked proceed with order*/

@test
Scenario: Launch the boreland URL
Given i launch the GMOURL
When i click on Enter GMO onlin button in GMO online page
Then i enter the quantity as "10" in online catalog page






