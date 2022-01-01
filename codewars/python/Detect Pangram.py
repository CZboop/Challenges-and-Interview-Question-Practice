import string

alphabet = set(string.ascii_lowercase)

def is_pangram(s):
    if set(s.lower())>=alphabet:
        return True
    else:
        return False