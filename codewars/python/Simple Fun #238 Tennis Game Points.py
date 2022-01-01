def tennis_game_points(score): 
    x = score.split('-')
    count = 0
    if 'all' in x:
        for i in x:
            if i=='15':
                count+=2
            if i=='30':
                count+=4
            if i=='40':
                count+=6
    else:
        for i in x:
            if i=='15':
                count+=1
            if i=='30':
                count+=2
            if i=='40':
                count+=3
    return count