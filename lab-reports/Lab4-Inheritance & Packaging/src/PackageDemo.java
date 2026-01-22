//Write a program to demonstrate the concept of a built-in package and user defined package.

// 1. Using a BUILT-IN package (comes with Java)
import java.util.Date; 

// 2. Using a USER-DEFINED package (the one we 'created' above)
import MyPackage.UserPackageClass;

public class PackageDemo {
    public static void main(String[] args) {
        
        // Demonstrate Built-in Package (java.util)
        Date now = new Date();
        System.out.println("Built-in Package Date: " + now);
        
        // Demonstrate User-defined Package (mypackage)
        UserPackageClass obj = new UserPackageClass();
        obj.show();
    }
}