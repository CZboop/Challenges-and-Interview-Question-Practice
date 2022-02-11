def validBraces(s):
    bracket_pairs = {"(": ")", "[": "]", "{": "}"}
    opens = ""
    for i in s:
        if i in bracket_pairs.keys():
            opens += i
        elif i in bracket_pairs.values():
            if len(opens) >0:
                if bracket_pairs.get(opens[-1]) == i:
                    opens = opens[:-1]
            else:
                return False
    return len(opens) == 0