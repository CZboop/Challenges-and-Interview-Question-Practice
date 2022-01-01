class Person():
    def __init__(self,name):
        self.name = name
    def greet(self,greetee):
        return "Hello {}, my name is {}".format(greetee, self.name)