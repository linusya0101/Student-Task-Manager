import java.util.Scanner;
import java.time.LocalDate;

public class Main{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in); 
        //creating a task list from the TaskList.java
        TaskList taskList = new TaskList(); 

        boolean running = true; 
        while (running == true){
            //Displaying the menu 
            System.out.println("===== STUDENT TASK MANAGER ====="); 
            System.out.println("1. Add a new task"); 
            System.out.println("2. View all tasks"); 
            System.out.println("3. Search for a task"); 
            System.out.println("4. Remove a task"); 
            System.out.println("5. Exit the program"); 
            System.out.println("Enter your choice: "); 

            //reading the user's choice
            String choice = scanner.nextLine();

            //actions depending on the choice
            switch(choice){
                case ("1"): 
                System.out.println("Add the name of the task: "); 
                String taskName = scanner.nextLine(); 
                System.out.println("Add the subject this task belongs to: "); 
                String taskSubject = scanner.nextLine(); 
                System.out.println("Add the type of the task (homework, project, assessement): "); 
                String taskType = scanner.nextLine(); 
                System.out.println("Enter the deadline (year-month-day): " ); 
                String dateInput = scanner.nextLine();
                LocalDate taskDeadline = LocalDate.parse(dateInput); 
                Task newTask = taskList.addTask(taskName, taskSubject, taskType, taskDeadline); 
                System.out.println("Task is added successfully!"); 
                break;

                case ("2"): 
                System.out.println("Your tasks list: "); 
                if (taskList.getTaskList().isEmpty()){
                    System.out.println("You have no tasks yet."); 
                } else {
                    for (Task task : taskList.getTaskList()){
                        System.out.println("Task name: " + task.getTaskName()); 
                        System.out.println("Subject: " + task.getSubject()); 
                        System.out.println("Type: " + task.getType()); 
                        System.out.println("Deadline: " + task.getDeadline()); 
                        System.out.println("Completed: " + task.getCompleted()); 
                        System.out.println("-------------------------");
                    }
                }
                break;

                case("3"): 
                System.out.println("Enter the task name you want to search for:");
                String searchName = scanner.nextLine();
                Task foundTask = taskList.searchTaskByName(searchName);
                if (foundTask != null) {
                    System.out.println("Task found!");
                    System.out.println("Name: " + foundTask.getTaskName());
                    System.out.println("Subject: " + foundTask.getSubject());
                    System.out.println("Type: " + foundTask.getType());
                    System.out.println("Deadline: " + foundTask.getDeadline());
                    System.out.println("Completed: " + foundTask.getCompleted());
                } else {
                    System.out.println("Task not found.");
                }
                break;

                case("4"): 
                System.out.println("Enter the name of the task you want to remove: "); 
                String removeName = scanner.nextLine(); 
                Task removedTask = taskList.removeTask(removeName); //remove task the user typed in
                if (removedTask!= null){
                    System.out.println("Task removed successfully."); 
                } else {
                    System.out.println("Task not found."); 
                }
                break;

                case("5"): 
                System.out.println("Thank you for using Student Task Manager!");
                running = false; 
                break;

                default: //in case of a wrong input
                System.out.println("Invalid choice. Enter a number from 1 - 5"); 
                break; 
            }
        }
        scanner.close(); //closing the scanner when the program ends, no more user interaction.
    }
}


