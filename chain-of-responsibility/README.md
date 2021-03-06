# Chain of responsibility
The pattern allows multiple objects to handle the request without coupling sender class to the concrete classes of the receivers. 
The chain can be composed dynamically at runtime with any handler that follows a standard handler interface.

# Structure
![](src/main/resources/chain-of-responsibility.jpg)

# My example
![](src/main/resources/my-example.png)

# Reference
<https://www.baeldung.com/chain-of-responsibility-pattern>

# Note
- FilterChain is a linked list with same filter object. It makes different processor handle same request become possible.
- Reduce coupling of responsibility via pipeline, increase the flexibility of responsibilities.