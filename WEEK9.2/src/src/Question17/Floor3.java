package src.Question17;

public class Floor3 {
    private double length;
    private double width;

    public Floor3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

    class Carpet {
        private double pricePerSquareMeter;

        public Carpet(double pricePerSquareMeter) {
            this.pricePerSquareMeter = pricePerSquareMeter;
        }

        public double getPricePerSquareMeter() {
            return pricePerSquareMeter;
        }
    }

    class Calculator {
        private Floor3 floor;
        private Carpet carpet;

        public Calculator(Floor3 floor, Carpet carpet) {
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost() {
            return floor.getArea() * carpet.getPricePerSquareMeter();
        }
    }

