public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Lada", "Granta", 2015, "Russia", "Yellow", 1.7);
        Car car2 = new Car("Audi", "A8 50L TDI quattro", 2020, "Germany", "Black", 3.0);
        Car car3 = new Car("BMW", "Z8", 2021, "Germany", "Black", 3.0);
        Car car4 = new Car("Kia", "Sportage 4 generate", 2018, "South Korea", "Red", 2.4);
        Car car5 = new Car("Hyundai", "Avente", 2016, "South Korea", "Orange", 1.6);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);

        Car car6 = new Car("Nissan", "Almera", 0, "", "", 0);
        System.out.println(car6);



    }
}