// The instanceof compares an object to a specified type
// We can use it to test if an object is an instance of a class,
// or an instance of a class that implements a particular interface

class InstanceofDemo {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        Parent obj2 = new Child();
        // true
        System.out.println("obj1 instance of Parent: " +
                           (obj1 instanceof Parent));
        // false
        System.out.println("obj1 instance of Child: " +
                           (obj1 instanceof Child));
        // false
        System.out.println("obj1 instance of myInterface: " +
                           (obj1 instanceof myInterface));
        // true
        System.out.println("obj2 instance of Parent: " +
                           (obj2 instanceof Parent));
        // true
        System.out.println("obj2 instance of Child: " +
                           (obj2 instanceof Child));
        // true
        System.out.println("obj2 instance of myInterface: " +
                           (obj2 instanceof myInterface));
    }
}
class Parent {}
// the Child class inherits from the Parent class, and
// implements the interface
class Child extends Parent implements myInterface {}
interface myInterface {}
