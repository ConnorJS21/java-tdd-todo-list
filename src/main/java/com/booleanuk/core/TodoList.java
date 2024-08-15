package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    ArrayList<Task> tasks = new ArrayList<>();
    public void addTask(String taskName, String taskDesc){
        Task task = new Task(taskName, taskDesc);
        tasks.add(task);
    }
    public String printList(){
        String tasksString = "";
        if(!tasks.isEmpty()){
            Task task;
            for (int i = 0; i <tasks.size() ; i++) {
                task = tasks.get(i);
                tasksString = tasksString + "Name: " + task.taskName + " | ";
                tasksString = tasksString + "Description: " + task.taskDesc + " | ";
                tasksString = tasksString + "Status: " + task.taskStatus + "\n";
            }
        } else{
            tasksString = "There are currently no tasks in your to do list.";
        }
        return tasksString;
    }

    public String searchTask(String taskName){
        boolean taskFound = false;
        String returnString = "This task doesn't exist within this list.";
        Task task = null;
        for (int i = 0; i < tasks.size(); i++) {
            task = tasks.get(i);
            if(task.taskName.equals(taskName)){
                taskFound = true;
                break;
            }
        }
        if(taskFound){
            returnString = "Name: " + task.taskName + " | ";
            returnString = returnString + "Description: " + task.taskDesc + " | ";
            returnString = returnString + "Status: " + task.taskStatus;
        }
        return returnString;
    }
}
