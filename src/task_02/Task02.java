package task_02;

import java.util.Objects;

public class Task02 {
    private String taskName;
    private long taskId;

    public Task02(String taskName, long taskId) {
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
        if (!(o instanceof Task02 task02)) return false;
        return taskId == task02.taskId && Objects.equals(taskName, task02.taskName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taskName, taskId);
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Task02{");
        sb.append("taskName='").append(taskName).append('\'');
        sb.append(", taskId=").append(taskId);
        sb.append('}');
        return sb.toString();
    }
}
