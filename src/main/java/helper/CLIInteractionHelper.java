package helper;

import model.TaskAction;

import java.util.Scanner;

public class CLIInteractionHelper
{
  private static String userInput = "";
  private static final Scanner sc = new Scanner(System.in);

  public static void captureUserInputFromCli()
  {
    userInput = sc.nextLine();
  }

  public static boolean isProgramEnded()
  {
    return userInput.equals("");
  }

  public static TaskAction getLastAction()
  {

  }
}
