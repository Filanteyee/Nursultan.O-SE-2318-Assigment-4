public class Formula1 implements Car{

    public void types(String type){
        System.out.println("Types of formula 1" + " "+type + " fan ");
        System.out.println("Ferrari");
        System.out.println("Aston Martin");
        System.out.println("Haas");
    }

    @Override
    public void engins(String engine) {
        System.out.println("Types of engines for formula 1" + " "+engine);
        System.out.println("V6 1.6l. turbo");
        System.out.println("V8");
        System.out.println("V10");
    }
}
