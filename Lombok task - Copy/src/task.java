public class task {
    public static void main(String[] args) {
        Car myCar = new Car("SUV", "Peugeot", 2024, 120000.0, "Red", 3);

        System.out.println("--- Initial State ---");
        System.out.println(myCar.toString());

        System.out.println("\nSelling a car...");
        myCar.sell();

        System.out.println("\n--- Current Values via Getters ---");
        System.out.println("Brand:    " + myCar.getBrand());
        System.out.println("Model:    " + myCar.getModel());
        System.out.println("Year:     " + myCar.getYear());
        System.out.println("Price:    $" + myCar.getPrice());
        System.out.println("Color:    " + myCar.getColor());
        System.out.println("Quantity: " + myCar.getQuantity());

        System.out.println("\nUpdating price and color using setters...");
        myCar.setPrice(23000.0);
        myCar.setColor("Black");

        System.out.println("\n--- State After Modification ---");
        System.out.println(myCar.toString());
    }
}
