Feature: Verify Select Hotel Module
@sanity
  Scenario Outline: Select hotel and verify navigate to book hotel upon accepting the alert
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User accepts the hotel booking alert
    Then User should verify after select hotel the success message "Book Hotel"

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | Standard | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |            2 |
@sanity
  Scenario Outline: Select hotel and verify navigating in the same page upon dismiss the alert
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User save the first hotel name, hotel price
    And User select the first hotel name
    And User dismiss the hotel booking alert
    Then User should verify after select hotel the success message "Select Hotel"

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | Standard | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |            2 |
