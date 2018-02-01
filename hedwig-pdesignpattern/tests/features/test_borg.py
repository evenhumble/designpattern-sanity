# -*- coding: utf-8 -*-
from behavioral.borg.borgparent import BorgParent


def init_one_borg_instance():
    b1 = BorgParent()
    assert b1.state == 'Init'


def init_another_borg_instance():
    b2 = BorgParent()
    assert b2.state == 'Init'
