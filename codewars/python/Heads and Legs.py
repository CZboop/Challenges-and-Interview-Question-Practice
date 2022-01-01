def animals(heads, legs):
    if heads>=0 and legs>=0:
        cow = legs/2-heads
        ch= heads-cow
        if ch>=0 and cow>=0:
            if ch-int(ch)==0 and cow-int(cow)==0:
                return (ch,cow)            
    return "No solutions"