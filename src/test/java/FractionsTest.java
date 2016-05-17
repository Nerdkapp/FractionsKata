import static org.junit.Assert.assertEquals;

import com.nerdkapp.fractions.Fraction;
import org.junit.Test;

public class FractionsTest {
  
  @Test
  public void add_zero_to_zero() throws Exception {
    Fraction result = new Fraction(0).add(new Fraction(0));
    assertEquals(new Fraction(0),result);
  }

  @Test
  public void one_plus_one() throws Exception {
    Fraction result = new Fraction(1).add(new Fraction(1));
    assertEquals(new Fraction(2),result);
  }

  @Test
  public void half_plus_half(){
    Fraction result = new Fraction(1,2).add(new Fraction(1,2));
    assertEquals(new Fraction(2,2), result);
  }

  @Test
  public void half_plus_half_shouldbe_normalized(){
    Fraction result = new Fraction(1,2).add(new Fraction(1,2));
    assertEquals(new Fraction(1), result);
  }

//  @Test
//  public void testGCD() throws Exception {
//    System.out.println(GCD(4,2));
//
//  }


}

//normalizzazione (2/4+2/4)