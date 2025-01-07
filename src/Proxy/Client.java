package Proxy;

// Client.java (Client)
public class Client {
    public static void main(String[] args) {
        // Create a proxy for the image
        Image image1 = new ProxyImage("image1.jpg");
        Image image2 = new ProxyImage("image2.jpg");

        // The image is not loaded until display() is called
        image1.display();
        image2.display();

        // Displaying the image again, the proxy will not need to load the image again
        image1.display();
    }
}

