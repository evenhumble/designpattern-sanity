from unittest import TestCase

# -*- coding: utf-8 -*-
from behavioral.borg.borgparent import BorgParent, YoungBorg


class TestBorgParent(TestCase):
    def setUp(self):
        self.b1 = BorgParent()
        self.b2 = BorgParent()
        self.b3 = YoungBorg()
        self.b4 = YoungBorg()

    def test_all_state_changed(self):
        self.b1.state = 'Running'
        assert self.b2.state == 'Running'
        assert self.b3.state == 'Running'
        assert self.b4.state == 'Running'

    def test_all_instance_not_same(self):
        assert self.b1 != self.b2 != self.b3 != self.b4

    def test_dict_state_value(self):
        self.b1.state = 'Running'
        assert self.b1.__dict__['state'] == 'Running'
        assert len(self.b1.__dict__) == 1
