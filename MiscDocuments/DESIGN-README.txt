Our design is an implementation of MVC modelling.


-- For Text user Interface 

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

5. We have created and Interface "StockInfo". This interface mentions the method that the classes implementing it should have. 
   We have a class "StockInfoImpl" which creates an Object of each Stock and is then used for further implementations. 



In the View we have below implementations:

1. We have an interface View that consists of all the methods that classes implementing it should have.
   We have a concrete class ViewImpl that implements View interface and. Consists of operations for all the methods mentioned in the View interface.

2. ViewImpl has various methods to print the result print the error.


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

7. We have a class "ApiAccessData" which implements interface "IApiAccessData". This method which helps in retrieving the data for particular Ticker Number & API.

8. 7. We have a class "LoadData" which implements interface "ILoadData". This method which helps in loading or appending data to the csv file to create or update.
 
 
The Stock class is the main class from where the program is being executed.


-- Graphical User Interface / Enhancements made in the Program

In the Controller for GUI:

We have package inside controller package named guicontroller which has Controller for GUI.

-- We have an Interface "ControllerMainGUI" which consists of all the methods that the classes implementing it should have.
   We have a concrete class "ControllerImplGUI" that implements ControllerMainGUI and ActionListener. It consists of goStock method which creates an actionMap which stores the 
   entire actions that need to be performed on each click. 

-- We have a private method initializeMap which updates the actionMap<String, Runnable> with each next step(Interface) on every click.

-- We have a method actionPerformed() which will process an action event implements ActionListener Interface, and the object created with this class is registered with a component, using the component's  addActionListener method. When the action event occurs, that object's actionPerformed method is invoked.     


In the View for GUI  :

We have package inside view package named guiview which has View for GUI.

•	Inside guiview package we have another package buttons which consists of class and Interface  which help us create Frames/panel which have only buttons in them.

1.	It has a ButtonsView Interface which mentions all the methods that classes implementing it should have. Each class implementing this interface should have 
a resetFocus method which is used to bring focus to the component and a addActionListener method which processes the ActionEvent should implement ActionListner interface.

•	Inside guiview package we have another package charts which consists of class and Interface that help us create Bar graph for Portfolio performance option.

1	“IBarChart” is an Interface which mentions all the methods that classes implementing it should have.Each class implementing this interface should have a resetFocus method which is used to bring focus to the component and a addActionListener method which processes the ActionEvent should implement ActionListner interface.
2	BarGraphImpl is a concrete class that implements IBarChart and creates a bar graph for performance portfolio.

•	Inside guiview package we have another package fileSelection which consists of class and Interface that help us show option to choose file from a path.

1.	“IFileSelection” is an interface that mentions all the methods that the classes implementing it should have. getInput method returns filePath, getFileChooser returns user selection, setHint returns success or error message if needed and a addActionListener method which processes the ActionEvent should implement ActionListner interface.

2.	fileSelect is a concrete class that implements IFileSelection and displays options from where user can choose path.

•	Inside guiview package we have another package textField which consists of class and Interface which help us create Frames/panel which have both text fields in them and need to take input from the user.

1.	It has a TextFieldView Interface which mentions all the methods that classes implementing it should have. Each class implementing this interface should have 
a resetFocus method which is used to bring focus to the component, addActionListener method which processes the ActionEvent should implement ActionListner interface, getInput method which returns ArrayList of inputs got from various Text Fields, errorMessage method which displays error success message on the panel, clearField method method which sets all the text field view to empty and hideMainButton which disables the Main button of the text field if needed.


•	Inside guiview package we have another package HelperClass which consists of class consists of various helper methods required to operate the GUI like providing Colander View to take input dates, to dispose frames and to validate the input that we get from the user.


Model for GUI:

Model for GUI is same as TUI. 

Below are the changes. 

1. Added a new method createPortfolioDollarAverageLogicWithEndDate() which is used to create portfolio with Dollar Cost Average Strategy both with and without End date. 
If user does not mention end date then also the method is capable of handing this situation.

2.Added a new method createPortfolioInvestment () which is used to allow user to invest defined amount in a portfolio for given stocks depending on their weightage which is taken from the user.












