import com.pattern.interfaceserg.Recharge;
import com.pattern.openclose.Rectangle;
import com.pattern.openclose.ShapePrinter;
import com.pattern.openclose.Square;

public class Main {
    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();
        Rectangle rectangle = new Rectangle();
        Square square = new Square();
        printer.drawShape(square);
        printer.drawShape(rectangle);
    }
}