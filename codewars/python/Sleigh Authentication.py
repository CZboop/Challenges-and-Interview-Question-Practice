class Sleigh(object):
    def authenticate(self, name, password):
        self.name=name
        self.password=password
        return (name,password) == ("Santa Claus","Ho Ho Ho!")