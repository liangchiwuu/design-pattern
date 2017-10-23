# Constant Interface

A **constant interface** anti-pattern describes the use of an interface solely to define constants, and having classes implement that interface in order to achieve convenient syntactic access to those constants. According to *Effective Java*: 

> **The constant interface pattern is a poor use of interfaces.** That a class uses some constants internally is an implementation detail. Implementing a constant interface causes this implementation detail to leak into the class's exported API. It is of no consequence to the users of a class that the class implements a constant interface. In fact, it may even confuse them. Worse, it represents a commitment: if in a future release the class is modified so that it no longer needs to use the constants, it still must implement the interface to ensure binary compatibility. If a nonfinal class implements a constant interface, all of its subclasses will have their namespaces polluted by the constants in the interface.

In this example, we designed a `Circle` class which implements `Constants` interface to access the constant `PI`. This implementation violates the intention of an interface since `Constants` does not define any behavior for `Circle` class.
