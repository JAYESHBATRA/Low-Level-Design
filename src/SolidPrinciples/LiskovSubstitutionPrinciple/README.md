# Liskov Substitution Principle (LSP)

> "Objects of a superclass should be replaceable with objects of its subclasses without breaking the application."

## Overview
The Liskov Substitution Principle (LSP) is the 'L' in SOLID. It ensures that inheritance is used correctly. It states that a subclass must be able to perform all the actions that its parent class claims to perform. If a subclass cannot perform a base class operation (e.g., throwing an `UnsupportedOperationException`), it violates LSP.

### Common Signs of LSP Violation
- **`UnsupportedOperationException`**: A subclass implements a method but only to throw an error.
- **`instanceof` Checks**: Code that uses the base class has to check for specific subclasses to handle them differently.
- **Null Returns**: Returning null for methods that are expected to return an object.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **Files**:
    - `BadLSPBird.java`: Base class with `fly()`.
    - `BadLSPOstrich.java`: Subclass that throws an error in `fly()`.
- **Violation**: A program expecting a generic `Bird` to fly will crash if it receives an `Ostrich`. This means `Ostrich` is NOT a proper substitute for `Bird`.

### 2. [Good Code](./GoodCode/)
- **Files**:
    - `GoodLSPBird.java`: Base class with shared logic (`eat()`).
    - `GoodLSPFlyingBird.java`: Specialized intermediate class for birds that can fly.
    - `GoodLSPSparrow.java`: Extends `FlyingBird`.
    - `GoodLSPOstrich.java`: Extends `Bird` directly.
- **Result**: The code is now type-safe. You can only call `fly()` on objects of type `FlyingBird`, so there is no risk of a runtime crash.

## How to Run
- `BadCode/BadLSPMain.java` (Watch it crash!)
- `GoodCode/GoodLSPMain.java` (Safe and logical)
