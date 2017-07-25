# -*- coding: utf-8 -*-

class Person(object):
    """
    class definition
    constructor function
    destructor function
    attributes
    methods
    """

    def __init__(self, name):
        self.name = name

    def say_hello(self):
        print('%s says hello' % self.name)

    def __del__(self):
        print("time to say goodbye!")


Person('patrick').say_hello()
print(Person.__dict__)
print(Person.__doc__)
print(Person.__name__)
print(Person.__module__)
print(Person.__bases__)
print(Person.__base__)


# inheritance

class Man(Person):
    def wear(self):
        print(" I am shy")


"""
The only rule necessary to explain the
semantics is the resolution rule used for class attribute
references. This is depth-first, left-to-right.
Thus, if an attribute is not found in DerivedClass,
it is searched in Base1, then recursively in the classes of Base1,
aand only if it is not found there,
 it is searched in Base2, and so on.
"""
Man("patrick").wear()


class A:
    def __init__(self):
        self.__A = 'A'

    def A(self):
        print("A")


class B:
    def A(self):
        print("B")

    def B(self):
        print("BB")


class C(A, B):
    # def __init__(self):
    #     super(A, self).__init__()

    def c(self):
        print("C")


C().B()
C().A()
# print(C().__A)

"""
Everywhere is polymorphism in Python
"""

print(1+2)
print('key'+'board')
print((1,2,3)+(4,5,6))
# print({"A":"a"}+{"B":"b"})
print(repr(123))
print(repr(1+2))
