def triple_x(s=""):
    try:
        return True if s.index("x")==s.index("xxx") else False
    except:
        return False