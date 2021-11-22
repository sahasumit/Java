
class A{
  void m1(){
    System.out.println("Inside A's m1 method");
  }
}

class B extends A{
  //overriding m1
  void m1(){
    System.out.println("Inside B's m1 method");
  }
}

class C extends A{
  //overriding m1
  void m1(){
    System.out.println("Inside C's m1 method");
  }
}

 class Dispatch{
    public static void main(String args[]){
      //Object type A
      A a = new A();

      //Object type B
      B b = new B();

      //Object type C
      C c = new C();

    //Obtain a reference type A
      A ref;

      // ref refers to a A Object
      ref = a;

      //calling A's version of m1()
      ref.m1();

      // ref refers to a B Object
      ref = b;

      //calling B's version of m1()
      ref.m1();

      // ref refers to a C Object
      ref = c;

      //calling C's version of m1()
      ref.m1();


    }
}
