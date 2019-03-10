# -*- coding: utf-8 -*-

"""
-------------------------------------------------
   File Name：     3-tier
   Description :
   Separates presentation,
   application processing, and data management functions.
   Author :        patrick
   date：          2019/3/10
-------------------------------------------------
   Change Activity:
                   2019/3/10:
-------------------------------------------------
"""
__author__ = 'patrick'


class DataLayer(object):
    products = {
        'milk': {'price': 1.50, 'quantity': 10},
        'eggs': {'price': 0.20, 'quantity': 100},
        'cheese': {'price': 2.00, 'quantity': 10},
    }

    def __get__(self, obj, klas):
        print("(Fetching from Data Store)")
        return {'products': self.products}


class BusinessLayer(object):
    data = DataLayer()
    """ UI interaction class """

    def product_list(self):
        return self.data['products'].keys()

    def product_information(self, product):
        return self.data['products'].get(product, None)


class UILayer(object):
    def __init__(self):
        self.business_layer = BusinessLayer()

    def get_product_list(self):
        print("PRODUCT LIST")
        for product in self.business_layer.product_list():
            print(product)
        print('')

    def get_product_information(self, product):
        prod_info = self.business_layer.product_information(product)
        if prod_info:
            print(
                "Name {name},Price: {price},Quantity: {quantity}".format(
                    name=prod_info.name, price=prod_info.price, quantity=prod_info.quantity
                )
            )
        else:
            print("product not existing")
