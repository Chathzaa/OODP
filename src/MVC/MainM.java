package MVC;

// Main.java (Client)
public class MainM {
    public static void main(String[] args) {
        // Create the model and view objects
        TodoModel model = new TodoModel();
        TodoView view = new TodoView();

        // Create the controller
        TodoController controller = new TodoController(model, view);

        // Simulate some user actions
        controller.addTodo();  // Add a new todo item
        controller.addTodo();  // Add another todo item
        controller.removeTodo(0);  // Remove the first todo item

        // Final view output
        System.out.println("\nFinal Todo List:");
        controller.updateView();
    }
}

