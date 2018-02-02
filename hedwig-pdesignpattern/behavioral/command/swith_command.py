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


class LightSwitch:
    """
    The client class
    """

    def __init__(self):
        self.__lamp = Light()
        self.__on = OnCommand(self.__lamp)
        self.__off = OffCommand(self.__lamp)
        self.__switch = Swith(self.__on, self.__off)

    def switch(self, cmd):
        cmd = cmd.strip().upper()
        try:
            if cmd == "ON":
                self.__switch.on()
            elif cmd == "OFF":
                self.__switch.off()
            else:
                print("Wrong Argument!!")
        except Exception as e:
            print("Exception occurred: %s" % e)


if __name__ == '__main__':
    light_switch = LightSwitch()
    light_switch.switch("ON")
    light_switch.switch("OFF")