import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@AllArgsConstructor
@ToString
@EqualsAndHashCode(of = "brand")

public class carwithlombok {
    private String model;
    private String brand;
    private int year;
    private double price;
    private String color;
    private int quantity;
}

class cardemowithlombok {
    public static void main(String[] args) {
        carwithlombok carwithlombok1 = new carwithlombok("GLE", "Mercedes", 2020, 350_000, "white", 5);
        carwithlombok carwithlombok2 = new carwithlombok("GLC", "Mercedes", 2023, 200_000, "silver", 3);

        System.out.println(carwithlombok1);
        System.out.println(carwithlombok2);

        System.out.println(carwithlombok1.getColor());
        int year = carwithlombok1.getYear();
        carwithlombok1.setColor("black");

        System.out.println("Are these objects equal? " + carwithlombok1.equals(carwithlombok2));
        System.out.println("The HashCode of this object is: " + carwithlombok2.hashCode());
        System.out.println("The HashCode of this object is: " + carwithlombok1.hashCode());
    }
}
