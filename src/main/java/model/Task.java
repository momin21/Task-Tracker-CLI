package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import java.time.LocalTime;

@Data
@AllArgsConstructor
public class Task
{
  private String id;
  private String description;
  private TaskStatus taskStatus;
  private LocalTime createdAt;
  private LocalTime updatedAt;

  private Task()
  {
  }

  enum TaskStatus
  {
    TODO("todo"),
    IN_PROGRESS("in-progress"),
    DONE("done");

    @Getter
    private final String status;

    TaskStatus(String status)
    {
      this.status = status;
    }
  }
}
