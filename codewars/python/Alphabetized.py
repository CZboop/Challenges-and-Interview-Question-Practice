def alphabetized(s):
    s = [i for i in s if i.isalpha()==True]
    s = sorted(s, key=str.casefold)
    return "".join(s)