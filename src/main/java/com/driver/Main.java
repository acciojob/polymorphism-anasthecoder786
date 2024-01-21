package com.driver;
class Product
{
  public int product(int x, int y) {}
  public int product(int x, int y, int z) {}
  public double product(double x, double y) {} 
}
public class Main {
  public static void main(String[] args)
  {
    Product p=new Product();
    p.product(2,3);
    p.product(4,5,6);
    p.product(7.2,8.4);
  }
}
