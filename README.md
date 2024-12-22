# Stock Market Simulator

## Overview

The **Stock Market Simulator** is a Java-based application designed to provide users with a platform for simulating portfolio management. It allows users to manage both flexible and non-flexible portfolios, with functionality for buying, selling, and viewing stock data. The project is structured into several distinct components that handle various aspects, including portfolio management, stock information retrieval, and user interaction through either a command-line interface (CLI) or a graphical user interface (GUI).

## Project Structure

This project is organized into the following key directories, each containing specific components of the application:

- **model**: Includes the core logic of the application, handling portfolio management and stock data management.
- **view**: Responsible for displaying output to users, supporting both command-line and graphical user interfaces.
- **controller**: Contains classes that handle user input, manage application flow, and ensure communication between the model and view layers.
- **test**: Includes unit tests to ensure that all components of the application function correctly and reliably.

### Model

The `model` directory holds the core business logic and data management functionality:

- **AbstractPortfolio.java**: An abstract class that defines the general structure for different types of portfolios.
- **Portfolio.java, PortfolioFlexible.java, PortfolioNonFlexible.java**: Define the various portfolio types and their specific behaviors.
- **ApiAccessData.java & IApiAccessData.java**: Interfaces and implementations used for retrieving stock market data via APIs.
- **LoadData.java & ILoadData.java**: Handle loading portfolio data from different sources.
- **ModelImpl.java, ModelImplFlexible, ModelImplNonFlexible**: Provide the core implementations of the business logic for the simulation.

### View

The `view` directory is responsible for handling user interaction and displaying information to the user, whether through a command-line interface or a graphical user interface.

- **View.java & ViewImpl.java**: Interfaces and their implementations for displaying output to the user.
- **guiview**: Contains classes that implement the graphical user interface (GUI) views.

### Controller

The `controller` directory includes various classes and subdirectories to manage portfolio-related operations:

- **AbstractPortfolioController.java**: An abstract class that defines common methods for portfolio management.
- **ControllerFlexible.java**: Handles operations for flexible portfolios, including buying, selling, and viewing stocks.
- **ControllerImpl.java**: The primary controller implementation, managing operations for both flexible and non-flexible portfolios.
- **ControllerMain.java**: The main entry point for the application, coordinating the execution of all controller components.
- **ControllerNonFlexible.java**: Manages operations specific to non-flexible portfolios.
- **StockInfo.java & StockInfoImpl.java**: Interfaces and classes responsible for fetching and managing stock information.
- **FlexiblePortfolio & guicontroller**: Contains additional classes specific to managing flexible portfolios and implementing GUI-based controllers.

### Test

The `test` directory contains unit tests for various components:

- **FlexiblePortfolioTest & NonFlexiblePortfolioTest.java**: Unit tests for the flexible and non-flexible portfolio functionalities.
- **MockModel and MockView**: Mock classes for simulating interactions between the model and view components during testing.
- **MockModelTestFlexible & MockModelTestNonFlexible.java**: Tests for the mock model implementations of flexible and non-flexible portfolios.
- **MockViewTestFlexible & MockViewTestNonFlexible.java**: Tests for the mock view implementations associated with the portfolios.

### Data Files

The project uses CSV files to load and manage portfolio data. These files help users quickly start with predefined datasets or manage their portfolios over time.

- **portfolio_data_1.csv**: Contains sample portfolio data, including stock names, quantities, and transaction history.
- **portfolio_data_2.csv**: A different set of portfolio data, allowing users to load multiple portfolio scenarios.
- **portfolio_data_3.csv**: Another variant for testing or different portfolio configurations.
- **portfolio_data_4.csv**: Used for more complex portfolio management scenarios, including more stocks or different investment strategies.

These CSV files can be loaded into the simulator for users to simulate stock trading and portfolio management, or users can save their portfolio data into CSV files for future use.

## How to Run

### 1. Clone the Repository

To get started, clone the repository:

```bash
git clone https://github.com/jaissica/Stock-Market-Simulator.git
```

### 2. Compile the Java Files
Navigate to the project directory and compile the Java files:
```bash
javac -d bin controller/*.java model/*.java view/*.java
```

### 3. Run the Application
Execute `ControllerMain.java` class to start the simulation:
```bash
java ControllerMain
```
### 4. User Interaction

Follow the on-screen prompts to interact with the simulator. You can interact with the simulator using either the text-based interface or the GUI.

## Features

- **Flexible Portfolios**: Full control over portfolio management, with the ability to buy, sell, and view stocks dynamically.
- **Non-Flexible Portfolios**: A simplified approach to portfolio management, mimicking conservative investment strategies with restricted operations.
- **API Integration**: Real-time stock data retrieval via APIs, ensuring up-to-date information for simulations.
- **Data Integration**: Load and save portfolio data from CSV files, allowing users to start with predefined data sets.
- **Comprehensive Testing**: The application includes extensive unit tests to verify that core functionalities are accurate and dependable.
  
### Features for Non-Flexible Portfolios

- **Create Portfolio Using Manual Input**: Allows the user to manually enter the stock data they wish to purchase.
- **Create Portfolio Using File**: Load portfolio data from a CSV file to create a new portfolio.
- **Get Composition**: Retrieve the composition of an existing portfolio.
- **Portfolio Value**: Calculate the value of the portfolio on a given date.

### Features for Flexible Portfolios

- **Create Portfolio Using Manual Input or Strategy**: Manually create portfolios or use a Dollar-Cost Averaging strategy.
- **Add via Strategy**: Add stocks via Dollar-Cost Averaging, with options for both with and without an end date.
- **Get Composition**: Get the composition of an existing portfolio for a specific date.
- **Portfolio Value**: View the value of the portfolio on a given date.
- **Modify Portfolio by Adding New Stocks**: Add new stocks to an existing portfolio using Dollar-Cost Averaging or specific investment strategies.
- **Sell Stocks**: Sell stocks from an existing portfolio.
- **Cost Basis**: View the cost basis for a portfolio, including options to include or exclude commission fees.
- **Get Portfolio Performance**: Visualize the performance of a portfolio over a specific date range.

### Graphical User Interface (GUI)

The GUI version of the simulator provides a user-friendly way to interact with the system:

- **Controller**: Manages GUI actions and user interactions using action listeners.
- **View**: Displays the portfolio and stock data in a graphical format, including charts for portfolio performance.
- **Buttons & Text Fields**: Used for user input, allowing users to create portfolios, add stocks, and perform other operations.
- **Charts**: Bar graphs display the portfolio performance over time.

## Class Diagram
![image](https://github.com/user-attachments/assets/3fcf9b17-dba5-41a3-927b-e26b458f1e04)

