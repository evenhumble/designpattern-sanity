from functools import wraps

__author__ = 'patrick'

"""https://docs.python.org/2/library/functools.html#functools.wraps"""
"""https://stackoverflow.com/questions/739654/how-can-i-make-a-chain-of-function-decorators-in-python/739665#739665"""
"""
*What is this pattern about?
The Decorator pattern is used to dynamically add a new feature to an
object without changing its implementation. It differs from
inheritance because the new feature is added only to that particular
object, not to the entire subclass.

*What does this example do?
This example shows a way to add formatting options (boldface and
italic) to a text by appending the corresponding tags (<b> and
<i>). Also, we can see that decorators can be applied one after the other,
since the original text is passed to the bold wrapper, which in turn
is passed to the italic wrapper.

*Where is the pattern used practically?
The Grok framework uses decorators to add functionalities to methods,
like permissions or subscription to an event:
http://grok.zope.org/doc/current/reference/decorators.html

*References:
https://sourcemaking.com/design_patterns/decorator

*TL;DR80
Adds behaviour to object without affecting its class.
"""

def make_bold(fn):
    @wraps(fn)
    def wrapped():
        return "<br>" + fn() + "</br>"

    return wrapped


def make_italic(fn):
    @wraps(fn)
    def wrapped():
        return "<i>" + fn() + "</i>"

    return wrapped


@make_bold
@make_italic
def hello():
    """a decorated hello world"""
    return "hello world"


if __name__ == '__main__':
    print('result:{}   name:{}   doc:{}'.format(hello(), hello.__name__, hello.__doc__))
    result = hello()
    print(result)
