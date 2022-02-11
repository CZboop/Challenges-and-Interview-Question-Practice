def solution(s,markers):
    s = s.split("\n")
    new = []
    for i in s:
        for j in markers:
            i = i.split(j)[0]
        new.append(i.strip())
    return "\n".join(new)