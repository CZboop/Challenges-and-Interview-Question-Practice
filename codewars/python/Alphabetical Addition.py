def add_letters(*letters):
    if len(letters)==0:
        return "z"
    return chr((sum((ord(i)-96) for i in letters)-1)%26 +97)