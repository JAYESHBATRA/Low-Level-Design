# BookShelf (Iterator Pattern)

This example demonstrates the formal GoF structure of the Iterator pattern using an **Aggregate-passing** approach.

## Examples in this Folder

### 1. [Good Code](./GoodCode/)
- **Design**: Implements formal `Aggregate` and `Iterator` interfaces.
- **Approach**: The `BookShelfIterator` receives the `BookShelf` object itself.
- **Benefit**: Decouples the traversal logic from the collection while allowing "live" access.

### 2. [Bad Code](./BadCode/)
- **Problem**: The bookshelf forces the client to manage indices manually.
- **Consequence**: Tight coupling between the client and the bookshelf's internal `List` structure.
