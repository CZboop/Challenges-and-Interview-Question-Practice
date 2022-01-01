def growing_plant(upSpeed, downSpeed, desiredHeight):
    day = 1
    height = upSpeed
    while height<desiredHeight:
        height+=upSpeed
        day+=1
        height-=downSpeed
    return day