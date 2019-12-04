import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EqualsTest {

  @Test
  void testEquals() throws Exception{
    Equals equals = new Equals(5, "coucou",true);
    Equals equals2= new Equals( 5, "coucou", true);
    assertEquals(true, equals.equals(equals2));
  }

  @Test
  void testHashCode() throws Exception{
    Equals equals = new Equals(5, "coucou",true);
    Equals equals2= new Equals( 5, "coucou", true);

    assertEquals(true, equals.hashCode()==equals2.hashCode());
  }
}
