import com.builder.Phone;
import com.builder.PhoneBuilder;

public class Application {
    public static void main(String[] args) {
        //Without builder design pattern
        Phone p1 = new Phone("android", "Qualcomm", 4, 5.4, 3422);
        System.out.println(p1.toString());

        //With Builder Design pattern
        PhoneBuilder phoneBuilder = new PhoneBuilder();
        Phone p2 = phoneBuilder.setOs("iOS").setScreenSize(6).setProcessor("A16 Bionic").getPhone();
        System.out.println(p2.toString());
    }
}