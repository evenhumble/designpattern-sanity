__author__ = 'patrick'


class BorgParent:
    _share_state = {}

    def __init__(self):
        self.__dict__ = self._share_state
        self.state = 'Start'

    def __str__(self):
        return self.state


class YoungBorg(BorgParent):
    pass


if __name__ == '__main__':
    rm1 = BorgParent()
    rm2 = BorgParent()
    print(rm1.__dict__)
    rm1.state = 'Idle'
    rm2.state = 'Running'

    print('rm1: {0}'.format(rm1))
    print('rm2: {0}'.format(rm2))

    rm2.state = 'Zombie'

    print('rm1: {0}'.format(rm1))
    print('rm2: {0}'.format(rm2))

    print('rm1 id: {0}'.format(id(rm1)))
    print('rm2 id: {0}'.format(id(rm2)))

    rm3 = YoungBorg()
    rm4= YoungBorg()

    print('rm1: {0}'.format(rm1))
    print('rm2: {0}'.format(rm2))
    print('rm3: {0}'.format(rm3))
    print('rm4: {0}'.format(rm3))
