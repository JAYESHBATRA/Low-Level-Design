# Music Player (Iterator Pattern)

This example demonstrates the Iterator pattern using a **Playlist** that can be traversed in multiple ways.

## Examples in this Folder

### 1. [Good Code](./GoodCode/)
- **Design**: Encapsulates traversal into iterators (`SequentialIterator`, `ShuffleIterator`).
- **Benefit**: The client asks for an iterator and calls `next()`. The shuffling logic is hidden inside the iterator.

### 2. [Bad Code](./BadCode/)
- **Problem**: The playlist exposes its internal `ArrayList`.
- **Consequence**: The client must manually implement shuffle logic. If the internal storage changes, the client breaks.
