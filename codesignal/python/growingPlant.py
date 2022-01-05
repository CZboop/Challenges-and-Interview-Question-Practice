def solution(upSpeed, downSpeed, desiredHeight):
    count = 0
    height = 0
    while height < desiredHeight:
        height += upSpeed
        count += 1
        if height >= desiredHeight:
            return count 
        height -= downSpeed
