
# Python Decorator

resource:
- [functools.wraps](https://docs.python.org/2/library/functools.html#functools.wraps)
- [decorators](https://stackoverflow.com/questions/739654/how-can-i-make-a-chain-of-function-decorators-in-python/739665#739665)

|写法|使用Decorator|不使用Decorator|
|----|-------------|--------------|
|单个decorator|@dec <br> def method(args):<br>pass|def method(args):<br>pass<br>method=dec(method)|
|多个decorator|@dec_a<br>@dec_b<br>@dec_c<br>def method(args):<br>pass|<br>def method(args):<br>pass<br>method= dec_a(dec_b(dec_c(method)))|
|单个decorator,带参数|@dec(params)<br>def method(args):<br>pass|def method(args)<br>pass<br>method=dec(args)(method)|
|多个decorator|和单个decorator类似|和单个decorator类似|

## 单个decorator

下面这个例子是不带参数的一个方法

```python

def manual_decorate(fn):
    def wrapped(*args, **kw):
        print('hello hello')
        print("args:" + str(args) + ",kw:" + str(kw))
        return "<br>" + fn(*args, **kw) + "</br>"

    return wrapped

@manual_decorate
def log_message_manual(message):
    return "this is log message"+message @make_bold

print(log_message_manual("test"))
```

如果我们使用fuctools.wraps的话，可以使用如下代码：

```python
def make_bold(fn):
    @wraps(fn)
    def wrapped():
        return "<br>" + fn() + "</br>"

    return wrapped


@make_bold
def log_message():
   return "this is log message"

```

结果是：```<br>this is log message</br>```
