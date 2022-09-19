def like_or_dislike(lst):
    if not lst:
        return 'Nothing'
    if len(lst) >= 2:
        current = 'Nothing'
        for i in lst:
            if i != current:
                current = i
            else:
                current = 'Nothing'
        return current
    else:
        return lst[0]