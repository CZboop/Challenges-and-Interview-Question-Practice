def solution(inputString):
    st = []
    for i in range(len(inputString)):
        if (inputString[i] == '('):
            st.append(i)
            
        elif (inputString[i] == ')'):
            temp = inputString[st[-1]:i + 1]
            inputString = inputString[:st[-1]] + temp[::-1] + \
                   inputString[i + 1:]
            del st[-1]

    res = ""
    for i in range(len(inputString)):
        if (inputString[i] != ')' and inputString[i] != '('):
            res += (inputString[i])

    return res
        
