def sabb(s, val, happiness):
    sab_count = sum(s.count(i) for i in "sabticl")
    number = val+happiness+sab_count
    if number>22:
        return 'Sabbatical! Boom!'
    else:
        return 'Back to your desk, boy.'