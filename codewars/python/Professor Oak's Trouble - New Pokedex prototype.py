class PokeScan:
    def __init__(self,name,level,pkmntype):
        self.name = name
        self.level = level
        self.pkmntype = pkmntype
    def info(self):
        if self.level <=20:
            strength = "weak"
        elif self.level<=50:
            strength = "fair"
        elif self.level>50:
            strength = "strong"
        if self.pkmntype=="water":
            type = "wet"
        elif self.pkmntype=="fire":
            type = "fiery"
        elif self.pkmntype=="grass":
            type = "grassy"
        return "{}, a {} and {} Pokemon.".format(self.name,type, strength)