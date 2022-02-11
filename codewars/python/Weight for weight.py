def order_weight(strng):
    strng = sorted(strng.split(" "), key=lambda x: str(x))
    strng = sorted(strng, key=lambda x: sum([int(i) for i in x]))

    return " ".join(strng)