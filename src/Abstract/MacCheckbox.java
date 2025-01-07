package Abstract;

// MacCheckbox.java (Concrete Product)
public class MacCheckbox implements Checkbox {
    @Override
    public void render() {
        System.out.println("Rendering Mac checkbox");
    }

    @Override
    public void onClick() {
        System.out.println("Mac Checkbox clicked");
    }
}
