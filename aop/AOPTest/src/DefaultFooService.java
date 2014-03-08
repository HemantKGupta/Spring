public class DefaultFooService implements FooService {
 
      public Foo getFoo(String name, int age) {
            return new Foo(name, age);
      } 
      public void getAfter() {} 
      public void getBefore(String myName) {}
}