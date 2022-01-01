def plant(seed, water, fert, temp):
    if 20<=temp<=30:
        cluster = "{}".format(seed*fert)
        stem = "{}".format(water*"-")
        plant =  "{}".format((stem+cluster)*water)
        return plant
    else:
        stem = "{}".format(water*"-")
        plant =  "{}{}".format(stem*water,seed)
        return plant