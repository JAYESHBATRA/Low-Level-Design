# Single Responsibility Principle (SRP)

> "A class should have one, and only one, reason to change."

## Overview
The Single Responsibility Principle (SRP) is the 'S' in SOLID. It states that a class should be responsible for only one part of the functionality provided by the software, and that responsibility should be entirely encapsulated by the class.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **File**: `BadSRPInvoice.java`
- **Violation**: The `BadSRPInvoice` class handles multiple responsibilities:
    - Holding data (id, amount)
    - Business logic (GST calculation)
    - Presentation logic (printing to console)
    - Persistence logic (saving to database)
- **Why it's bad**: If you want to change how the invoice is printed (e.g., to PDF) or how it's saved (e.g., to a Different DB), you are forced to modify the core `Invoice` class. This increases the risk of introducing bugs in unrelated logic.

### 2. [Good Code](./GoodCode/)
- **Files**:
    - `GoodSRPInvoice.java`: Handles ONLY data and core calculations.
    - `GoodSRPInvoicePrinter.java`: Handles ONLY the printing logic.
    - `GoodSRPInvoiceRepository.java`: Handles ONLY the persistence (saving) logic.
- **Why it's good**: Each class has exactly one responsibility.
    - To change printing, you only modify `GoodSRPInvoicePrinter`.
    - To change storage, you only modify `GoodSRPInvoiceRepository`.
    - The core `GoodSRPInvoice` remains untouched and stable.

## How to Run
Open the respective `Main` files in each folder to see the demos in action:
- `BadCode/BadSRPMain.java`
- `GoodCode/GoodSRPMain.java`
