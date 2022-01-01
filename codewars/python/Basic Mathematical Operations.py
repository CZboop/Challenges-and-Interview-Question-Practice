import operator
ops = {"+": operator.add,"-":operator.sub, "*":operator.mul, "/":operator.truediv}
def basic_op(operator, value1, value2):
    return ops[operator] (value1,value2)