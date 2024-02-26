public class RaceCar implements Car{
    public void types(String types){
        System.out.println("Types of race cars for a " +" "+ types + " fan ");
        System.out.println("Lamborghini");
        System.out.println("Jaguar");
        System.out.println("Mclaren");
    }

    @Override
    public void engins(String engine) {
        System.out.println("List of Recommended engines:" + " " + engine);
        System.out.println("FVR38DETT V6;");
        System.out.println("Chevrolet Small Block V8;");
        System.out.println("Toyota 22R;");
    }
}
