package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("Make coffee", "Put nescafe in cup, follow with milk, sugar and hot water.");
        Task task = toDoList.tasks.get(0);
        System.out.println(task);
        Assertions.assertEquals(task.taskName, "Make coffee");
        Assertions.assertEquals(task.taskDesc, "Put nescafe in cup, follow with milk, sugar and hot water.");
        Assertions.assertEquals(task.taskStatus, "Open");


    }

    @Test
    public void testPrintList() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        String list = toDoList.printList();
        Assertions.assertEquals("Name: 1 | Description: One | Status: Open\nName: 2 | Description: Two | Status: Open\nName: 3 | Description: Three | Status: Open\n", list);
    }

    @Test
    public void testSearchTask() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        Task task = toDoList.searchTask("1");
        Task expectedTask = new Task("1","One");

        Assertions.assertEquals(expectedTask.taskName,task.taskName );
        Assertions.assertEquals(expectedTask.taskDesc,task.taskDesc );

        task = toDoList.searchTask("3");
        expectedTask = new Task("3","Three");

        Assertions.assertEquals(expectedTask.taskName,task.taskName );
        Assertions.assertEquals(expectedTask.taskDesc,task.taskDesc );

    }


    @Test
    public void testChangeTaskStatus() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        toDoList.changeTaskStatus("1", "Complete");
        Task searchTask = toDoList.searchTask("1");
        Assertions.assertEquals("Complete", searchTask.taskStatus);
    }
    @Test
    public void testFilterList(){
        TodoList toDoList = new TodoList();
        toDoList.addTask("1", "One");
        toDoList.addTask("2", "Two");
        toDoList.addTask("3", "Three");
        toDoList.changeTaskStatus("1", "Complete");
        toDoList.changeTaskStatus("3", "Complete");
        TodoList filteredList = toDoList.filterList("Complete");
        Task searchTask = filteredList.searchTask("1");
        Assertions.assertEquals("Complete", searchTask.taskStatus);
        searchTask = filteredList.searchTask("3");
        Assertions.assertEquals("Complete", searchTask.taskStatus);
        searchTask = filteredList.searchTask("2");
        Assertions.assertEquals(null, searchTask);

    }
}
