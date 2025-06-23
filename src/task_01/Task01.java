package task_01;

import java.util.Objects;

public class Task01 {
    private String taskName;
    private long taskId;

    public Task01(String taskName, long taskId) {
        this.taskName = taskName;
        this.taskId = taskId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public long getTaskId() {
        return taskId;
    }

    public void setTaskId(long taskId) {
        this.taskId = taskId;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Task01 task01)) return false;
        return taskId == task01.taskId && Objects.equals(taskName, task01.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskId);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task01{");
        sb.append("taskName='").append(taskName).append('\'');
        sb.append(", taskId=").append(taskId);
        sb.append('}');
        return sb.toString();
    }
}
