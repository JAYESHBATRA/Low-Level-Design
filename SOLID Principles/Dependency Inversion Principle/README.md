# Dependency Inversion Principle (DIP)

> "1. High-level modules should not depend on low-level modules. Both should depend on abstractions."
> "2. Abstractions should not depend on details. Details should depend on abstractions."

## Overview
The Dependency Inversion Principle (DIP) is the 'D' in SOLID. It is about reducing coupling between high-level business logic and low-level implementation details (like databases, external APIs, or UI). 

By "Inverting" the dependency, we ensure that our core logic stays stable while the details underneath it can be swapped out easily.

### Key Concepts
- **High-level Module**: Classes that contain the important business rules (e.g., `UserSyncService`).
- **Low-level Module**: Classes that perform basic, implementation-specific tasks (e.g., `MySQLDatabase`).
- **Dependency Injection**: The practice of passing a dependency into a class (e.g., through a constructor) instead of the class creating it manually.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **File**: `BadDIPUserSyncService.java`
- **Violation**: The service manually creates a `new BadDIPMySQLDatabase()` inside its constructor. 
- **Problem**: The service is "stuck" with MySQL. If you want to use MongoDB for testing or production, you have to modify the `UserSyncService` code.

### 2. [Good Code](./GoodCode/)
- **Design**: Depend on an Interface.
- **Interfaces**:
    - `GoodDIPDatabase.java`: Defines the contract (`saveData()`).
- **Classes**:
    - `GoodDIPMySQLDatabase`: Implementation detail.
    - `GoodDIPMongoDatabase`: Implementation detail.
    - `GoodDIPUserSyncService`: The high-level service that accepts *any* `GoodDIPDatabase` via its constructor.
- **Result**: The Service is now flexible. You can inject MySQL or MongoDB without changing a single line of business logic.

## How to Run
- `BadCode/BadDIPMain.java`
- `GoodCode/GoodDIPMain.java`
