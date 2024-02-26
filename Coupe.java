public class Coupe implements Car{
    public void types(String type){
        System.out.println("Types of coupe for a " + " "+type + " fan ");
        System.out.println("BMW");
        System.out.println("Porsche");
        System.out.println("Bentley");
    }

    @Override
    public void engins(String engine) {
        System.out.println("Types of engines for coupe car" + " "+engine);
        System.out.println("Toyota Supra 2JZ-GTE.");
        System.out.println("BMW 1M N54");
        System.out.println("Dodge Viper V10.");
    }
}
