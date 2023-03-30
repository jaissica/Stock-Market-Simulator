package view.guiview.helperclass;

import view.guiview.buttons.ButtonsView;
import view.guiview.fileselection.IFileSelection;
import view.guiview.textfield.TextFieldView;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;

/**
 * This is the helper class to check user input, creates calendar and
 * disposes frame.
 */

public class HelperClass {

  /**
   * This method disposes the Button View Frame and creates TextFieldView Frame.
   *
   * @param first    TextFieldView,   It is TextFieldView Frame that needs to be created.
   * @param main     ButtonsView,    It is ButtonsView Frame that needs to be disposed.
   * @param listener ActionListener, It is the ActionListener for first.
   */

  public static void disposeTheSecondSetFirstView(TextFieldView first, ButtonsView main,
                                                  ActionListener listener) {
    first.addActionListener(listener);
    ((JFrame) first).setLocation(((JFrame) main).getLocation());
    ((JFrame) main).dispose();

  }

  /**
   * This method disposes the TextFieldView Frame and creates IFileSelection Frame.
   *
   * @param first    IFileSelection,   It is IFileSelection Frame that needs to be created.
   * @param main     TextFieldView,   It is TextFieldView Frame that needs to be disposed.
   * @param listener ActionListener, It is the ActionListener for first.
   */

  public static void disposeTheSecondSetFirstViewFS(IFileSelection first, TextFieldView main,
                                                    ActionListener listener) {
    first.addActionListener(listener);
    ((JFrame) first).setLocation(((JFrame) main).getLocation());
    ((JFrame) main).dispose();

  }

  /**
   * This method disposes the TextFieldView Frame and creates another TextFieldView Frame.
   *
   * @param main     TextFieldView,   It is first TextFieldView Frame that needs to be created.
   * @param second   TextFieldView,  It is main TextFieldView Frame that needs to be disposed.
   * @param listener ActionListener, It is the ActionListener for main.
   */

  public static void disposeTheFirstSetSecondTT(TextFieldView main, TextFieldView second,
                                                ActionListener listener) {
    main.addActionListener(listener);
    ((JFrame) main).setLocation(((JFrame) second).getLocation());
    ((JFrame) second).dispose();
  }

  /**
   * This method disposes the IFileSelection Frame and creates ButtonsView Frame.
   *
   * @param first    ButtonsView,  It is ButtonsView Frame that needs to be created.
   * @param main     IFileSelection,    It is IFileSelection Frame that needs to be disposed.
   * @param listener ActionListener, It is the ActionListener for first.
   */

  public static void disposeTheFirstSetSecondViewFS(ButtonsView first, IFileSelection main,
                                                    ActionListener listener) {
    first.addActionListener(listener);
    ((JFrame) first).setLocation(((JFrame) main).getLocation());
    ((JFrame) main).dispose();

  }

  /**
   * This method disposes the TextFieldView Frame and creates ButtonsView Frame.
   *
   * @param main     ButtonsView,    It is ButtonsView Frame that needs to be created.
   * @param second   TextFieldView,  It is TextFieldView Frame that needs to be disposed.
   * @param listener ActionListener, It is the ActionListener for main.
   */


  public static void disposeTheSecondGetFirstBT(ButtonsView main, TextFieldView second,
                                                ActionListener listener) {
    main.addActionListener(listener);
    ((JFrame) main).setLocation(((JFrame) second).getLocation());
    ((JFrame) second).dispose();
  }

  /**
   * This method disposes the ButtonsView Frame and creates another ButtonsView Frame.
   *
   * @param first    ButtonsView,    It is first ButtonsView Frame that needs to be created.
   * @param main     ButtonsView,    It is main ButtonsView Frame that needs to be disposed.
   * @param listener ActionListener, It is the ActionListener for first.
   */

  public static void disposeTheSecondSetFirstViewBB(ButtonsView first, ButtonsView main,
                                                    ActionListener listener) {
    first.addActionListener(listener);
    ((JFrame) first).setLocation(((JFrame) main).getLocation());
    ((JFrame) main).dispose();
  }


  /**
   * This method disposes the TextFieldView Frame and creates another TextFieldView Frame.
   *
   * @param first    TextFieldView,   It is first TextFieldView Frame that needs to be created.
   * @param main     TextFieldView,  It is main TextFieldView Frame that needs to be disposed.
   * @param listener ActionListener, It is the ActionListener for first.
   */

  public static void disposeTheSecondSetFirstViewTT(TextFieldView first, TextFieldView main,
                                                    ActionListener listener) {
    first.addActionListener(listener);
    ((JFrame) first).setLocation(((JFrame) main).getLocation());
    ((JFrame) main).dispose();
  }


  /**
   * This method validates user inputs.
   *
   * @param t TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkUserInputs(TextFieldView t) {

    String userId = t.getInput().get(0);
    String userName = t.getInput().get(1);
    String userEmail = t.getInput().get(2);
    if (userId.length() == 0) {
      t.errorMessage("Please enter User Id");
      return false;
    }

    if (userName.length() == 0) {
      t.errorMessage("Enter User Name");
      return false;
    }

    if (userEmail.length() == 0) {
      t.errorMessage("Enter User Email");
      return false;
    }

    return true;
  }


  /**
   * This method validates portfolio id and ticker number data entered by the user.
   *
   * @param s TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkStockShareDate(TextFieldView s) {
    String portfolioId = s.getInput().get(0);
    String tickerNumber = s.getInput().get(1);
    String numStocks = s.getInput().get(2);
    String inputDate = s.getInput().get(3);

    if (s.getInput().get(2).length() == 0 || !s.getInput().get(2).matches("[1-9][\\d]*")) {
      s.errorMessage("invalid number of stocks");
      return false;
    }

    if (s.getInput().get(0).length() == 0 || !s.getInput().get(0).matches("[1-9][\\d]*")) {
      s.errorMessage("invalid portfolio id. It should be int");
      return false;
    }

    if (portfolioId.length() == 0) {
      s.errorMessage("Portfolio id cannot be empty");
      return false;
    }

    if (numStocks.length() == 0) {
      s.errorMessage("Number of stocks cannot be empty");
      return false;
    }

    if (tickerNumber.length() == 0) {
      s.errorMessage("Ticker Number cannot be empty");
      return false;
    }

    if (inputDate.length() == 0) {
      s.errorMessage("Date cannot be empty");
      return false;
    }

    if (Integer.valueOf(s.getInput().get(2)) <= 0) {
      s.errorMessage("Number of stocks cannot be less than or equal to 0");
      return false;
    }

    return true;
  }

  /**
   * This method validates portfolio id and date entered by the user.
   *
   * @param s TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkGetCompositionInput(TextFieldView s) {
    String portfolioId = s.getInput().get(0);
    String date = s.getInput().get(1);

    if (portfolioId.length() == 0) {
      s.errorMessage("Portfolio id cannot be empty");
      return false;
    }

    if (date.length() == 0) {
      s.errorMessage("Date cannot be empty");
      return false;
    }

    return true;
  }

  /**
   * This method validates portfolio id , date , commission fee data entered by the user.
   *
   * @param s TextFieldView , takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkCommissionFee(TextFieldView s) {

    String portfolioId = s.getInput().get(0);
    String date = s.getInput().get(1);
    String commFee = s.getInput().get(2);
    // int commFee = Integer.valueOf();

    if (portfolioId.length() == 0) {
      s.errorMessage("Portfolio id cannot be empty");
      return false;
    }

    if (date.length() == 0) {
      s.errorMessage("Date cannot be empty");
      return false;
    }

    if (date.length() == 0) {
      s.errorMessage("Date cannot be empty");
      return false;
    }

    if (commFee.length() == 0) {
      s.errorMessage("Commission fee cannot be empty");
      return false;
    }

    if (Double.valueOf(s.getInput().get(2)) < 0) {
      s.errorMessage("Commission fee cannot be negative");
      return false;
    }


    return true;
  }

  /**
   * This method validates portfolio id , date data entered by the user.
   *
   * @param s TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkCommissionFeeWo(TextFieldView s) {

    String portfolioId = s.getInput().get(0);
    String date = s.getInput().get(1);


    if (portfolioId.length() == 0) {
      s.errorMessage("Portfolio id cannot be empty");
      return false;
    }

    if (date.length() == 0) {
      s.errorMessage("Date cannot be empty");
      return false;
    }

    if (s.getInput().get(0).length() == 0 || !s.getInput().get(0).matches("[1-9][\\d]*")) {
      s.errorMessage("invalid Portfolio Id");
      return false;
    }

    return true;
  }

  /**
   * This method validates portfolio id , ticker Number,
   * dates, amount and interval data entered by the user.
   *
   * @param s TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkDCAPanData(TextFieldView s) {

    String portfolioId = s.getInput().get(0);
    String numStocks = s.getInput().get(5);
    String amount = s.getInput().get(1);
    String interval = s.getInput().get(2);
    String startDate = s.getInput().get(3);
    String endDate = s.getInput().get(4);

    if (portfolioId.length() == 0) {
      s.errorMessage("Portfolio id cannot be empty");
      return false;
    }

    if (numStocks.length() == 0) {
      s.errorMessage("Number of Stocks cannot be empty");
      return false;
    }

    if (amount.length() == 0) {
      s.errorMessage("Amount cannot be empty");
      return false;
    }

    if (interval.length() == 0) {
      s.errorMessage("Interval cannot be empty");
      return false;
    }

    if (startDate.length() == 0) {
      s.errorMessage("Start date cannot be empty");
      return false;
    }

    if (endDate.length() == 0) {
      s.errorMessage("End date cannot be empty");
      return false;
    }


    if (s.getInput().get(1).length() == 0 || !s.getInput().get(1).matches("[1-9][\\d]*")) {
      s.errorMessage("invalid Amount entered");
      return false;
    }

    if (s.getInput().get(2).length() == 0 || !s.getInput().get(2).matches("[1-9][\\d]*")) {
      s.errorMessage("invalid interval entered");
      return false;
    }

    if (s.getInput().get(5).length() == 0 || !s.getInput().get(5).matches("[1-9][\\d]*")) {
      s.errorMessage("Invalid Number of Stocks entered");
      return false;
    }

    if (Double.valueOf(s.getInput().get(1)) <= 0.00) {
      s.errorMessage("Amount cannot be zero or negative");
      return false;
    }

    if (Integer.valueOf(s.getInput().get(2)) <= 0.00) {
      s.errorMessage("Interval cannot be zero or negative");
      return false;
    }

    if (Integer.valueOf(s.getInput().get(5)) <= 0.00) {
      s.errorMessage("Number of stocks cannot be zero or negative");
      return false;
    }

    return true;
  }

  /**
   * This method validates portfolio id
   * date, amount and interval data entered by the user.
   *
   * @param s TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkDCAPanDataWO(TextFieldView s) {

    String portfolioId = s.getInput().get(0);
    String amount = s.getInput().get(1);
    String startDate = s.getInput().get(2);
    String numStocks = s.getInput().get(3);

    if (portfolioId.length() == 0) {
      s.errorMessage("Portfolio id cannot be empty");
      return false;
    }

    if (numStocks.length() == 0) {
      s.errorMessage("Number of Stocks cannot be empty");
      return false;
    }

    if (amount.length() == 0) {
      s.errorMessage("Amount cannot be empty");
      return false;
    }

    if (startDate.length() == 0) {
      s.errorMessage("Start date cannot be empty");
      return false;
    }

    if (s.getInput().get(1).length() < 0.00) {
      s.errorMessage("Negative Amount entered");
      return false;
    }

    if (s.getInput().get(0).length() == 0 || !s.getInput().get(0).matches("[1-9][\\d]*")) {
      s.errorMessage("Invalid portfolio Id entered");
      return false;
    }

    if (s.getInput().get(3).length() == 0 || !s.getInput().get(3).matches("[1-9][\\d]*")) {
      s.errorMessage("Invalid Number of Stocks entered");
      return false;
    }


    if (Integer.valueOf(s.getInput().get(3)) <= 0.00) {
      s.errorMessage("Number of stocks cannot be zero or negative");
      return false;
    }

    return true;
  }

  /**
   * This method validates  ticker Number,
   * percentages data entered by the user.
   *
   * @param s TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkTickerPercentDCA(TextFieldView s) {
    ArrayList<String> allInfo = s.getInput();
    Double sum = 0.00;

    for (int i = 0; i < allInfo.size() - 1; i = i + 2) {

      if (allInfo.get(i).length() == 0) {
        s.errorMessage("Ticker Number cannot be empty");
        return false;
      }
      //   System.out.println(allInfo.get(i + 1));
      if (allInfo.get(i + 1).length() == 0) {
        s.errorMessage("Percentage cannot be empty");
        return false;
      }
      sum += Double.valueOf(s.getInput().get(i + 1));
    }

    if (Double.compare(sum, 100.00) != 0) {
      s.errorMessage("Sum of percentages is less than or greater than 100");
      return false;
    }

    return true;

  }

  /**
   * This method validates  ticker Number s data entered by the user.
   *
   * @param s TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */

  public static boolean checkTickerPercentDCAEw(TextFieldView s) {
    ArrayList<String> allInfo = s.getInput();


    for (int i = 0; i < allInfo.size(); i = i + 1) {

      if (allInfo.get(i).length() == 0) {
        s.errorMessage("Ticker Number cannot be empty");
        return false;
      }
    }


    return true;

  }

  /**
   * This method validates portfolio id data entered by the user.
   *
   * @param s TextFieldView,  takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */
  public static boolean checkPortfolioId(TextFieldView s) {
    String portfolioId = s.getInput().get(0);

    if (portfolioId.length() == 0) {
      s.errorMessage("Portfolio id cannot be empty");
      return false;
    }

    if (s.getInput().get(0).length() == 0 || !s.getInput().get(0).matches("[1-9][\\d]*")) {
      s.errorMessage("Invalid portfolio Id entered");
      return false;
    }

    return true;
  }


  /**
   * This method creates calendar to get dates from user.
   *
   * @param year  JComboBox,  helps in creating years option of calendar.
   * @param month JComboBox,  helps in creating month option of calendar.
   * @param day   JComboBox,  helps in creating day option of calendar.
   */

  public static void setDay(JComboBox year, JComboBox month, JComboBox day) {
    String numStringOfMonth = month.getSelectedItem().toString();
    int numOfMonth = Integer.parseInt(numStringOfMonth);
    DefaultComboBoxModel model = (DefaultComboBoxModel) day.getModel();
    if (numOfMonth == 1 || numOfMonth == 3 || numOfMonth == 5 || numOfMonth == 7 || numOfMonth == 8
        || numOfMonth == 10 || numOfMonth == 12) {
      String[] days = {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13",
          "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
          "28", "29", "30", "31"};
      model.removeAllElements();
      for (int i = 0; i < 31; i++) {
        model.addElement(days[i]);
      }
    } else if (numOfMonth == 2) {
      String numStringOfYear = year.getSelectedItem().toString();
      int numOfYear = Integer.parseInt(numStringOfYear);
      if ((numOfYear % 100 == 0 && numOfYear % 400 == 0) || (numOfYear % 100 != 0 && numOfYear
          % 4 == 0)) {
        String[] days1 = {"01", "02", "03", "04", "05", "06", "07", "08",
            "09", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
            "24", "25", "26", "27",
            "28", "29"};
        model.removeAllElements();
        for (int i = 0; i < 29; i++) {
          model.addElement(days1[i]);
        }
      } else {
        String[] days2 = {"01", "02", "03", "04", "05", "06", "07", "08",
            "09", "10", "11", "12",
            "13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
            "23", "24", "25", "26", "27",
            "28"};
        model.removeAllElements();
        for (int i = 0; i < 28; i++) {
          model.addElement(days2[i]);
        }
      }
    } else {
      String[] days3 = {"01", "02", "03", "04", "05", "06", "07", "08",
          "09", "10", "11", "12", "13",
          "14", "15", "16", "17", "18", "19", "20", "21", "22", "23",
          "24", "25", "26", "27",
          "28", "29", "30"};
      model.removeAllElements();
      for (int i = 0; i < 30; i++) {
        model.addElement(days3[i]);
      }
    }
  }


  /**
   * This method creates String of days in calendar to get dates from user.
   *
   * @return String[] of days.
   */

  public static String[] getDefaultDay() {
    String[] days = {"01", "02", "03", "04", "05", "06", "07", "08",
        "09", "10", "11", "12", "13",
        "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27",
        "28", "29", "30", "31"};
    return days;
  }


  /**
   * This method validates portfolio id and dates data entered by the user.
   *
   * @param s TextFieldView, takes object of the TextField View.
   * @return returns true if all the inputs are accurate else false.
   */
  public static boolean checkPortPerformance(TextFieldView s) {
    String portfolioId = s.getInput().get(0);
    String startDate = s.getInput().get(1);
    String endDate = s.getInput().get(2);

    if (portfolioId.length() == 0) {
      s.errorMessage("Portfolio id cannot be empty");
      return false;
    }

    if (startDate.length() == 0) {
      s.errorMessage("Start date cannot be empty");
      return false;
    }

    if (endDate.length() == 0) {
      s.errorMessage("End date cannot be empty");
      return false;
    }


    if (s.getInput().get(0).length() == 0 || !s.getInput().get(0).matches("[1-9][\\d]*")) {
      s.errorMessage("invalid Portfolio Id entered. It should be number");
      return false;
    }

    return true;
  }


}