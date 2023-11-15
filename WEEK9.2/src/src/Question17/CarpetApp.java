package src.Question17;

public class CarpetApp {
    public static void main(String[] args) {
        // Example usage
        Floor3 roomFloor = new Floor3(12, 10);
        Carpet roomCarpet = new Carpet(8);

        Calculator calculator = new Calculator(roomFloor, roomCarpet);
        double totalCost = calculator.getTotalCost();

        System.out.println("The total cost to cover the floor with a carpet is: $" + totalCost);
    }
}
