def validate_hello(greetings):
    x = ["hello", "ciao", "salut", "hallo", "hola", "ahoj", "czesc"]
    return True if any(i in greetings.lower() for i in x) else False