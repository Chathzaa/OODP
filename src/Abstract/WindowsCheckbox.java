package Abstract;

// WindowsCheckbox.java (Concrete Product)
public class WindowsCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Windows checkbox");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Checkbox clicked");
    }
}

