package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TodoListTest {
    @Test
    public void testAddTask() {
        TodoList toDoList = new TodoList();
        toDoList.addTask("Make coffee", "Put nescafe in cup, follow with milk, sugar and hot water.");
        Assertions.assertEquals(toDoList.toDoList.get[0], taskName="Make coffee", taskDesc = "Put nescafe in cup, follow with milk, sugar and hot water.");

    }
}
