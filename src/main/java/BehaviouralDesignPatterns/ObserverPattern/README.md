# Observer Design Pattern

> "Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically." - GoF

## Overview
The Observer pattern is used when multiple objects need to be notified of changes in another object's state. It promotes loose coupling between the subject and its observers.

## Examples in this Folder

### 1. [Weather Monitoring System](./WeatherExample/)
A classic example where a `WeatherStation` (Subject) notifies multiple `WeatherDisplay` (Observers) like Phone and TV when measurements change.

### 2. [Ride Sharing System (Uber/Ola)](./RideSharingExample/)
A real-world example where a `Ride` (Subject) updates its status (e.g., "Driver Arrived") and notifies the Passenger app, Driver app, and Admin dashboard.

---
## Navigation
- [Weather Monitoring Example](./WeatherExample/)
- [Ride Sharing Example](./RideSharingExample/)
