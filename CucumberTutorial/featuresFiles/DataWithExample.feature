Feature: Login in login Page with Example
Scenario Outline: webPage login Eample KeyWord
Given lanch HRm login Page
Then enter the Credentials "<username>" and "<password>"
And click on login Button

Examples:
|username |password|
|Admin    |admin123|
|Admin		|admin12 |

