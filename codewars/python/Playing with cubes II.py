class Cube(object):
    def __init__(self,_side=0):
        self._side=_side

    def get_side(self):
        return abs(self._side)

    def set_side(self, new_side):
        self._side = new_side