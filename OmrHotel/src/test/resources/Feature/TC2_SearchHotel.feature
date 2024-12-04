@searchHotelPage
Feature: Verifying Search Hotel Module

  Scenario Outline: Verify Select Hotel by Entering All Fields in Explore Hotel Module
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | Standard | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |            2 |

  Scenario Outline: Verify Select Hotel by * Fields Only in Explore Hotel Module
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>" And "<No_of_Adults>"
    Then User should Verify Success Message after Search hotels "Select Hotel"

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |

  Scenario Outline: Verify Hotel Price sorted by Low to High
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User Click The Sort To Get The Hotel From Low To High price
    Then User should Verify the Hotel Page are Sorted to Low to High

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | Standard | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |            2 |


  Scenario Outline: Verify Hotel Price sorted by High to Low
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User Click The Sort To Get The Hotel From High To Low price
    Then User should Verify the Hotel Page are Sorted to High to Low

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | Standard | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |            2 |


  Scenario Outline: Verify Hotel Price sorted by Ascending To Descending
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User Click The Sort To Get The Hotel From Ascending To Descending
    Then User should Verify the Hotel Page are Sorted to Ascending To Descending

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | Standard | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |            2 |

  Scenario Outline: Verify Hotel Price sorted by Descending To Ascending
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    When User Click The Sort To Get The Hotel From Descending To Ascending
    Then User should Verify the Hotel Page are Sorted to Descending To Ascending

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | Standard | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |            2 |

  Scenario Outline: Verify Select Hotel by entering all fields in Search Hotel Module
    Given User is on the OMR Branch Hotel Page
    When User login "<UserName>","<Password>"
    Then User should verify Success Message After Login "Welcome Ganesh"
    When User Searching The Hotel "<StateSelection>","<CitySelection>","<RoomType>","<CheckInDate>","<CheckOutDate>","<No_of_Rooms>","<No_of_Adults>" And "<No_of_childs>"
    Then User should Verify Success Message after Search hotels "Select Hotel"
    And User should verify the Hotel name ends with "<roomType>"

    Examples: 
      | UserName              | Password    | StateSelection | CitySelection | RoomType | CheckInDate | CheckOutDate | No_of_Rooms | No_of_Adults | No_of_childs |
      | ganesh24124@gmail.com | Ganesh@5798 | Andhra Pradesh | Tirupati      | Standard | 2024-08-25  | 2024-09-05   | 1-One       | 2-Two        |            2 |
