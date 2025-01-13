package model;

import lombok.Data;

import java.util.Arrays;

@Data
public class TaskAction
{
  private String id;
  private Action action;

  public TaskAction(String id, String action)
  {
    this.id = id;
    this.action = getAction(action);
  }

  private Action getAction(String taskAction)
  {
    return Arrays.stream(Action.values()).filter(val -> val.action.equals(taskAction)).findFirst().orElse(Action.ERROR);
  }


  enum Action
  {
    ADD("add"),
    UPDATE("update"),
    DELETE("delete"),
    LIST("list"),
    MARK_IN_DONE("mark-in-done"),
    MARK_IN_PROGRESS("mark-in-progress"),
    ERROR("error");

    private final String action;
    Action(String action)
    {
      this.action = action;
    }
  }
}
