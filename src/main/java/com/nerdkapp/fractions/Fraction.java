package com.nerdkapp.fractions;

public class Fraction {
  private Integer numerator;
  private Integer denominator;

  public Fraction(Integer value) {
    this.numerator = value;
    this.denominator = 1;
  }

  public Fraction(Integer numerator, Integer denominator) {
    this.numerator = numerator;
    this.denominator = denominator;
  }

  public Fraction add(Fraction fraction) {
    return minimize(new Fraction(this.numerator + fraction.getNumerator(), this.denominator));
  }

  private Fraction minimize(Fraction fraction) {
    Integer gcd = gcd(fraction.numerator, fraction.denominator);
    return new Fraction(fraction.numerator/gcd, fraction.denominator/gcd);

  }

  private Integer gcd(Integer a, Integer b) {
    if (b==0) return a;
    return gcd(b, a % b);
  }

  public Integer getDenominator() {
    return denominator;
  }

  public Integer getNumerator() {
    return numerator;
  }

  @Override
  public boolean equals(Object o) {
    Fraction otherFraction = minimize((Fraction) o);
    Fraction thisFraction = minimize(this);

    return thisFraction.numerator.equals(otherFraction.numerator) && thisFraction.denominator == otherFraction.denominator;
  }

  @Override
  public int hashCode() {
    int result = numerator != null ? numerator.hashCode() : 0;
    result = 31 * result + (denominator != null ? denominator.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return numerator + "/" + denominator;
  }
}
