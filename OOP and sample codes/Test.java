class A {
  int x = 10;
}

class B extends A {
  int x = 20;
}

class Test{
  public static void main(String args[]){
    A a = new A();
    B b = new B();
    A ref;
    System.out.println(a.x);
    System.out.println(b.x);
    ref = a;
    System.out.println(ref.x);
    ref = b;
    //runtime polismorphism can't be achieved for data members
    //java overrides method not the data members;
    System.out.println(ref.x);

  }

}
