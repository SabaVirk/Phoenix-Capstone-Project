@RetailPage
Feature: Test Environment Retail Page #for this feature you have to have an existing account

Background:
Given User is on Retail website 
And User click  on MyAccount
When  User click on Login 
And User enter username and password 
|username|password|
|ayeshafatima1@gmail.com|admin|
And User click on Login button
Then User should be logged in to MyAccount dashboard


@EditAffiliateInfo
Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
When User click on ‘Edit your affiliate informationlink 
And user click on Bank Transfer radio button
And User fill Bank information with below information
|bankName|abaNumber|swiftCode|accountName|accountNumber|
|ABC Bank|222222|333333|AyeshaFatima|44-555-666|
And User click on Continue button Edit Affiliate
Then User should see a success message edit affiliate information

@EditAccountInfo
Scenario: Edit your account Information 
When User click on ‘Edit your account information’ link 
And User modify below information 
|firstname|lastName|email|telephone|
|Ayesha1|Fatima1|ayeshafatima1@gmail.com|123456789|
And User click on continue button Edit Account
Then User should see a message for account 'Success: Your account has been successfully updated.'