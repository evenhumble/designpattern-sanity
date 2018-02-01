# -*- coding:utf-8 -*-

class Swith:
    """
    The invoker class
    """

    def __init__(self, on_cmd, off_cmd):
        self.__on_cmd = on_cmd
        self.__off_cmd = off_cmd

    def on(self):
        self.__on_cmd.exec()

    def off(self):
        self.__off_cmd.exec()


class Light:
    """
    receiver class
    """

    def turn_on(self):
        print("turn light on")

    def turn_off(self):
        print("turn light off")


class Command:
    """
    The Command Abstract class
    """

    def __init__(self):
        pass

    def exec(self):
        raise NotImplemented("Please implement it")


class OnCommand(Command):
    """
    turn on command
    """

    def __init__(self, light):
        super().__init__()
        self.__light = light

    def exec(self):
        self.__light.turn_on()


class OffCommand(Command):
    def __init__(self, light):
        super().__init__()
        self.__light = light

    def exec(self):
        self.__light.turn_off()
