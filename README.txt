
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

1. Create Portfolio Using Manual Input : It allows user to buy stocks and create new portfolio.
For this the user firstly gives basic input like user id, user name , user email and a new portfolio id and then after choosing the appropriate option the user is asked to 
manually input the stock they want to buy, the number of stocks they want to buy and the date on which they ant to buy the same and the portfolio is created in the standard path.

2. Create portfolio through File: To create a new portfolio using file.
For this the user firstly gives basic input like user id, user name , user email and a new portfolio id and then after choosing the appropriate option the user is asked to 
This features also allows user to create a portfolio but that can be done by adding data to a csv file() saved on standard path and then using the appropriate option the user is able to create a 
New portfolio.  

3. Get Composition: This option enables user to get composition of an existing portfolio until specific input date (given by the user). 
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id and then after choosing 
the appropriate option the user gives the date until which the user expects to get Composition of a portfolio 
thus displays the composition of the same portfolio on the console.

4. Portfolio Value: This option enables user to get portfolio value of an existing portfolio on a given input date(given by the user). 
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id and then after choosing 
the appropriate option the user gives the date. The portfolio value displayed on the console is the value for the stocks that were created on or before the input date and what would we be the portfolio amount
For the specific value on given input date.

5. Modify Portfolio by adding new Stocks: This option enables user to add new stocks to an existing portfolio.
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id 
and then after choosing the appropriate option the user is asked to input the Ticker Number of the Stocks you want in your portfolio (For eg: “TSLA” or “MSFT”) and just after that you must enter the number of stocks for the same ticker Number and after that you will be asked to input the date for which you want to purchase the stock. 
This process of entering the ticker Number , number of stocks and date is going to continue until you type “exit” and the ticker numbers you gave as input will be appended to the csv file of the portfolio you mentioned as input.
If you try to modify portfolio that does not exist then it will throw an error.

6. Sell Stocks: This option enables user to sell stocks from an existing portfolio.
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id 
and then after choosing the appropriate option the user is asked to input the Ticker Number of the Stocks you want to sell from your portfolio (For eg: “TSLA” or “MSFT”) and just after that you must enter the number of stocks for the same ticker Number and after that you will be asked to input the date on which you want to sell the stock. 
If the given input is valid that is the stock exist in the portfolio before that day then the stock will be sold.
We are displaying the selling of stocks in the csv file by appending the same csv file with negative number of stocks and amount.
If you try to modify portfolio that does not exist then it will throw an error.

7. Cost basis: This option enables user to get Cost Basis of an existing portfolio.
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id 
and then after choosing the appropriate option the user is asked to input the date until which you want to get the Cost basis of a portfolio.
Calculation of cost basis also includes the commission fess that is charged at every transaction. As of now we are considering the commission fees of 1$ on every transaction. 
So the cost basis returns the amount that user buying the portfolio has spent till date for purchasing the stocks as well as the commission fess they have paid on every transaction.
Please note that we are considering the commission fees(1$) for the stocks sold before or on the input date, but not considering the amount that the user received from the selling transaction.
If you try to modify portfolio that does not exist then it will throw an error.

8. Get Portfolio Performance: This option enables user to view Portfolio performance of an existing portfolio between given adept range.
For this the user firstly gives basic input like user id, user name , user email and an existing portfolio id 
and then after choosing the appropriate option the user is asked to input the 2 dates that is the date range for which you want to view the performance.
As per the given date range the program decides an appropriate interval to display the performance of portfolio.
If you try to modify portfolio that does not exist then it will throw an error.


