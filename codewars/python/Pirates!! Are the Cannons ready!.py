def cannons_ready(gunners):
    return "Fire!" if all(value=="aye" for value in gunners.values()) else "Shiver me timbers!"