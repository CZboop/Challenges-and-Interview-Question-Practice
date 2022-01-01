def fly_by(lamps, drone):
    if len(lamps)>len(drone):
        return "{}{}".format("o"*len(drone), "x"*(len(lamps)-len(drone)))
    else:
        return "{}".format("o"*len(lamps))