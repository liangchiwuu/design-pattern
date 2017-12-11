# Delegation

Delegation pattern is a technique where an object expresses certain behavior to the outside but in reality delegates responsibility for implementing that behavior to an associated object. This can be used to reduce the coupling of methods to their class.

In this example, we access the `print()` method through `PrinterController`. This allows us to separate the users from directly accessing actual `Printer` instances.
