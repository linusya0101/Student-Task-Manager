import java.time.LocalDate;
import java.util.ArrayList;

public class TaskList{
    private ArrayList<Task> taskList; //the <task> is from the task class 
    
    //constructor: creates an empty ArrayList and assigns it to the instance variable
    public TaskList(){
        this.taskList = new ArrayList<Task>(); 
    }

 
    public ArrayList<Task> getTaskList(){
        return taskList; 
    }

    public Task addTask(String taskName, String subject, String type, LocalDate deadline){
        Task task = new Task(taskName, subject, type, deadline); 
        taskList.add(task); 
        return task; 
    }

    public Task removeTask(String taskName) {
        if (taskName == null || taskName.trim().isEmpty()) {
            return null;
        }
        for (Task task : taskList) {
            if (task.getTaskName() != null &&
                task.getTaskName().equalsIgnoreCase(taskName.trim())) {
                taskList.remove(task);
                return task;
            }
        }
        return null;
    }  

    public Task searchTaskByName(String taskName){
        if (taskName == null || taskName.trim().isEmpty()){ //.trim() removes white spaces 
            return null; 
        }
        for (Task task : taskList){
            if (task.getTaskName() != null && task.getTaskName().toLowerCase().contains(taskName.trim().toLowerCase())){
                return task; 
            }
        }
        return null; 
    }
}
