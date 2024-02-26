import java.util.Locale;

public class ConcreteCarFactory extends CarFactory {
    @Override
    public Car createCar(String CarType) {
        switch (CarType.toLowerCase()) {
            case "coupe":
                return new Coupe();
            case "formula 1":
                return new Formula1();
            default:
                throw new IllegalArgumentException("Invalid car type choice");
        }

    }
}
