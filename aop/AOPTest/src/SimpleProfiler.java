public class SimpleProfiler {
   public void afterMethod() throws Throwable {
         System.out.println("After the method call");
   }
   public void beforeMethod(String myName){
         System.out.println("My name is "+myName);
   }
}
