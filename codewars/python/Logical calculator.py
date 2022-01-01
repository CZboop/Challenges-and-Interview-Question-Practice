def logical_calc(array, op):
    val = array[0]
    for i in array[1:]:
        if op=="AND":
            val = val and i
        if op=="OR":
            val = val or i
        if op=="XOR":
            val = val != i
    return val