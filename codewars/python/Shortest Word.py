def find_short(s):
    lst = s.split(" ")
    return len(min(lst, key=len))