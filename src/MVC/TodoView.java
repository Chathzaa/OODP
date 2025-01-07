package MVC;

import java.util.List;

// TodoView.java (View)
public class TodoView {

    // Display the current list of todos
    public void printTodoList(List<String> todoItems) {
        System.out.println("Todo List:");
        for (int i = 0; i < todoItems.size(); i++) {
            System.out.println((i + 1) + ". " + todoItems.get(i));
        }
    }

    // Prompt for user input
    public String getInput() {
        // For simplicity, just return some fixed input here.
        // In a real-world application, you could take input via scanner or GUI.
        return "Sample Todo";
    }
}

