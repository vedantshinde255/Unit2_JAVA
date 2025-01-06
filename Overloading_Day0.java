// Here we have to define a class which is name Sample.
class Sample{
   // Here we use the print method which is said to be overloaded which accepts the integers values.
    public void print(int a){
        System.out.println("int-0" +a);
    }
    // Here again the print method is call to be overloaded which accepts the Double values.
    public void print(double a){
        System.out.println("double-" +a);
    }
    // Again the print method is call that accepts the String.
    public void print(String a){
        System.out.println("String-" +a);
    }
}
// In this line we are defining the public class which is named as Overloading_Day0
public class Overloading_Day0 {
    // Here the main method is used which is the entry point of the program.
    public static void main(String[] args) {
        // Here we have created an instance of the Sample class which we have used above.
        Sample obj=new Sample();

        // Here the print method is call with an integer arguement.
        obj.print(10);

        // Here the print method is call with a double arguement.
        obj.print(10.2);

        // Here the print method is call with a String arguement.
        obj.print("abc");
    }
}
