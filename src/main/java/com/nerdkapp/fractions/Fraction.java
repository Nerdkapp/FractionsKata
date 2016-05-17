package com.nerdkapp.fractions;

public class Fraction {
  private Integer value;

  public Fraction(Integer value) {
    this.value = value;
  }

  public Fraction add(Fraction fraction) {
    return new Fraction(this.value + fraction.getValue());
  }

  public Integer getValue() {
    return value;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    Fraction fraction = (Fraction) o;

    if (value != null ? !value.equals(fraction.value) : fraction.value != null) return false;

    return true;
  }

  @Override
  public int hashCode() {
    return value != null ? value.hashCode() : 0;
  }
}
