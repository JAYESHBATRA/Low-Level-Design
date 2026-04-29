# Observer Pattern

> "Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically."

## Overview
The Observer pattern is a behavioural design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.

### When to Use?
1. **Event Handling**: When changes to the state of one object require changing other objects, and you don't know ahead of time how many objects need to be changed.
2. **Decoupling**: When some objects in your app must observe others, but only for a limited time or in specific cases.
3. **Triggered Updates**: When an abstraction has two aspects, one dependent on the other, and you want to encapsulate these aspects in separate objects so that you can vary and reuse them independently.

## Key Concept: Subject & Observer

| Component | Responsibility |
| :--- | :--- |
| **Subject** | Maintains a list of observers and provides methods to add, remove, and notify them. |
| **Observer** | Defines an interface for objects that should be notified of changes in a subject. |
| **Concrete Subject** | Stores state of interest to ConcreteObserver objects. Sends a notification to its observers when its state changes. |
| **Concrete Observer** | Implements the Observer interface to keep its state consistent with the subject's state. |

## Examples in this Section

1. [**Weather Monitoring System**](./WeatherExample/): A classic example showing how data from a weather station is broadcast to multiple display types.
2. [**Ride Sharing System (Uber/Ola)**](./RideSharingExample/): A real-world example of how ride status updates are shared with passengers, drivers, and admin dashboards.

---
## Navigation
- [Weather Example](./WeatherExample/)
- [Ride Sharing Example](./RideSharingExample/)
