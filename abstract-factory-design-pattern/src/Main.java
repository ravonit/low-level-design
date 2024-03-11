import com.demo.factory.UIFactory.Application;
import com.demo.factory.UIFactory.MacUIFactory;
import com.demo.factory.UIFactory.WindowsUIFactory;

public class Main {
    public static void main(String[] args) {
        WindowsUIFactory windowsUIFactory = new WindowsUIFactory();
        MacUIFactory macUIFactory = new MacUIFactory();
        Application app = new Application(macUIFactory);
        app.paint();
    }
}