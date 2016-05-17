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
}
