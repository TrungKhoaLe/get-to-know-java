# get-to-know-java

## Inheritance

Syntax for creating a subclass is as follows:

```java
class MountainBike extends Bicycle {
    // new fields and methods defining
    // a mountain bike would go here
}
```

This gives _MountainBike_ all the same fields and methods as _Bicycle_, yet allows its code to focus exclusively on the features that make it unique.

## Literals

A literal is the source code representation of a fixed value; literals are represented directly in the code without requiring computation.

## Interface

In its most common form, an interface is a groupd of related methods with empty bodies.

```java

class Bicycle {
    // empty body
    void changeCadence(int newValue);
    // empty body
    void changeGear(int newValue);
    // empty body
    void speedUp(int increment);
    // empty body
    void applyBrakes(int decrement);
}

class ACMEBicycle implements Bicycle {}
```
