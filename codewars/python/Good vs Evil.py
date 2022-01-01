def goodVsEvil(good, evil):
    good = [int(i) for i in good.split(" ")]
    evil = [int(i) for i in evil.split(" ")]
    g_worth = [1,2,3,3,4,10]
    e_worth = [1,2,2,2,3,5,10]
    g = sum([a*b for a,b in zip(good,g_worth)])
    e = sum([a*b for a,b in zip(evil,e_worth)])
    if g==e:
        return "Battle Result: No victor on this battle field"
    elif g>e:
        return 'Battle Result: Good triumphs over Evil'
    else:
        return 'Battle Result: Evil eradicates all trace of Good'