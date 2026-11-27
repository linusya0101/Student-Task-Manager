import java.time.LocalDate;

public class Task{
    private String taskName; 
    private String subject; 
    private String type; 
    private LocalDate deadline; 
    private boolean completed; 

    //constructor: takes parameters and assigns their values to the instance variables 
    public Task(String taskName, String subject, String type, LocalDate deadline){
        this.taskName = taskName; 
        this.subject = subject; 
        this.type = type; 
        this.deadline = deadline; 
        this.completed = false; 
    }

    //getters 
    public String getTaskName(){
        return this.taskName; 
    }

    public String getSubject(){
        return this.subject; 
    }

    public String getType(){
        return this.type; 
    }

    public LocalDate getDeadline(){
        return this.deadline; 
    }

    public boolean getCompleted(){
        return this.completed; 
    }

    //setters 
    public void setTaskName(String taskName){
        this.taskName = taskName; 
    }

    public void setType(String type){
        this.type = type; 
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public void setDeadline(LocalDate deadline){
        this.deadline = deadline; 
    }

    public void completeOrIncomplete(boolean completed){
        this.completed = completed; 
    }
}