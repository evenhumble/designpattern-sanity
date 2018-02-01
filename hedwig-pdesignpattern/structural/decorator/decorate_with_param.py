# -*- coding: utf-8 -*-
from functools import wraps


def manual_decorate(fn):
    def wrapped(*args, **kw):
        print('hello hello')
        print("args:" + str(args) + ",kw:" + str(kw))
        return "<br>" + fn(*args, **kw) + "</br>"

    return wrapped


def manual_decorate_parameter(log_level):
    print("log_level", log_level)

    def wrapped(func):
        print(func)
        print(func())
        return func

    return wrapped


def make_bold(fn):
    @wraps(fn)
    def wrapped(*args, **kw):
        print("args:" + str(args) + ",kw:" + str(kw))
        return "<br>" + fn() + "</br>"

    return wrapped


@make_bold
def log_message():
    return "this is log message"


@manual_decorate
def log_message_manual(message):
    return "this is log message" + message


@manual_decorate_parameter("test")
def log_message_withparams():
    return "this is log message"


print(log_message())
print(log_message_manual("message"))
print(log_message_manual(message="message"))
print(log_message_withparams())


def decorator_whith_params_and_func_args(arg_of_decorator):
    def handle_func(func):
        def handle_args(*args, **kwargs):
            print("begin")
            func(*args, **kwargs)
            print("end")
            print(arg_of_decorator, func, args, kwargs)

        return handle_args

    return handle_func


@decorator_whith_params_and_func_args("123")
def foo4(a, b=2):
    print("Content")


foo4(1, b=3)


class A():
    @staticmethod
    def test_static():
        print("static")

    def test_normal(self):
        print("normal")

    @classmethod
    def test_class(cls):
        print("class", cls)
