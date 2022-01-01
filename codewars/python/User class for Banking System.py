class User(object):
    def __init__(self, name, balance, checking_account):
        self.name = name
        self.balance = balance
        self.checking_account = checking_account
    def withdraw(self, to_withdraw):
        if self.balance - to_withdraw <0:
            raise ValueError
        self.balance -= to_withdraw
        return f'{self.name} has {self.balance}.'
    def check(self, other_user, money):
        if other_user.balance - money <= 0:
            raise ValueError
        if other_user.checking_account == False:
            raise ValueError
        other_user.withdraw(money)
        self.balance += money
        return f'{self.name} has {self.balance} and {other_user.name} has {other_user.balance}.'
    def add_cash(self, money_to_add):
        self.balance += money_to_add
        return f'{self.name} has {self.balance}.'