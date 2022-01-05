def solution(number, width):
    if len(str(number))==width:
        return str(number)
    else:
        if len(str(number))<width:
            return "{}{}".format( "0" * (width - len(str(number))), str(number))
        else:
            return str(number)[-width:]
