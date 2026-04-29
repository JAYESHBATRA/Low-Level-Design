# Open Closed Principle (OCP)

> "Software entities (classes, modules, functions, etc.) should be open for extension, but closed for modification."

## Overview
The Open Closed Principle (OCP) is the 'O' in SOLID. It ensures that the system is designed in a way that allows new functionality to be added without changing the existing source code. This is typically achieved using **Interfaces** or **Abstract Classes**.

### Key Benefits
- **Stability**: Existing code is not touched, so there is no risk of breaking existing functionality.
- **Maintainability**: New features are added in new classes, keeping the codebase clean.
- **Testability**: New classes can be tested independently without re-testing the whole system.

## Examples in this Folder

### 1. [Bad Code](./BadCode/)
- **File**: `BadOCPNotificationService.java`
- **Violation**: The service uses an `if-else` block to handle different notification types. If we want to add a new type (e.g., WhatsApp), we have to **modify** the service class.

### 2. [Good Code](./GoodCode/)
- **Design**: Uses a `NotificationMedium` interface.
- **Files**:
    - `GoodOCPNotificationMedium.java`: The abstraction (Interface).
    - `GoodOCPEmailNotification.java`: concrete extension.
    - `GoodOCPSMSNotification.java`: concrete extension.
    - `GoodOCPNotificationService.java`: The core service that remains **closed for modification**.
- **Result**: To add WhatsApp, we just create a `GoodOCPWhatsAppNotification.java`. We never touch the Service class.

## How to Run
- `BadCode/BadOCPMain.java`
- `GoodCode/GoodOCPMain.java`
