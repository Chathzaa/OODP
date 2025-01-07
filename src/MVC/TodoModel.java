package MVC;

import java.util.ArrayList;
import java.util.List;

// TodoModel.java (Model)
public class TodoModel {
    private List<String> todos;

    public TodoModel() {
        todos = new ArrayList<>();
    }

    // Add a todo item
    public void addTodoItem(String item) {
        todos.add(item);
    }

    // Get the list of todos
    public List<String> getTodoItems() {
        return todos;
    }

    // Remove a todo item by index
    public void removeTodoItem(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
        }
    }
}

