import re
def solution(s):
    new=  re.sub( r"([A-Z])", r" \1", s).split()
    new = " ".join(new)
    return new