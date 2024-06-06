public class Demo {

  protected void finalize() throws Throwable {
    try {
      System.out.println("Inside finalize method of Demo Class.");
    } 
    catch (Throwable e) {
      throw e;
    } 
    finally {
      System.out.println("Calling finalize method of the Object class");

      // Calling finalize() of Object class
      super.finalize();
    }
  }

  public static void main(String[] args) throws Throwable {
    // Creating demo's object
    Demo d = new Demo();

    // Calling finalize of demo
    d.finalize();
  }
}


class Example 
{
    public static void main(String[] args) 
    {
        Example ex = new Example(); // Creating object ex of class Example
        ex = null; // Unrefrencing the object ex.
        System.gc(); // Calling garbage collector to destroy ex
        System.out.println("Unreferenced object ex is destroyed successfully!");
    }
    
    @Override
    protected void finalize()
    {
        System.out.println("Inside finalize method");
        System.out.println("Performing clean-up before destroying the object.");
        System.out.println("Release and close connections.");
    }
}
