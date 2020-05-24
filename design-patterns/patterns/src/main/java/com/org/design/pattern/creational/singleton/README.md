# About Singleton Design Pattern
#### Category
    Creational Design patterns
#### Definition
Singleton pattern is used to limit the object creation of specific Type (Instanciable Class). 
We can limit the objects of any class from one to <any limit like 10>


The singleton[4] design pattern is one of the twenty-three well-known "Gang of Four" design patterns that describe how to solve recurring design problems to design flexible and reusable object-oriented software, 
that is, objects that are easier to implement, change, test, and reuse.

#### Problems Defnition
The singleton design pattern solves problems

* How can it be ensured that a class has only one instance?
* How can the sole instance of a class be accessed easily?
* How can a class control its instantiation?
* How can the number of instances of a class be restricted?

#### Known Use cases
*   The abstract factory, builder, and prototype patterns can use singletons in their implementation.
*   Facade objects are often singletons because only one facade object is required.
*   State objects are often singletons.

#### implementation Details
The singleton design pattern describes how to solve such problems:
* Hide the constructor of the class.
* Define a public static operation (getInstance()) that returns the sole instance of the class.
* The key idea in this pattern is to make the class itself responsible for controlling its instantiation (that it is instantiated only once).
* The hidden constructor (declared private) ensures that the class can never be instantiated from outside the class.
* The public static operation can be accessed easily by using the class name and operation name (Singleton.getInstance()).


## Versioning
0.1

## Authors

* Abdulrehman (abdulrehman.abdul.qau@gmail.com)

#### References
    *  Book: Gang of Four
    *  https://en.wikipedia.org/wiki/Singleton_pattern
