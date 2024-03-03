(1) To the HighArray class, add a method called duplicatesExistAtRight() that takes one parameter,
say k, of type int; and returns true if the key of any item from the item at index k + 1 to the last item
in the array is equal to the key of the item at index k, and returns false otherwise. The method should
print an error message and return false if the parameter is negative or is greater than or equal to the
number of elements in the array.


(2) To the HighArray class, add a method called duplicatesExistAtLeft() that takes one parameter,
say k, of type int; and returns true if the key of any item from the first item to the item at index k − 1
in the array is equal to the key of the item at index k, and returns false otherwise. The method should
print an error message and return false if the parameter is negative or is greater than or equal to the
number of elements in the array.


(3) To the HighArray class, add a method called markDuplicatesAtRight() that takes one parameter,
say k, of type int; and for all items from the item at index k + 1 to the last item whose keys are equal to
the key of the item at index k, the method should change the keys of these items to -1 (assuming that
the real keys are all nonnegative integers). The method should print an error message if the parameter
is negative or is greater than or equal to the number of elements in the array.


(4) To the HighArray class, add a method called markDuplicatesAtLeft() that takes one parameter,
say k, of type int; and for all items from the first item to the item at index k −1 whose keys are equal to
the key of the item at index k, the method should change the keys of these items to -1 (assuming that
the real keys are all nonnegative integers). The method should print an error message if the parameter
is negative or is greater than or equal to the number of elements in the array.


(5) To the HighArray class, add a method called removeDuplicates1() that removes all duplicates
from the array by running through all items in the array and removing those for which the method
duplicatesExistAtRight() returns true. You should determine whether it is more efficient to run through
all items in the array from the first item to the last item (i.e. from left to right) or from the last item to
the first item (i.e. from right to left).


(6) To the HighArray class, add a method called removeDuplicates2() that works like removeDuplicates1() but makes use of the method duplicatesExistAtLeft() instead of the method duplicatesExistAtRight(). Again, you should determine whether it is more efficient to run through all items in the
array from left to right or from right to left.


(7) To the HighArray class, add a method called removeDuplicates3() that removes all duplicates
from the array as follows. In the first step, the method should run through all items in the array and
mark the duplicates as -1 by using the method markDuplicatesAtRight(), and then in the second step
the method should run through all items in the array again and remove those which are marked as -1. At
each step you should determine whether it is more efficient to run through all items in the array from left
to right or from right to left. In the first step, while running through all items in the array you should
skip the items which are already marked as -1 and do not call the method markDuplicatesAtRight()
for these items. In the second step, while removing the items which are marked as -1, do not use the
delete() method but use a more efficient approach instead.


(8) To the HighArray class, add a method called removeDuplicates4() that works like removeDuplicates3() but makes use of the method markDuplicatesAtLeft() instead of the method markDuplicatesAtRight(). Again, at each step you should determine whether it is more efficient to run through all
items in the array from left to right or from right to left.
