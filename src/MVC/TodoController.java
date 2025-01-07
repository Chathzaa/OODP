package MVC;

// TodoController.java (Controller)
public class TodoController {
    private TodoModel model;
    private TodoView view;

    public TodoController(TodoModel model, TodoView view) {
        this.model = model;
        this.view = view;
    }

    // Add a todo item
    public void addTodo() {
        String item = view.getInput();
        model.addTodoItem(item);
        updateView();
    }

    // Remove a todo item by index
    public void removeTodo(int index) {
        model.removeTodoItem(index);
        updateView();
    }

    // Update the view to reflect the current state of the model
    public void updateView() {
        view.printTodoList(model.getTodoItems());
    }
}
