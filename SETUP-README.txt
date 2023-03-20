Please run the JAR file as it is in the res folder.
Steps to run the Stocks Code:1. The first input that the program expects from you is to enter user id which could be any integer value. Please note this program is built for a single user as of now and there is no restriction on user id so you can repeat is as well.2. The second input that the program expects from you is to enter user name which could be any String value. Please note this program is built for a single user as of now and there is no restriction on user name so you can repeat is as well.3. The third input that the program expects from you is to enter user email which could be any String value. Please note this program is built for a single user as of now and there is no restriction on user email so you can repeat is as well.4. The fourth input that is expected is the portfolio id from the user. The portfolio Id plays an integral role for running the code. * If you want to create a new portfolio (for both flexible & non flexible portfolio) (either manually or by using csv file) the portfolio id should be not in use before. 
If the input portfolio id already exists it would not let you upload and throw message “Please enter valid portfolio id, as currently added portfolio id already exists”.

For Non-Flexible Portfolio* To get composition of the portfolio or to get value of portfolio id on a specific date you have to enter the portfolio id which already exists, 
only then the program will be able to read the csv file else if the portfolio id does not exists it show a message that “Portfolio does not exist”

For Flexible Portfolio* To get composition of the portfolio or to get value of portfolio id on a specific date or purchase more stocks in existing portfolio or sell from a portfolio or 
Getting cost basis or to get portfolio performance you have to enter the portfolio id which already exists, 
only then the program will be able to read the csv file else if the portfolio id does not exists it show a message that “Portfolio does not exist”

5. The fifth input is to choose what kind of Portfolio you want to choose. 
    The option 1 stands for Flexible portfolio.
    The option 2 stands for Non Flexible Portfolio





Next Steps are based on the Portfolio you choose:

 ---------------- Flexible Portfolio Steps---------


6. The next input is the option input which provides you list of operation you can perform in the Stocks program:There are 8 options to choose from and are mentioned below:

* If you choose option 1: When asked for options and you provide 1 you will be manually asked to input the Ticker Number of the Stocks you want in your portfolio (For eg: “TSLA” or “MSFT”) and just after that you must enter the number of stocks for the same ticker Number, you want and after that you will be asked to input the date for which you want to purchase the stock.
This process of entering the ticker Number , number of stocks and date is going to continue until you type “exit” and thus creating a portfolio csv file for the same on specific path provided all information given is correct. After the portfolio is created you can find the created portfolio on standard path(same path as .JAR file).* If you choose option 2: When asked for options and you provide 2, then it would automatically pick the ticker Numbers , number of Stocks and date for that Ticker Number from specific file saved on specific path and create a portfolio csv file for the same on specific path provided all information given is correct.File will be save in standard path(same path as .JAR file). Below is the name of the file being used to upload the data through a file: portfolio_table_to_be_loaded.csv(Please don’t change file name & file path).After the portfolio is created you can find the created portfolio on standard path(same path as .JAR file).File format of portfolio_table_to_be_loaded.csv for reference.Ticker Number	Date	Number of Stocks
GOOG	       11/1/22	            13
AMZN	       11/7/22	            20
MSFT	       11/8/22	            12
NFLX	       10/17/22	            15* If you choose option 3: When asked for options and you provide 3, it will ask for the date.
You will be able to review the composition of specific portfolio until the date you gave as input and the same composition of the portfolio will be displayed on the console.* If you choose option 4: When asked for options and you provide 4, it will ask for date input in particular format and return the stock value of your portfolio only for the stocks loaded until that day and 
Value of the portfolio on the mentioned date will be displayed.
Our special feature is that only on a holiday the program will show message that the day is holiday other than that case the code is capable of handling other dates.

* If you choose option 5: When asked for options and you provide 5, it refers to add modify portfolio by adding new stocks to the existing portfolio.
After this you will be manually asked to input the Ticker Number of the Stocks you want in your portfolio (For eg: “TSLA” or “MSFT”) and just after that you must enter the number of stocks for the same ticker Number and after that you will be asked to input the date for which you want to purchase the stock. 
This process of entering the ticker Number , number of stocks and date is going to continue until you type “exit” and the ticker numbers you gave as input will be appended to the csv file of the portfolio you mentioned as input.
If you try to modify portfolio that does not exist then it will throw an error.


* If you choose option 6: When asked for options and you provide 6, it refers to selling stocks from an existing portfolio.
After this you will be manually asked to input the Ticker Number of the Stocks you want to sell from portfolio (For eg: “TSLA” or “MSFT”) and just after that you must enter the number of stocks for the same ticker Number and after that you will be asked to input the date for which you want to sell the stock.
If the given input is valid that is the stock exist in the portfolio before that day then the stock will be sold.
We are displaying the selling of stocks in the csv file by appending the same csv file with negative number of stocks and amount.
If you try to modify portfolio that does not exist then it will throw an error.

* If you choose option 7: When asked for options and you provide 7, it refers to getting the cost basis of an existing portfolio.
By choosing option 7 you will be asked to input date and thus this option displays the cost basis of an existing portfolio until that particular date.
Calculation of cost basis also includes the commission fess that is charged at every transaction. As of now we are considering the commission fees of 1$ on every transaction. 
So the cost basis returns the amount that user buying the portfolio has spent till date for purchasing the stocks as well as the commission fess they have paid on every transaction.
Please note that we are considering the commission fees(1$) for the stocks sold before or on the input date, but not considering the amount that the user received from the selling transaction.
If you try to modify portfolio that does not exist then it will throw an error.

* If you choose option 8: When asked for options and you provide 8, it refers to getting the portfolio performance for an existing portfolio. 
By choosing option 8 you will be asked the range of dates for which you want to see the performance of portfolio. Please note that the end date should not be greater than today's date 
And also start date would be less than end date and there should be at least gap of 5 working days between them.
As per the given date range the program decides an appropriate interval to display the performance of portfolio.
If you try to modify portfolio that does not exist then it will throw an error.


Below is the example for execution of all above mentioned features:

Welcome!
Please enter your user id
10
Please enter your user name
ABC
Please enter your user email id
test@gmail.com
Please enter the portfolio Id
801
Please choose the type of stock
1. For Flexible
2. For non Flexible
1
Please select from below options
1: To Add a new Portfolio manually
2: To Add a new Portfolio using a file
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Press zero to exit
1
Please enter the ticker number for your stock
Please enter exit if you want to end
NFLX
Enter Number of Stocks
10
Please enter date in exact same format YYYY-MM-DD
2022-11-11
Please enter the ticker number for your stock
Please enter exit if you want to end
MSFT
Enter Number of Stocks
20
Please enter date in exact same format YYYY-MM-DD
2022-10-28
Please enter the ticker number for your stock
Please enter exit if you want to end
TSLA
Enter Number of Stocks
40
Please enter date in exact same format YYYY-MM-DD
2022-09-28
Please enter the ticker number for your stock
Please enter exit if you want to end
GOOG
Enter Number of Stocks
20
Please enter date in exact same format YYYY-MM-DD
2022-11-01
Please enter the ticker number for your stock
Please enter exit if you want to end
AMZN
Enter Number of Stocks
100
Please enter date in exact same format YYYY-MM-DD
2022-10-25
Please enter the ticker number for your stock
Please enter exit if you want to end
exit
Portfolio created successfully
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
7
Please enter date in exact same format YYYY-MM-DD
2022-10-28
$28292.8
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
5
Please enter the ticker number for your stock
Please enter exit if you want to end
NFLX
Enter Number of Stocks
20
Please enter date in exact same format YYYY-MM-DD
2022-11-11
Please enter the ticker number for your stock
Please enter exit if you want to end
MSFT
Enter Number of Stocks
10
Please enter date in exact same format YYYY-MM-DD
2022-10-28
Please enter the ticker number for your stock
Please enter exit if you want to end
GOOG
Enter Number of Stocks
50
Please enter date in exact same format YYYY-MM-DD
2022-10-15
Please enter the ticker number for your stock
Please enter exit if you want to end
exit
Portfolio updated successfully
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
7
Please enter date in exact same format YYYY-MM-DD
2022-10-25
$28434.4
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
7
Please enter date in exact same format YYYY-MM-DD
2022-10-30
$35512.5
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
3
Please enter date in exact same format YYYY-MM-DD
2022-11-01
UId UName UEId PortId Date Ticker NumStocks
10 ABC test@gmail.com 801 2022-10-28 MSFT 20 
10 ABC test@gmail.com 801 2022-09-28 TSLA 40 
10 ABC test@gmail.com 801 2022-11-01 GOOG 20 
10 ABC test@gmail.com 801 2022-10-25 AMZN 100 
10 ABC test@gmail.com 801 2022-10-28 MSFT 10 
10 ABC test@gmail.com 801 2022-10-14 GOOG 50 

Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
4
Please enter date in exact same format YYYY-MM-DD
2022-11-01
$31971.899999999998
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
6
Please enter the Ticker Number you want to sell
NFLX
Please enter the number of stocks you want to sell
10
Please enter date in exact same format YYYY-MM-DD
2022-11-14
Portfolio sold successfully updated
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
7
Please enter date in exact same format YYYY-MM-DD
2022-11-05
$37323.5
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
8
Please enter date in exact same format YYYY-MM-DD
2022-10-15
Please enter date in exact same format YYYY-MM-DD
2022-11-15

Performance of portfolio 801 from 2022-10-15 to 2022-11-15

2022-10-14 : 
2022-10-17 : *
2022-10-19 : *
2022-10-21 : 
2022-10-24 : 
2022-10-26 : *****************
2022-10-28 : **************************
2022-10-31 : *************************
2022-11-02 : *************************
2022-11-04 : ************************
2022-11-07 : ************************
2022-11-09 : **********************
2022-11-11 : ***************************************
2022-11-14 : ***************************************
Relative Scale: base = $13060
Relative Scale: * = $694

Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
5: Purchase a stock in existing portfolio
6: Sell a stock in existing portfolio
7: Determine cost basis
8: Portfolio Performance
Please enter zero to exit
0
Program closed


After this portfolio is created successfully and can be found on standard path(same as .JAR File) with naming convention: portfolio_data_801.csv (portfolio_data_Portfolio_id.csv)


-----------------Non Flexible Portfolio Steps------------6. The next input is the option input which provides you list of operation you can perform in the Stocks program:There are 4 options to choose from and are mentioned below:* If you choose option 1: When asked for options and you provide 1 you will be manually asked to input the Ticker Number of the Stocks you want in your portfolio (For eg: “TSLA” or “MSFT”) and just after that you must enter the number of stocks for the same ticker Number, you want. This process of entering the ticker Number & number of stocks is going to continue until you type “exit” and create a portfolio csv file for the same on specific path provided all information given is correct. After the portfolio is created you can find the created portfolio on standard path(same path as .JAR file).* If you choose option 2: When asked for options and you provide 2, then it would automatically pick the ticker Numbers and number of Stocks for that Ticker Number from specific file saved on specific path and create a portfolio csv file for the same on specific path provided all information given is correct.                                   File will be save in standard path(same path as .JAR file).                                Below is the name of the file: portfolio_table_to_be_loaded.csv                               (Please don’t change file name & file path).After the portfolio is created you can find the created portfolio on standard path(same path as .JAR file).File format of portfolio_table_to_be_loaded.csv for reference.Ticker Number	Date	Number of Stocks
GOOG	       11/1/22	            13
AMZN	       11/7/22	            20
MSFT	       11/8/22	            12
NFLX	       10/17/22	            15* If you choose option 3: When asked for options and you provide 3, it will return on the console the composition of a specific portfolio which you have given as input.* If you choose option 4: When asked for options and you provide 4, it will ask for date input in particular format and return the stock value on that particular date for a particular portfolio you mentioned on the console. Please note if a given date is weekend or for that particular date API data is not updated yet then it would consider the last working day and show the values for that day. 
Our special feature is that only on a holiday the program will show message that the day is holiday other than that case the code is capable of handling other dates.Example to create 3 different stocks portfolio by giving input manually, after that getting the composition of the same portfolio & then getting the portfolio value for the same stock on 2022-11-11.Assuming Portfolio Id 901 does not existWelcome!
Please enter your user id
10
Please enter your user name
ABC
Please enter your user email id
test@gmail.com
Please enter the portfolio Id
901
Please choose the type of stock
1. For Flexible
2. For non Flexible
2
Please select from below options
1: To Add a new Portfolio manually
2: To Add a new Portfolio using a file
3: To get Composition of Portfolio
4: Portfolio value on certain date
Press zero to exit
1
Please enter the ticker number for your stock
Please enter exit if you want to end
NFLX
Enter Number of Stocks
10
Please enter the ticker number for your stock
Please enter exit if you want to end
TSLA
Enter Number of Stocks
20
Please enter the ticker number for your stock
Please enter exit if you want to end
MSFT
Enter Number of Stocks
50
Please enter the ticker number for your stock
Please enter exit if you want to end
exit
Portfolio created successfully
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
Press zero to exit
3
UId UName UEId PortId Date Ticker NumStocks
10 ABC test@gmail.com 901 2022-11-15 NFLX 10 
10 ABC test@gmail.com 901 2022-11-15 TSLA 20 
10 ABC test@gmail.com 901 2022-11-15 MSFT 50 

Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
Press zero to exit
4
Please enter date in exact same format YYYY-MM-DD
2022-11-11
$19176.2
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
Press zero to exit
0
Program closed



After this portfolio is created successfully and can be found on standard path(same as .JAR File) with naming convention: portfolio_data_901.csv (portfolio_data_Portfolio_id.csv)Example to create 3 different stocks portfolio by giving input through a file saved on standard path(same as .JAR File), after that getting the 
composition of the same portfolio & then getting the portfolio value for the same stock on 2022-10-28.:Name of the file: “portfolio_data_to_be_loaded.csv”Assuming Portfolio Id 902 does not existWelcome!
Please enter your user id
10
Please enter your user name
ABC
Please enter your user email id
test@gmail.com
Please enter the portfolio Id
902
Please choose the type of stock
1. For Flexible
2. For non Flexible
2
Please select from below options
1: To Add a new Portfolio manually
2: To Add a new Portfolio using a file
3: To get Composition of Portfolio
4: Portfolio value on certain date
Press zero to exit
2
Portfolio added
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
Press zero to exit
3
UId UName UEId PortId Date Ticker NumStocks
10 ABC test@gmail.com 902 2022-11-01 GOOG 13 
10 ABC test@gmail.com 902 2022-11-07 AMZN 20 
10 ABC test@gmail.com 902 2022-11-08 MSFT 12 
10 ABC test@gmail.com 902 2022-10-17 NFLX 15 

Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
Press zero to exit
4
Please enter date in exact same format YYYY-MM-DD
2022-10-28
$10589.98
Please select from below options
3: To get Composition of Portfolio
4: Portfolio value on certain date
Press zero to exit
0
Program closedAfter this portfolio is created successfully and can be found on standard path(same as .JAR File) with naming convention: portfolio_data_902.csv (portfolio_data_Portfolio_id.csv)Restrictions: The only restriction is to use active stocks for which data is updated on the website on daily basis unlike YHOO(Yahoo) whose data can be accessed on the website but is not updated and is not current stock. In such situations the code will give different result than expected other than this you can use any active Ticker Number of the stock. -- For testing 

1. For test testControllerAddDataByManualFileInvalidTicker() in Class NonFlexiblePortfolioTest, please change the Ticker Number to invalid Ticker number like "ZZZZZ" so that the Invalid ticker error passes.2. For test in Class FlexiblePortfolioTest, please change the Ticker Number to invalid Ticker number like "ZZZZZ" so that the Invalid ticker error passes.