public class Trucks implements Car {
    @Override
    public void types(String type) {
        System.out.println("Types of trucks for a " + " " + type + " fan ");
        System.out.println("Ram");
        System.out.println("Ford");
        System.out.println("Jeep");
    }

    @Override
    public void engins(String engine) {
        System.out.println("List of Recommended engines:" + " " + engine);
        System.out.println("Ford Power Stroke V8;");
        System.out.println("Chevrolet Small Block V8;");
        System.out.println("Toyota 22R;");
    }
}
