public class PassangerCar implements Car {
    @Override
    public void types(String type){
         System.out.println("Types of passenger car for a" +" "+ type + " fan ");
         System.out.println("Toyota");
         System.out.println("Mercedes");
         System.out.println("Audi");
    }
    public void engins(String engine){
        System.out.println("List of Recommended engines:" + " " + engine);
        System.out.println("Toyota 3S-FE");
        System.out.println("BMW M50");
        System.out.println("MERCEDES-BENZ — OM602");
    }
}
