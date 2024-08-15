package com.booleanuk.core;

import java.util.ArrayList;

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

    public Task searchTask(String taskName){
        Task task = null;
        for(int i = 0; i < tasks.size(); i++) {
            if(tasks.get(i).taskName.equals(taskName)){
                task = tasks.get(i);
                break;
            }
        }
        if(task == null) {
            System.out.println("This task doesn't exist within this list.");
        }
            return task;
    }

    public void changeTaskStatus(String taskName, String newStatus){
        Task task = this.searchTask(taskName);
        task.taskStatus = newStatus;
    }

    public ArrayList<Task>  filterList(String criteriaStatus, ArrayList<Task> tasks){
        ArrayList<Task> filteredTasks = new ArrayList<>();;
        Task task = null;
        for (int i = 0; i < tasks.size(); i++) {
            task = tasks.get(i);
            if(task.taskStatus.equals(criteriaStatus)){
                filteredTasks.add(task);
            }
        }
        System.out.println(filteredTasks);
        return filteredTasks;
    }
}
