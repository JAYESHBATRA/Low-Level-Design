# DRY - Don't Repeat Yourself

> "Every piece of knowledge must have a single, unambiguous, authoritative representation within a system."

## Overview
The DRY principle is a core philosophy in software development. It aims to reduce repetition of software patterns, replacing it with abstractions or using data normalization to avoid redundancy.

The opposite of DRY is **WET** (Write Everything Twice, or We Enjoy Typing).

### Why avoid duplication?
- **Maintenance**: If you have the same logic in 5 places and the rule changes, you have to find and update all 5. If you miss one, you have a bug.
- **Consistency**: Centralized logic ensures that the entire application behaves consistently.
- **Clarity**: It's easier to understand the intent of the code when logic is named and centralized in a descriptive utility or method.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **Logic**: Phone number validation.
- **Violation**: Two different classes (`UserRegistration` and `EmployeeOnboarding`) both contain the exact same logic for validating phone numbers.
- **Problem**: If the phone format requirements change (e.g., adding international support), we have to update multiple files.

### 2. [Good Code](./GoodCode/)
- **Logic**: The same phone number validation.
- **Simplicity**: The validation logic is moved into a dedicated `GoodDRYValidator` class.
- **Result**: Both registration services now call the same validator. Any change to the validation logic happens in **one place** and updates the whole system instantly.

## How to Run
- `BadCode/BadDRYMain.java` (Logic duplication)
- `GoodCode/GoodDRYMain.java` (Centralized logic)
