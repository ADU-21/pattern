# Abstract Factory

Provide a level of indirection that abstracts the creation of families of related or dependent objects without directly specifying their concrete classes. 
The "factory" object has the responsibility for providing creation services for the different product with same brand. 
Clients never create product with same brand directly, they ask the factory to do that for them.

# Structure

![](src/main/resources/abatract-factory.jpg)

# My example

Client can use FactoryProducer create Factory with specify brand, and then use factory create different type of product with same brand.

![](src/main/resources/my-example.png)