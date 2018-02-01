# -*- coding: utf-8 -*-

class C:
    def foo(cls, y):
        print('classmethod', cls, y)

    foo = classmethod(foo)

    @classmethod
    def bar(cls, y):
        print('classmethod', cls, y)


if __name__ == '__main__':
    C.foo('ds')
    C.bar('ds')
