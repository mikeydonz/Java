public class Calculator {

  // addition
  public int add(int a, int b) {
    return a + b;
  }

  // subtraction
  public int subtract(int a, int b) {
    return a - b;
  }

  // multiplication
  public int multiply(int a, int b) {
    return a * b;
  }

  // division
  public int divide(int a, int b) {
    return a / b;
  }

  // modulo
  public int modulo(int a, int b) {
    return a % b;
  }

  // main 
  public static void main(String[] args) {
    Calculator myCalculator = new Calculator();
    System.out.println(myCalculator.add(1, 2));
    System.out.println(myCalculator.subtract(1, 2));
    System.out.println(myCalculator.multiply(1, 2));
    System.out.println(myCalculator.divide(2, 1));
    System.out.println(myCalculator.modulo(2, 1));
  }
}
