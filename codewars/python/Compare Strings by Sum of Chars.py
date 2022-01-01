def compare(s1,s2):
    if None== s1 or None==s2 or s1=="" or s2=="":
        return True
    if all(i.isalpha() for i in s1) and all(i.isalpha() for i in s2):
        return sum(ord(i.upper()) for i in s1)==sum(ord(j.upper()) for j in s2)
    elif all(i.isalpha() for i in s1) or all(i.isalpha() for i in s2):
        return False
    else:
        return True