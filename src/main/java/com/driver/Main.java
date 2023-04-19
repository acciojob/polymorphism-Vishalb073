package com.driver;

public class Main {

    public static class Product{
        public int product(int x , int y){
            return x+y;
        }
        public int product(int x, int y, int z){
            return x*y*z;
        }
        public double product(double x, double y){
            return x*y;
        }
    }

    public static void main(String[] args) {
        Product p = new Product();
        int result1 = p.product(10, 20);
        int result2 = p.product(10, 20 ,30);
        double result = p.product(8.3,9.2);
        System.out.println(result1 + " " + result2 + " " + result );
    }
}