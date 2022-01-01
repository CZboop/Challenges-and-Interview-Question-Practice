def plane_seat(a):
    letter = a[-1]
    num_ = int(a[:-1])
    if letter not in "ABCDEFGHK":
        return "No Seat!!"
    if 60<num_:
        return "No Seat!!"
    else:
        if 1<=num_<=20:
            section = "Front"
        elif 21<=num_<=40:
            section = "Middle"
        elif 60>=num_>40:
            section = "Back"
        if letter in "ABC":
            side = "Left"
        elif letter in "DEF":
            side = "Middle"
        elif letter in "GHK":
            side = "Right"
        return section+"-"+side