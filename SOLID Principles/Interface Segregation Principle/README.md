# Interface Segregation Principle (ISP)

> "No client should be forced to depend on methods it does not use."

## Overview
The Interface Segregation Principle (ISP) is the 'I' in SOLID. It deals with the disadvantages of "fat" or "polluted" interfaces. Instead of creating a single, massive interface for multiple purposes, we should create smaller, highly specific interfaces.

### The Problem with Fat Interfaces
- **Forced Implementation**: Classes are forced to implement methods they don't need (often resulting in empty or throwing `UnsupportedOperationException`).
- **Rigid Design**: Changes to one part of the fat interface can force re-compilation and re-testing of unrelated classes.
- **Confusion**: It becomes unclear what a class actually does vs. what it is forced to do by the interface.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **File**: `BadISPSmartDevice.java` (Interface with Print, Scan, Fax)
- **Violation**: An `OldPrinter` is forced to implement `scan()` and `fax()`, even though it physically cannot do those things. 

### 2. [Good Code](./GoodCode/)
- **Design**: Segregated Interfaces.
- **Interfaces**:
    - `GoodISPPrinter.java`: Just `print()`.
    - `GoodISPScanner.java`: Just `scan()`.
    - `GoodISPFaxer.java`: Just `fax()`.
- **Classes**:
    - `GoodISPSimplePrinter`: Implements only `GoodISPPrinter`.
    - `GoodISPSmartPrinter`: Implements all interfaces.
- **Result**: No class is forced to implement a method it doesn't support.

## How to Run
- `BadCode/BadISPMain.java`
- `GoodCode/GoodISPMain.java`
