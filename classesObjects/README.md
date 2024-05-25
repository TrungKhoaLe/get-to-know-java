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
