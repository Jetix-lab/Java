#Feature: verify the change Booking Module
#
  #Scenario Outline: Modify the created Order Id Check-in Date
    #Given User is on the OMR Branch Hotel Page
    #When User login "<UserName>","<Password>"
    #Then User should verify Success Message After Login "Welcome Ganesh"
    #When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    #Then User should Verify Success Message after Search hotels "Select Hotel"
    #When User save the first hotel name, hotel price
    #And User select the first hotel name
    #And User accepts the hotel booking alert
    #Then User should verify after select hotel the success message "Book Hotel"
    #When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    #And User add the GST Details "<gstNo>","<gstName>" and "<gstAddress>"
    #And User add the special request "<specialRequest>"
    #And User enter payment details, proceed with card type "<cardType>"
      #| Select card | CardNo           | CardName | Month | Year | CVV |
      #| Visa        | 5555555555552223 | Hari     | March | 2024 | 123 |
    #Then User should verify selected hotel name, booking success message contains "Booking is Confirmed" and save booking number
    #And User should verify after booking same selected hotel is booked or not
    #When User Navigate to My booking Page
    #And User search the order Id
    #Then User should verify the same order Id is present
    #And User should verify same Booked hotel name present
    #And User Should Verify same Booked Hotel Price is present
    #When User Edit the check-in Date "<modifydate>"
    #Then User should verify after the modifying the check-in date success Message is "Booking updated successfully"
#
    #Examples: 
      #| UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs | salutation | firstName | lastName   | mobileNo   | email                 | gstNo      | gstName                | gstAddress   | specialRequest      | cardType   | modifydate |
      #| ganesh24124@gmail.com | Ganesh@5798 | Tamil Nadu     | Chennai       | Standard | 2024-09-14  | 2024-09-24   | 1-One       | 4-Four       |            2 | Mr.        | Ganesh    | Venkatesan | 7010725798 | ganesh24124@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Need late check-out | Debit Card | 2024-10-27 |
#
  #Scenario Outline: Modify the First Order Id Check-in Date
    #Given User is on the OMR branch Hotel Page
    #When User login "<UserName>","<Password>"
    #Then User should verify Success Message After Login "Welcome Ganesh"
    #When User Navigate to My booking Page
    #And User Edit the first order Id check-in date
    #When User Edit the check-in Date "<modifydate>"
    #Then User should verify after the modifying the check-in date success Message is "Booking updated successfully"
#
    #Examples: 
      #| UserName              | Password    | modifydate |
      #| ganesh24124@gmail.com | Ganesh@5798 | 2024-10-27 |
#
  #Scenario Outline: Modify the Existing Order Id Check-in Date
    #Given User is on the OMR branch Hotel Page
    #When User login "<UserName>","<Password>"
    #Then User should verify Success Message After Login "Welcome Ganesh"
    #When User Navigate to My booking Page
    #And User Search for the Existing orderId
    #When User Edit the check-in Date "<modifydate>"
    #Then User should verify after the modifying the check-in date success Message is "Booking updated successfully"
#
    #Examples: 
      #| UserName              | Password    | modifydate |
      #| ganesh24124@gmail.com | Ganesh@5798 | 2024-10-27 |
