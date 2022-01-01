def validate(input_):
    if input_.count("@")!=1 or input_[0].isalpha()!=True or input_.count(".")<1:
        return False
    else:
        x = input_.split("@")
        start=x[0]
        if any(i.isalnum()!=True and i!="_" for i in start):
            return False
        end=x[1].split(".")
        if len(end[0])<1:
            return False
        if any(i.isalnum()!=True and i not in"_-" for i in end[0]):
            return False
        if input_[-1].isalnum()!=True and input_[-1] not in "_-":
            return False
        else:
            return True