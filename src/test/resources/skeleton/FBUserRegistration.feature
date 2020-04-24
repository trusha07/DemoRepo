Feature: Facebook User Registration

Scenario Outline: User Registration Form
Then User Enters firstname and lastname as "<fname>" and "<lname>"
Then user Enters Email and new password as "<emailorMob>" and "<newPWD>"
Then user selects birth day month year as "<bDay>" and "<bMon>" and "<bYear>"
Then user selects gender as "<gender>"
Then User Clicks on SignUp button
Then User is on Login Page

Examples:
| fname | lname | emailorMob | newPWD | bDay | bMon | bYear | gender |
| User1 | user1 | user1@ | user1123 | 5 | 4 | 1988 | Male|
| user2 | user2 | user2@ | user2123 | 20 | 10 | 1991 | Female|
| user3 | user3 | user3@ | user3123 | 28 | 2 | 2003 | Female|
| user4 | user4 | user4@ | user4123 | 30 | 6 | 2000 | Male|
| user5 | user5 | user5@ | user5123 | 21 | 8 | 1995 | Female|