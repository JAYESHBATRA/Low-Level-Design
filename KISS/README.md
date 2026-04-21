# KISS - Keep It Simple, Stupid

> "Simplicity is the ultimate sophistication." — Leonardo da Vinci

## Overview
The KISS principle states that most systems work best if they are kept simple rather than made complicated. Unnecessary complexity should be avoided in design, as it makes the code:
- Harder to read
- Harder to test
- Harder to maintain
- More prone to bugs

## Why do we over-engineer?
Developers often over-engineer code because they:
- Try to "future-proof" it for requirements that don't exist yet.
- Want to show off their knowledge of complex Design Patterns.
- Think that simple code is "unprofessional" or "too easy".

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **Logic**: A simple weekday lookup (0-6 index).
- **Over-engineering**: Uses a Factory Pattern, multiple interfaces, and complex abstractions just to return a string like "Monday".
- **Problem**: It takes 50+ lines of code to do what could be done in 5. It is intimidating for new developers and hard to debug.

### 2. [Good Code](./GoodCode/)
- **Logic**: The same weekday lookup.
- **Simplicity**: Uses a simple array or a switch statement.
- **Result**: It's readable, instant to understand, and does exactly what is needed—nothing more.

## How to Run
- `BadCode/BadKISSMain.java` (Complexity overload)
- `GoodCode/GoodKISSMain.java` (Simplicity at its best)
