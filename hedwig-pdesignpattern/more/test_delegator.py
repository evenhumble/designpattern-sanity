# -*- coding: utf-8 -*-

"""
-------------------------------------------------
   File Name：     test_delegator
   Description :
   Author :        patrick
   date：          2019/3/10
-------------------------------------------------
   Change Activity:
                   2019/3/10:
-------------------------------------------------
"""
from unittest import TestCase

from more.delegation_pattern import Delegator, Delegate

__author__ = 'patrick'


class TestDelegationPattern(TestCase):

    def test_delegation_pattern(self):
        delegator = Delegator(Delegate())
        print(delegator.p1) ## get the delegator like facade
        delegator.do_something("something") ## using the delegate method
