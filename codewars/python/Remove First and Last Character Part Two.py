def array(s):
    s = [i for i in s.split(",")]
    try:
        x=s[1:-1]
        return " ".join(x) if x else None
    except:
        return None