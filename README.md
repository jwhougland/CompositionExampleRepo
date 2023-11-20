# CompositionExampleRepo
An example with using the composition relationship in an object-oriented program.  In this example the container will be a Building.  There will be Room instances that are part of the Building.  The idea is that the 'lifecycle' of the Room instances is dependent on the 'lifecycle' of the Building.  

UML:
[Building] <#>----- [Room]

Note: <#> is a textual way of representing a filled in diamond to indicate composition.
