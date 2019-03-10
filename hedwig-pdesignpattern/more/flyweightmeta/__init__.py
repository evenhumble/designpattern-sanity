__author__ = 'patrick'

"""
*What is this pattern about?
This pattern aims to minimise the number of objects that are needed by
a program at run-time. A Flyweight is an object shared by multiple
contexts, and is indistinguishable from an object that is not shared.

The state of a Flyweight should not be affected by it's context, this
is known as its intrinsic state. The decoupling of the objects state
from the object's context, allows the Flyweight to be shared.

*What does this example do?
The example below sets-up an 'object pool' which stores initialised
objects. When a 'Card' is created it first checks to see if it already
exists instead of creating a new one. This aims to reduce the number of
objects initialised by the program.

*References:
http://codesnipers.com/?q=python-flyweights

*TL;DR80
Minimizes memory usage by sharing data with other similar objects.
"""
