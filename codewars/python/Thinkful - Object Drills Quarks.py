class Quark(object):
    def __init__(self, color, flavor):
        self.color = color
        self.flavor = flavor
        self.baryon_number = 1/3
        
    def interact(self, other_quark):
        if isinstance(other_quark, Quark):
            original_color = self.color
            self.color = other_quark.color
            other_quark.color = original_color