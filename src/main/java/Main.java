import helper.CLIInteractionHelper;
import helper.TasksProcessor;
import model.Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main
{
  public static void main(String[] args)
  {
    List<Task> tasks = new ArrayList<>();
    do
    {
      CLIInteractionHelper.captureUserInputFromCli();
      TasksProcessor.process(CLIInteractionHelper.getLastAction(), tasks);

    } while (!CLIInteractionHelper.isProgramEnded());
  }
}
