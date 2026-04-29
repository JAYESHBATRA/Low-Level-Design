# Observer Pattern - Weather Monitoring

> "A classic example showing how a single source of data can broadcast updates to multiple different consumers without being tightly coupled to them."

## Overview
This example demonstrates a Weather Station that tracks temperature and humidity. Whenever these measurements change, the station notifies all registered displays (Phone, TV, etc.).

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **Problem**: The `BadWeatherStation` has hardcoded references to `PhoneDisplay` and `TVDisplay`. 
- **Consequence**: Adding a new display type (like `WebDisplay` or `SmartWatchDisplay`) requires modifying the `BadWeatherStation` class, violating the **Open-Closed Principle**.

### 2. [Good Code](./GoodCode/)
- **Design**: Uses the **Observer Pattern**. The [WeatherStation.java](./GoodCode/WeatherStation.java) implements a generic [Subject](./GoodCode/Subject.java) interface, and all displays implement a common [Observer](./GoodCode/Observer.java) interface.
- **Result**: New displays can be added at runtime without changing a single line of code in the `WeatherStation`.

## How to Run
- `BadCode/BadWeatherStation.java` (Demonstrates tight coupling)
- `GoodCode/Main.java` (Demonstrates dynamic observer management and decoupled updates)
