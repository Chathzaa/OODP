package Abstract;

// Main.java (Client)
public class MainA {
    public static void main(String[] args) {
        // Assume we are working on Windows
        GUIFactory factory = new WindowsFactory();

        Button button = factory.createButton();
        button.render(); // Output: Rendering Windows button
        button.onClick(); // Output: Windows Button clicked

        Checkbox checkbox = factory.createCheckbox();
        checkbox.render(); // Output: Rendering Windows checkbox
        checkbox.onClick(); // Output: Windows Checkbox clicked

        // Assume we are working on Mac
        factory = new MacFactory();

        button = factory.createButton();
        button.render(); // Output: Rendering Mac button
        button.onClick(); // Output: Mac Button clicked

        checkbox = factory.createCheckbox();
        checkbox.render(); // Output: Rendering Mac checkbox
        checkbox.onClick(); // Output: Mac Checkbox clicked
    }
}

