package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
        Assertions.assertEquals("Name: 1 | Description: One | Status: Open\nName: 2 | Description: Two | Status: Open\nName: 3 | Description: Three | Status: Open\n",list );
    }
}
