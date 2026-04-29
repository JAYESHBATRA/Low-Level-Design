# Observer Pattern - Ride Sharing System

> "A real-world application showing how ride status changes are broadcast to Passenger, Driver, and Admin applications."

## Overview
In systems like Uber or Ola, a single event (e.g., "Driver Arrived") triggers different actions across various apps. The Passenger app shows a notification, the Driver app updates its UI, and the Admin dashboard logs the event for tracking.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **Problem**: The `BadRide` class directly calls specific methods on `PassengerApp`, `DriverApp`, and `AdminDashboard`.
- **Consequence**: The logic for notifying different systems is tangled within the Ride's core business logic.

### 2. [Good Code](./GoodCode/)
- **Design**: The [Ride.java](./GoodCode/Ride.java) class acts as a [RideSubject](./GoodCode/RideSubject.java). It doesn't know *who* its observers are; it only knows they implement the [RideObserver](./GoodCode/RideObserver.java) interface.
- **Result**: We can easily add new types of observers (e.g., `AnalyticsSystem`, `SafetyHotline`) without touching the `Ride` class.

## How to Run
- `BadCode/BadRide.java` (Direct method calls)
- `GoodCode/Main.java` (Decoupled event broadcasting)
