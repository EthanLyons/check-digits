package edu.cnm.deepdive;

public class Check {

  private static final String OUTPUT_FORMAT =
      "Input = %d; remainder = %d; digit sum = %d; remainder = %d.%n";
  private static final int MODULUS = 9;

  public static int digitSum(int input) {
    int sum = 0;
    String inStr = "" + input;
    for (char c : inStr.toCharArray()) {
      sum += c - '0';
    }
    return sum;
  }

  public static void main(String[] args) {
    int input = Integer.parseInt(args[0]);
    int sum = digitSum(input);
    System.out.printf(OUTPUT_FORMAT, input, input % MODULUS, sum, sum % MODULUS);
  }

}
