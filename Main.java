import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a vehicle type:");
        System.out.println("1. Passenger Car");
        System.out.println("2. Truck");
        System.out.println("3. Racecar");
        System.out.println("4.Formula 1");
        System.out.println("5.Coupe");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                Car passengerCar = new PassangerCar();
                processCar(passengerCar,scanner);
                break;
            case 2:
                Car truck = new Trucks();
                processCar(truck,scanner);
                break;
            case 3:
                Car racecar = new RaceCar();
                processCar(racecar,scanner);
                break;
            case 4:
                System.out.println("Choose another car type");
                System.out.println("1.Formula 1");
                System.out.println("2.Coupe car");
                int anotherCarChoice=scanner.nextInt();
                if(anotherCarChoice==1){
                    CarFactory sp= new ConcreteCarFactory();
                    Car Formula1=sp.createCar("Formula 1");
                    processCar(Formula1,scanner);
                }
                else if(anotherCarChoice==2){
                    CarFactory sp=new ConcreteCarFactory();
                    Car Coupe=sp.createCar("Coupe");
                    processCar(Coupe,scanner);
                }
                else{
                    System.out.println("Invalid choice,please try again");
                }
                break;
            case 5:
                System.out.println("Exiting...");
                return;
            default:
                System.out.println("Invalid choice!");
        }


    }
    private static void processCar(Car car,Scanner scanner){
        System.out.println("Enter your favourite car type");
        String userType = scanner.nextLine();
        car.types(userType);
        System.out.println("Do you need list of recommended engines");
        String answer=scanner.nextLine();
        if (answer.equalsIgnoreCase("yes")){
        car.engins(answer);
        }
        else{
            System.out.println("Thank you for using our services ");
        }
    }
}