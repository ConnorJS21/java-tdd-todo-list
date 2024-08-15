package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    ArrayList<Task> tasks = new ArrayList<>();
    public void addTask(String taskName, String taskDesc){
        Task task = new Task(taskName, taskDesc);
        tasks.add(task);
    }
}
