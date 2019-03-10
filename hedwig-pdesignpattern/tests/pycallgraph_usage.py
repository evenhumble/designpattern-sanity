# -*- coding: utf-8 -*-

"""
-------------------------------------------------
   File Name：     pycallgraph_usage
   Description :   demo to how to use pycallgraph
   Author :        patrick
   date：          2019/3/10
-------------------------------------------------
   Change Activity:
                   2019/3/10:
-------------------------------------------------
"""
from pycallgraph import PyCallGraph, GlobbingFilter
from pycallgraph.output import GraphvizOutput
from pycallgraph import Config

__author__ = 'patrick'


class Bar:

    def __init__(self):
        pass

    def eat(self):
        print("it is eating")
        self.prepare()
        self.chew()
        self.swallow()

    def prepare(self):
        print("prepare eating")

    def chew(self):
        print("chewing")

    def swallow(self):
        print("swallowing")


graph = GraphvizOutput(output_file="filter_none.png")

config = Config(max_depth=1)
config.trace_filter = GlobbingFilter(exclude=[
    'pycallgraph.*',
    '*.chew',
])
with PyCallGraph(output=graph,config=config):
    bar = Bar()
    bar.eat()

