package src.PoolArea;

    public class Main {
        public static void main(String[] args) {

            pool1 rectangle = new pool1(5, 10);
            System.out.println("rectangle.width= " + rectangle.getWidth());
            System.out.println("rectangle.length= " + rectangle.getLength());
            System.out.println("rectangle.area= " + rectangle.getArea());

            pool2 cuboid = new pool2(5, 10, 5);
            System.out.println("cuboid.width= " + cuboid.getWidth());
            System.out.println("cuboid.length= " + cuboid.getLength());
            System.out.println("cuboid.area= " + cuboid.getArea());
            System.out.println("cuboid.height= " + cuboid.getHeight());
            System.out.println("cuboid.volume= " + cuboid.getVolume());

        }

    }
