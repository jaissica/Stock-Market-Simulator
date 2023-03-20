Our design is an implementation of MVC modelling.

In the Controller we have below implementations:

1. We have a main Interface "ControllerMain". This interface mentions the method that the classes implementing it should have. 
   We have a class "ControllerImpl" which implements the ControllerMain interface and has operation of the methods in the interface.
   It consists of goStock() method which is the main method that further delegates the operations. 
   In the main class the object of ControllerImpl is created to started the program.

2. We have another Interface "ControllerFlexible" that comes into picture when operations need to be performed on a Flexible portfolio.
   We have a concrete class "FlexiblePortfolio" that implements the Interface ControllerFlexible and performs operations on the methods related to Flexible portfolio.
   This class has a goFlexible() method that takes the input from the user and thus delegates the commands or operations as to what needs to be performed to Model for the flexible portfolio.

3. We have another Interface "ControllerNonFlexible" that comes into picture when operations need to be performed on a Non Flexible portfolio.
   We have a concrete class "NonFlexiblePortfolio" that implements the Interface ControllerNonFlexible and performs operations on the methods related to Non Flexible portfolio.
   This class has a goNonFlexible() method that takes the input from the user and thus delegates the commands or operations as to what needs to be performed to Model for the non flexible portfolio.

4. We have a class "AbstractPortfolio" class that consists of all the common methods that are being used to take input both for Flexible & Non Flexible portfolios. 
    FlexiblePortfolio class & NonFlexiblePortfolio class extend this class. 




In the View we have below implementations:

1. We have an interface View that consists of all the methods taht classes implementing it should have.
   We have a concrete class ViewImpl that implements View interface and. Consists of operations for all the methods mentioned in the View interface.

2. ViewImpl has two methods one to print the result and other one to print the error.



In the Model we have below implementations:

1. We have an interface "Portfolio" that consists of methods that are common for both Flexible and Non Flexible portfolios. 
   This interface is being implemented by two other interface that separately created for Flexible and Non Flexible portfolio.

2. We have an interface "PortfolioFlexible" that mentions all the methods implementing it should have, thus mentioning all the methods that are necessary for performing operations on Flexible Portfolio.
   This interface further extends another interface "Portfolio" thus all the classes implementing it should consist of methods both in PortfolioFlexible and Portfolio interface thus the 
   concrete class should have the methods common for both Flexible and Non Flexible Portfolio and the ones which are specific to just flexible portfolio. 

3. We have an interface "PortfolioNonFlexible" that mentions all the methods implementing it should have, thus mentioning all the methods that are necessary for performing operations on Non Flexible Portfolio.
   This interface further extends another interface "Portfolio" thus all the classes implementing it should consist of methods both in PortfolioNonFlexible and Portfolio interface thus the 
   concrete class should have the methods common for both Flexible and Non Flexible Portfolio and the ones which are specific to just non flexible portfolio. 

4. We have a abstract class "AbstractPortfolio" that implements the "Portfolio" interface and consists of all the methods common to implementation of both Flexible and Non flexible portfolio.

5. We have a class "ModelImplFlexible" which implements interface "PortfolioFlexible" and also extends the "AbstractPortfolio". This method consists of all the operations that are specific to 
   performing operations on Flexible Portfolio and their implementation is not common with the Non Flexible portfolio.

6. We have a class "ModelImpl" which implements interface "PortfolioNonFlexible" and also extends the "AbstractPortfolio". This method consists of all the operations that are specific to 
   performing operations on Non Flexible Portfolio and their implementation is not common with the Flexible portfolio.

7. We have a helper class "ApiAccessData" which helps in retrieving the data for particular Ticker Number & API.

8. We have a helper class "LoadData"  which helps in loading or appending data to the csv file to create or update.
 
 
The Stocks class is the main class from where the program is being executed.
