def solution(bestStudents, scholarships, allStudents):
    return all([i in scholarships for i in bestStudents]) and all([i in allStudents for i in scholarships]) and any([i not in scholarships for i in allStudents])
