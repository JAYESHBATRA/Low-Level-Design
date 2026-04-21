# YAGNI - You Ain't Gonna Need It

> "Always implement things when you actually need them, never when you just foresee that you need them." — Ron Jeffries

## Overview
YAGNI is a principle from Extreme Programming (XP). It suggests that developers should not add functionality until it is absolutely necessary. "Speculative" coding—building features because you *think* you might need them later—is generally a waste of time and resources.

### The Dangers of "Just in Case" Code:
- **Complexity**: Extra code makes the system harder to understand.
- **Testing Overhead**: More code means more tests to write and maintain.
- **Bugs**: Every line of code is a potential place for a bug to hide.
- **Maintenance**: You have to carry the weight of that unused feature forever.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **Requirement**: Save a user to a database.
- **Violation**: The developer adds "Export to JSON," "Soft-Delete," and "User Version History" even though they weren't requested.
- **Problem**: The [BadYAGNIUserService.java](./BadCode/BadYAGNIUserService.java) is cluttered with methods that have no caller, making the core logic hard to find.

### 2. [Good Code](./GoodCode/)
- **Requirement**: Save a user to a database.
- **Simplicity**: The class implements ONLY the save functionality. 
- **Result**: [GoodYAGNIUserService.java](./GoodCode/GoodYAGNIUserService.java) is clean, easy to test, and perfectly fulfills the current requirement. If we need JSON export later, we'll add it then.

## How to Run
- `BadCode/BadYAGNIMain.java` (Complexity bloat)
- `GoodCode/GoodYAGNIMain.java` (Clean and focused)
