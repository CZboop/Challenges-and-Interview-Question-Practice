def alphanumeric(password):
    return all(i.isalnum()==True for i in password) if password else False