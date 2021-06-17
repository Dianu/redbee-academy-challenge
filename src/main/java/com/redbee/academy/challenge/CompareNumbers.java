package com.redbee.academy.challenge;

public class CompareNumbers {

  /**
   * Method that receives two numbers and returns the
   * max of both
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @param c - Another Integer Number
   * @return The max of a, b and c
   */
  public static Integer max(Integer a, Integer b, Integer c) {
    a = a != null ? a : 0;
    b = b != null ? b : 0;
    c = c != null ? c : 0;
    return Math.max(a, Math.max(b, c));
  }
}
