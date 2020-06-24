  class C1 {
      public void f ( ) {
          System.out.print(" 1 ");
      }
      public void g ( ) {  
          f ( );
          }
    }
    class C2 extends C1 {
        public void f ( ) {
            System.out.print(" 2 ");
        }
    }
    public class Prog {
        public static void main(String args[ ]) {
            C1 a = new C1( );
            a.f( );
            C2 b = new C2( );
            b.f( );
            a = b;
            a.f( );
            b.g( );
        }
    }