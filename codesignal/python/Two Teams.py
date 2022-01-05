def solution(students):
    return sum(i for i in students[::2]) - sum(i for i in students[1::2])
