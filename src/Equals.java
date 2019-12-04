public class Equals {
  long a;
  String b;
  boolean c;

  public Equals(int a, String b, boolean c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) ;
    Equals autre = (Equals) obj;
    if (a != autre.a) return false;
    if (b == null) {
      if (autre.b != null) return false;
      else if (!b.equals(autre.a)) return false;
    }
    if (b != autre.b) return false;
    if (c != autre.c) return false;
    return true;
  }

  @Override
  public int hashCode() {
    int resultat = 1;
    //pour les booléens
    resultat = resultat * 58 + (c ? 158 : 200);
    //pour les Strings
    resultat = resultat * 58 + ((b == null) ? 0 : b.hashCode());
    //pour les Long  >>>operateurs de manipulations de bits
    resultat = resultat * 58 + (int) (a ^ a >>> 32);
    return resultat;
  }
}
