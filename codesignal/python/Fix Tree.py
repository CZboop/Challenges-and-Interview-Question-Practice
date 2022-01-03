def solution(tree):
    return ['{}{}{}'.format(" "*((len(i)-len(i.strip()))//2), i.strip()," "*((len(i)-len(i.strip()))//2)) for i in tree]
