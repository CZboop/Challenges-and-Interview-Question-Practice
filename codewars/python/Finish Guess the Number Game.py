class Guesser:
    def __init__(self, number, lives):
        self.number = number
        self.lives = lives
    def guess(self,n):
        self.n = n
        if self.lives>0:
            if self.n!=self.number:
                self.lives-=1
                return self.n== self.number
            else:
                return self.n== self.number
        else:
            return Error