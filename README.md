# List_inArraySlots
**Project Name:** ORANGETACOS

**Contributors:** Leia Park, Faria Huq

**Fields:**
* ArrayList
* capacity (the initial capacity of the array)
* filledElements (the number of filled slots of the array)

**Constructors:**
* A constructor that would create an empty array list with a small initial capacity.

**Methods:**
* An *add* boolean method that would add a value to the array if and only if the array is not filled.
  * If not, the *expand* method will be executed, which will expand the size of the array.
* A *remove* method that would remove an element at a specific position in the list.
* A *size* method that would return the length of the list.
* An *access* method that would return the value at a specific position in the list.
* A *String* method that would return a string representation of the list.
* An *expand* method that would double the size of the array.

**Remarks on the UserOfList class:**
* Add an element to the end of the list
* Remove an element in the beginning of the list
* Determine the size of the list
* Return the value of the last element of the list

**Purpose: source - skeletonHolmes:**
> implement a list by storing data in an encapsulated array
>
> List_inArraySlots stores integers with any value that datatype can hold.
>
> That implies that the implementation cannot identify the end of the list
> by the values of the integers stored in the list. That design decision
> would require reserving one integer value as a value that cannot be
> stored in the list.
