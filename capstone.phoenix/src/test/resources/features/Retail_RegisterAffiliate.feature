@RegisterAsAffiliate    #change email everytime
Feature: Test Environment Retail Page

 Background: 
Given User is on Retail website 
And User click  on MyAccount
    
@RegisterAsAffiliate
Scenario: Register as an Affiliate user with Cheque Payment Method
 And user click on register button
 And user fill registeration form with information below
      | firstname | lastname | email                     | telephone | password | confirmPassword |
      | Ayesha    | Fatima   | ayeshafatima123456789012@gmail.com | 123456    | ayesha   | ayesha          |
 And user click on agree to terms checkbox
 And user click on continue button
 And User click on ‘Register for an Affiliate Account’ link
 And User fill affiliate form with below information
      | company      | website              | taxID      | paymentMethod | 
      | AyeshaFatima | www.ayeshafatima.com | Tax1234567 | Ayesha        |
 And User check on About us check box
 And User click on Continue button Register Affiliate
 Then User should see a success message register as affiliate
