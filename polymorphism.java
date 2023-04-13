public class polymorphism {
  
    public static void main(String[] args) {
        Product p = new Product(); // Task 2
        int result1 = p.product(2, 3); // Task 3
        int result2 = p.product(2, 3, 4); // Task 4
        double result3 = p.product(2.5, 3.5); // Task 5
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static class Product {
        public int product(int x, int y) { // Task 3
            return x * y;
        }

        public int product(int x, int y, int z) { // Task 4
            return x * y * z;
        }

        public double product(double x, double y) { // Task 5
            return x * y;
        }
    }
}
