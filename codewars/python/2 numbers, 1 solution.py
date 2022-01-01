def get_op(num1, num2, target):
    if num1-num2==target or num2-num1==target:
        return "subtract"
    elif num1*num2==target:
        return "multiply"
    elif num1/num2==target or num2/num1==target:
        return "divide"
    elif num1+num2==target:
        return "add"