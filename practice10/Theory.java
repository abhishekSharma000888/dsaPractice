package practice10;

public class Theory {

    /*
    the checked exceptions occurs at the compile time and must be handled using a try-catch block, we can use
    throws keyword to handle it.
    example: IOException,SQLException and FileNotFoundException

    The unchecked exceptions occurs at the runtime and if not handled it will may result into crashing of the porogram.
    Example are NullPointerException, ArithmeticException.
     */

    /*
    Throw vs throws

    try{
    int a = 10/0;
    } catch(ArithmeticException e){
    }
    finally {
    System.out.println("statement got executed.");
    }

    public class Example {

    public void validNumber() throws ArithmeticException, SQLException, NullPointerException {
        int a = 10 / 0;  // Will throw ArithmeticException
    }
}

     */
}
