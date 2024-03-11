import com.factory.OS;
import com.factory.OSFactory;
import com.factory.Windows;
//Factory Design Pattern
public class Main {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OS obj = osFactory.getObjectInstance("ada");
        obj.getSpecFeature();
    }
}