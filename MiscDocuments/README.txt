
Our code offers following features for Non Flexible Portfolio:

1. Create Portfolio Using Manual Input : It allows user to buy stocks and create new portfolio.
For this the user firstly gives basic input like user id, user name , user email and a new portfolio id and then after choosing the appropriate option the user is asked to 
manually input the stock they want to buy, the number of stocks they want to buy for the same and the portfolio is created in the standard path.

2. Create portfolio through File: To create a new portfolio using file.
For this the user firstly gives basic input like user id, user name , user email and a new portfolio id and then after choosing the appropriate option the user is asked to 
This features also allows user to create a portfolio but that can be done by adding data to a csv file() saved on standard path and then using the appropriate option the user is able to create a 
New portfolio.  

3. Get Composition: This option enables user to get composition of an existing portfolio. 
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id and thus displays the composition of the same portfolio on the console.

4. Portfolio Value: This option enables user to get portfolio value of an existing portfolio on a given input date(given by the user).


Our code offers following features for Flexible Portfolio:

1. Create portfolio Options Manually or Strategy : 
¥	Create Portfolio Using Manual Input : It allows user to buy stocks and create new portfolio.For this the user firstly gives basic input like user id, user name , user email and a new portfolio id and then after choosing the appropriate option the user is asked to 
manually input the stock they want to buy, the number of stocks they want to buy and the date on which they ant to buy the same and the portfolio is created in the standard path.

¥	Add via Strategy With End date: This enables user to create portfolio with Dollar Cost Strategy. It further takes input of portfolio id, Number of stocks , start date , end date, amount to be invested and at what should be the interval. Based on Number of stocks it shows further option to input ticker number and percentage(sum should be 100). Based on input it creates a portfolio with dollar cost strategy.

¥	Add via Strategy Without End date: This enables user to create portfolio with Dollar Cost Strategy. It further takes input of portfolio id, Number of stocks , start date amount to be invested and at what should be the interval. Based on Number of stocks it shows further option to input ticker number and percentage(sum should be 100). Based on input it creates a portfolio with dollar cost strategy.

¥	Add via Strategy With End date Equal Weights: This enables user to create portfolio with Dollar Cost Strategy. It further takes input of portfolio id, Number of stocks , start date , end date, amount to be invested and at what should be the interval. Based on Number of stocks it shows further option to input ticker number. As this allows equal weights so the total amount is equally divided in the stocks given as input  on input it and creates a portfolio with dollar cost strategy.

¥	Add via Strategy Without End date Equal Weights: This enables user to create portfolio with Dollar Cost Strategy. It further takes input of portfolio id, Number of stocks , start date, amount to be invested and at what should be the interval. Based on Number of stocks it shows further option to input ticker number. As this allows equal weights so the total amount is equally divided in the stocks given as input  on input it and creates a portfolio with dollar cost strategy

¥	Create portfolio through File: To create a new portfolio using file.
For this the user firstly gives basic input like user id, user name , user email and a new portfolio id and then after choosing the appropriate option the user is asked to 
This features also allows user to create a portfolio but that can be done by adding data to a csv file() saved on standard path and then using the appropriate option the user is able to create a New portfolio.  



2. Get Composition: This option enables user to get composition of an existing portfolio until specific input date (given by the user). 
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id and then after choosing 
the appropriate option the user gives the date until which the user expects to get Composition of a portfolio 
thus displays the composition of the same portfolio on the console.

3. Portfolio Value: This option enables user to get portfolio value of an existing portfolio on a given input date(given by the user). 
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id and then after choosing 
the appropriate option the user gives the date. The portfolio value displayed on the console is the value for the stocks that were created on or before the input date and what would we be the portfolio amount
For the specific value on given input date.

4. Modify Portfolio by adding new Stocks: This option allows user to create portfolio with various options.
¥	Add stocks one by one : This option takes Portfolio id, Ticker Number, Number of Stocks and date on which the stock needs to be added to the portfolio. For this option the portfolio should exist else it throws an error.

¥	Add Stocks Using Dollar Cost Strategy with End Date: This enables user to create portfolio with Dollar Cost Strategy. It further takes input of portfolio id, Number of stocks , start date , end date, amount to be invested and at what should be the interval. Based on Number of stocks it shows further option to input ticker number and percentage(sum should be 100). Based on input it add the data to an existing portfolio.


¥	Add Stocks Using Dollar Cost Strategy without End Date: This enables user to create portfolio with Dollar Cost Strategy. It further takes input of portfolio id, Number of stocks , start date, amount to be invested and at what should be the interval. Based on Number of stocks it shows further option to input ticker number and percentage(sum should be 100). Based on input it add the data to an existing portfolio.

¥	Investment Strategy: This enables user to input portfolio id, specific amount they want to invest on how many number of stocks on which date. Then it further takes ticker number and percentage (sum should be 100) based on number of stocks and updates and existing portfolio with Investment Strategy on input date.


5. Sell Stocks: This option enables user to sell stocks from an existing portfolio.
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id and then after choosing the appropriate option the user is asked to input the Ticker Number of the Stocks you want to sell from your portfolio (For eg: ÒTSLAÓ or ÒMSFTÓ) and just after that you must enter the number of stocks for the same ticker Number and after that you will be asked to input the date on which you want to sell the stock. 
If the given input is valid that is the stock exist in the portfolio before that day then the stock will be sold.
We are displaying the selling of stocks in the csv file by appending the same csv file with negative number of stocks and amount.
If you try to modify portfolio that does not exist then it will throw an error.

6. Cost basis: This option gives user option if they want to see cost basis with or without commission fee. If the user chooses to see with commission fee the it asks user for commission fee. After this it asks user for date on which they want to see cost basis and for which portfolio and it displays the cost basis of the portfolio on eh screen for the portfolio given as input. If portfolio does not exist it shows error message. 



7. Get Portfolio Performance: This option takes the portfolio id as input and start date and end date as input. Based on input if portfolio id exists it displays the Portfolio performance graph on the screen  for given portfolio within given date range if the portfolio exists. 













