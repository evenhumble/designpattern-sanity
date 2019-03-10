# -*- coding: utf-8 -*-

"""
-------------------------------------------------
   File Name：     delegation_pattern
   Description :
   Reference: https://en.wikipedia.org/wiki/Delegation_pattern
    Author: https://github.com/IuryAlves
    allows object composite to achieve the same code reuse
   Author :        patrick
   date：          2019/3/10
-------------------------------------------------
   Change Activity:
                   2019/3/10:
-------------------------------------------------
"""
__author__ = 'patrick'


class Delegator(object):
    def __init__(self, delegate):
        self.delegate = delegate

    def __getattr__(self, item):
        attr = getattr(self.delegate, item)
        if not callable(attr):
            return attr

        def wrapper(*args, **kwargs):
            return attr(*args, **kwargs)

        return wrapper


class Delegate(object):
    def __init__(self):
        self.p1 = 123

    def do_something(self, something):
        return "Doing %s" % something
