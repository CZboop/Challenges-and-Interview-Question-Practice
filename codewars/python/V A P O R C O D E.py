def vaporcode(s):
    s = "".join(s.split(" "))
    return "  ".join([i for i in s.upper()])