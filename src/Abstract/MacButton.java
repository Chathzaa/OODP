package Abstract;

// MacButton.java (Concrete Product)
public class MacButton implements Button {
    @Override
    public void render() {
        System.out.println("Rendering Mac button");
    }

    @Override
    public void onClick() {
        System.out.println("Mac Button clicked");
    }
}

