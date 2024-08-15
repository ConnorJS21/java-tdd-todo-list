| Class    | Method                                      | Scenario | Output                                                                                 |
|----------|---------------------------------------------|----------|----------------------------------------------------------------------------------------|
| ToDoList | addTask(String taskName, String taskDesc )  |          |                                                                                        |
| ToDoList | printList()                                 |          | List shown in console                                                                  |
| Task     | changeStatus(String task)                   |          |                                                                                        |
| ToDoList | filterCriteria(String criteriaStatus)       |          | List shown, filtered by criteria                                                       |
| ToDoList | searchTask(String task)                     |          | Task returned or not found message                                                     |
| ToDoList | deleteTask(String task)                     |          | List shown without deleted task                                                        |
| ToDoList | orderAlphabet(String ascDescOrDefault)      |          | List shown ordered by criteria or message returned giving the three options of sorting |
|          |                                             |          |                                                                                        |




| Class    | Variable          |
|----------|-------------------|
| ToDoList | List<Task>tasks;  |
| Task     | String taskName   |
| Task     | String taskDesc   |
| Task     | String taskStatus |
| Task     | String taskId     |
