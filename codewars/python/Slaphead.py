def bald(s):
    x = [s.replace("/","-")]
    if "/" not in s:
        x.append("Clean!")
        return x
    elif s.count("/")==1:
        x.append("Unicorn!")
        return x
    elif s.count("/")==2:
        x.append("Homer!")
        return x
    elif 3<=s.count("/")<=5:
        x.append("Careless!")
        return x
    else:
        x.append("Hobo!")
        return x