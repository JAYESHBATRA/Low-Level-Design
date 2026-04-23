# Singleton Pattern

> "Ensure a class only has one instance, and provide a global point of access to it."

## Overview
The Singleton pattern is used when you need to ensure that only a single instance of a class exists throughout the entire application's lifecycle. This is common for shared resources like:
- Database Connection Pools
- Configuration Managers
- Logger instances
- Caching services

## Core Principles
1. **Private Constructor**: Prevents other classes from instantiating the class using `new`.
2. **Static Instance Variable**: A static field that holds the unique instance of the class.
3. **Static Access Method**: A public static method (usually `getInstance()`) that returns the instance, creating it if it doesn't already exist.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **Problem**: Shows how a class with a public constructor allows multiple instances of a "shared" resource (like a Database connection) to be created, leading to resource waste and potential state inconsistency.

### 2. [Good Code](./GoodCode/)
- **Design**: Implements a **Basic Lazy Singleton**.
- **Result**: Ensures that every request for the object returns the **exact same instance**, saving memory and ensuring a single source of truth.

## How to Run
- `BadCode/BadSingletonMain.java` (Multiple objects created)
- `GoodCode/GoodSingletonMain.java` (Single object shared)
