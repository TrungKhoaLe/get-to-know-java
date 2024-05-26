# Classes

## Declaring classes

```java
class MyClass {
    // field, constructor, and
    // method declarations
}
```

```java
class MyClass extends MySuperClass implements MyInterface {
    // field, constructor, and
    // method declarations
}
```

## Declaring variables

```java
modifier dtype varName;
```

The modifier lets us control what other classes have access to a member field. In the spirit of encapsulation, it is common to make fields private.

dtype can be primitive types such as *int*, *float*, etc. or they can be reference types such as strings, arrays, or objects.

varName follows Java known naming rules and conventions: the first letter of a class name should be capitalized and the first (or only) word in a method name should be a verb.

## Defining methods

```java
public double calculateAnswer(double wingSpan, int numberOfEngines,
                              double length, double grossTons) {
    // do the calculation here                              
}
```

In the example above, the signature of the method is `calculateAnswer(double, int, double, double)`.

The convention to name a method is:
    - method names should be a verb in lowercase, or
    - a multi-word name that begins with a verb in lowercase, followed by adjectives, nouns, etc. In multi-word names, the first letter of each of the second and following words should be capitalized.

In Java, we can use the same name for methods as long as we pass a different argument list to each method. This is called method overloading.

*Notes:*
    - The compiler does not consider return type when differentiating methods, so we cannot declare two methods with the same signature even if they have different return type,
    - overloaded methods should be used in an infrequent manner as they can make code much less readable.

## Class constructors

Constructor declaration looks like method declarations - except they use the name of the class and have no return type.

```java
// constructor for the class Bicycle
public Bicycle(int startCadence, int startSpeed, int startGear) {
   gear = startGear;
   cadence = startCadence;
   speed = startSpeed;
}

// to create a new Bicycle object called myBike, a constructor is called by the `new` operator
Bicycle myBike = new Bicycle(30, 0, 8);
```

We could create a no-argument constructor for the class Bicycle as well.

```java
public Bicycle() {
    gear = 1;
    cadence = 10;
    speed = 0;
}
```

Both constructors can exist within the class Bicycle because they have different argument lists. This is similar to the method overloading.

If we don't provide any constructors for our class, the compiler automatically provides a no-argument, default constructor. This default constructor will call the no-argument constructor of the superclass. If the class has no explicit has no explicit superclass, then it has an implicit superclass of *Object*, which does have a no-argument constructor.

# Objects

## Creating objects

A variable that referes to an object is called a reference variable.

When we instantiate a class using the `new` operator, we are allocating a memory space for the new object and returning a reference to that memory. That reference is usually assigned to a variable of the appropriate type.

```java
// e.g.

Point originOne = new Point(23, 94);
```

The reference returned by the `new` operator does not necessarily have to be assigned to a variable. It can be used directly in an expression.

```java
// e.g.

int height = new Rectangle().height;
```

## Using objects

The `new` operator returns an object reference.

## The garbage collector

The Java runtime environment deletes objects when it determines that they are no longer being used.

What is the Java runtime environment?
    - Java runtime environment is the underlying technology that communicates between the Java program and the operating system. It acts as a translator and facilitator, providing all the resources so that once we write Java software, it runs on any operating system without further modification [1](https://aws.amazon.com/what-is/java-runtime-environment/).

# More on classes

## Returning a class or interface

A method can also return a reference type.

```java
public Bicycly seeWhosFastest(Bicycle myBike, Bicycle theOtherBike,
                              Environment env) {
    Bicycle fastest;
    // code to determine which bike is faster
    return fastest
}
```

When a method uses a class name as its return type, such as `seeWhosFastest` does, the class of the type of the returned object must be either a subclass of, or the exact class of, the return type.

For example, suppose that we have a class hierarchy like this: `Object -> Number -> ImaginaryNumber` and we have a method named `returnANumber()`, the return type of `returnANumber()` can either be `Number` or `Imaginary`. This is because the `Object` is not necessarily a `Number` - it could be a `String` or another type.

## Using the `this` keyword

Within an instance method or a constructor, `this` is a reference to the current object - the object whose method or constructor is being called. We can refer to any member of the current object from within an instance method or a constructor by using `this`.

# Controlling access to members of a class

Access level modifiers determine whether other classes can use a particular field or invoke a particular method. There are two levels of access control:
    - At the top level -- `public`, or `package-private`,
    - at the member level -- `public`, `private`, `protected`, or `package-private`

A class which is declared with the modifier `public` is visible to all classes everywhere. If a class has no modifier, it is visible within its own package.

At the member level, `public` modifier or no-modifier has the same meaninng as the top-level classes. The `private` modifier specifies that the member can only be accessed in its own class. The `protected` modifier specifies that the member can only be accessed within its own package and by a subclass of its class in another package.
