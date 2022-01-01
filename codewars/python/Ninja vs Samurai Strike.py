class Warrior:
    def __init__(self,name,health=100):
        self.name=name
        self.health=health
        
    def strike(self,enemy,swings):
        #health cannot go below zero
        enemy.health=max([0,enemy.health-(swings*10)])