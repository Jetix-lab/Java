Feature: Verify Book Hotel Module

  Scenario Outline: Book Hotel including GST - Card (Debit card - VISA) - special request
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User accepts the hotel booking alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add the GST Details "<gstNo>","<gstName>" and "<gstAddress>"
    And User add the special request "<specialRequest>"
    And User enter payment details, proceed with card type "<cardType>"
      | Select card | CardNo           | CardName | Month | Year | CVV |
      | Visa        | 5555555555552223 | kavi     | March | 2024 | 123 |
    Then User should verify selected hotel name, booking success message contains "Booking is Confirmed" and save booking number
    And User should verify after booking same selected hotel is booked or not

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs | salutation | firstName | lastName   | mobileNo   | email                 | gstNo      | gstName                | gstAddress   | specialRequest      | cardType   |
      | ganesh24124@gmail.com | Ganesh@5798 | Tamil Nadu     | Chennai       | Standard | 2024-09-14  | 2024-09-24   | 1-One       | 4-Four       |            2 | Mr.        | Ganesh    | Venkatesan | 7010725798 | ganesh24124@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Need late check-out | Debit Card |

  Scenario Outline: Book hotel including GST - Card (credit card - VISA) - With special request
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User accepts the hotel booking alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add the GST Details "<gstNo>","<gstName>" and "<gstAddress>"
    And User add the special request "<specialRequest>"
    And User enter payment details, proceed with card type "<cardType>"
      | Select card | CardNo           | CardName | Month | Year | CVV |
      | Visa        | 5555555555552222 | kalai    | March | 2024 | 123 |
    Then User should verify selected hotel name, booking success message contains "Booking is Confirmed" and save booking number
    And User should verify after booking same selected hotel is booked or not

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs | salutation | firstName | lastName   | mobileNo   | email                 | gstNo      | gstName                | gstAddress   | specialRequest      | cardType   |
      | ganesh24124@gmail.com | Ganesh@5798 | Tamil Nadu     | Chennai       | Standard | 2024-09-14  | 2024-09-24   | 1-One       | 4-Four       |            2 | Mr.        | Ganesh    | Venkatesan | 7010725798 | ganesh24124@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Need late check-out | Debit Card |

  Scenario Outline: Book hotel including GST - Card (debit card - VISA) - Without special request
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User accepts the hotel booking alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add the GST Details "<gstNo>","<gstName>" and "<gstAddress>"
    And User enter payment details, proceed with card type "<cardType>"
      | Select card | CardNo           | CardName | Month | Year | CVV |
      | Visa        | 5555555555552223 | ram      | March | 2024 | 123 |
    Then User should verify selected hotel name, booking success message contains "Booking is Confirmed" and save booking number
    And User should verify after booking same selected hotel is booked or not

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs | salutation | firstName | lastName   | mobileNo   | email                 | gstNo      | gstName                | gstAddress   | cardType   |
      | ganesh24124@gmail.com | Ganesh@5798 | Tamil Nadu     | Chennai       | Standard | 2024-09-14  | 2024-09-24   | 1-One       | 4-Four       |            2 | Mr.        | Ganesh    | Venkatesan | 7010725798 | ganesh24124@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Debit Card |

  Scenario Outline: Book hotel including GST - Card (credit card - VISA) - Without special request
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User accepts the hotel booking alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add the GST Details "<gstNo>","<gstName>" and "<gstAddress>"
    And User enter payment details, proceed with card type "<cardType>"
      | Select card | CardNo           | CardName | Month | Year | CVV |
      | Visa        | 5555555555552222 | magesh   | March | 2024 | 123 |
    Then User should verify selected hotel name, booking success message contains "Booking is Confirmed" and save booking number
    And User should verify after booking same selected hotel is booked or not

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs | salutation | firstName | lastName   | mobileNo   | email                 | gstNo      | gstName                | gstAddress   | cardType   |
      | ganesh24124@gmail.com | Ganesh@5798 | Tamil Nadu     | Chennai       | Standard | 2024-09-14  | 2024-09-24   | 1-One       | 4-Four       |            2 | Mr.        | Ganesh    | Venkatesan | 7010725798 | ganesh24124@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Debit Card |

  Scenario Outline: Book hotel without GST - Card (debit card - VISA) - With special request
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User accepts the hotel booking alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add the special request "<specialRequest>"
    And User enter payment details, proceed with card type "<cardType>"
      | Select card | CardNo           | CardName | Month | Year | CVV |
      | Visa        | 5555555555552223 | muthu    | March | 2024 | 123 |
    Then User should verify selected hotel name, booking success message contains "Booking is Confirmed" and save booking number
    And User should verify after booking same selected hotel is booked or not

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs | salutation | firstName | lastName   | mobileNo   | email                 | specialRequest      | cardType   |
      | ganesh24124@gmail.com | Ganesh@5798 | Tamil Nadu     | Chennai       | Standard | 2024-09-14  | 2024-09-24   | 1-One       | 4-Four       |            2 | Mr.        | Ganesh    | Venkatesan | 7010725798 | ganesh24124@gmail.com | Need late check-out | Debit Card |

  Scenario Outline: Book hotel without GST - Card (credit card - VISA) - without request
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User accepts the hotel booking alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User enter payment details, proceed with card type "<cardType>"
      | Select card | CardNo           | CardName | Month | Year | CVV |
      | Visa        | 5555555555552222 | nani     | March | 2024 | 123 |
    Then User should verify selected hotel name, booking success message contains "Booking is Confirmed" and save booking number
    And User should verify after booking same selected hotel is booked or not

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs | salutation | firstName | lastName   | mobileNo   | email                 | cardType   |
      | ganesh24124@gmail.com | Ganesh@5798 | Tamil Nadu     | Chennai       | Standard | 2024-09-14  | 2024-09-24   | 1-One       | 4-Four       |            2 | Mr.        | Ganesh    | Venkatesan | 7010725798 | ganesh24124@gmail.com | Debit Card |

  Scenario Outline: Without entering any field book hotel and verify error message
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User accepts the hotel booking alert
    Then User should verify after select hotel the success message "Book Hotel"
    When User add the guest details "<salutation>","<firstName>","<lastName>","<mobileNo>" and "<email>"
    And User add the GST Details "<gstNo>","<gstName>" and "<gstAddress>"
    And User add the special request "<specialRequest>"
    Then User should verify error messages "Please select your card type", "Please select your card", "Please provide your card number", "Please provide name on your card", "Please provide your Card Expiry Date" and "Please provide your Card's security code"

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs | salutation | firstName | lastName   | mobileNo   | email                 | gstNo      | gstName                | gstAddress   | specialRequest      |
      | ganesh24124@gmail.com | Ganesh@5798 | Tamil Nadu     | Chennai       | Standard | 2024-09-14  | 2024-09-24   | 1-One       | 4-Four       |            2 | Mr.        | Ganesh    | Venkatesan | 7010725798 | ganesh24124@gmail.com | 9043592058 | Greens Tech OMR Branch | Thoraipakkam | Need late check-out |
