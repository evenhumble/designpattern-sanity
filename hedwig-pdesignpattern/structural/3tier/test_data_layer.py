# -*- coding: utf-8 -*-

"""
-------------------------------------------------
   File Name：     test_data
   Description :
   Author :        patrick
   date：          2019/3/10
-------------------------------------------------
   Change Activity:
                   2019/3/10:
-------------------------------------------------
"""
from unittest import TestCase
from .tier_layers import DataLayer

__author__ = 'patrick'


class TestData(TestCase):
    def test_get_product(self):
        product = DataLayer()
        print(product.products['milk'])
