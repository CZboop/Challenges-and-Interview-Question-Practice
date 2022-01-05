def solution(name):
    return all(i.isalnum() or i=="_" for i in name) and name[0].isalpha() or name[0]=="_"
