def help_jesse(arr):
    instr = []
    for i in arr:
        if hasattr(i,"note"):
            note = " ("+i.note+")"
        else:
            note = ""
        instr.append("Pour {} mL of {} into a {}{}".format(i.amount, i.solution,
                                                          i.instrument, note))
    return instr