# God Object

A **God object** is an object that either knows too much or does too much, which is an example of breaking the [Single Responsibility Principle](https://en.wikipedia.org/wiki/Single_responsibility_principle). A God object often creates strong dependency since there are too many other objects rely on the single God object for information and interaction. A God object is also hard to unit-test, maintain, debug, and document.

In this example, we demonstrate how a `StudentUtils` is responsible for way too many actions.
