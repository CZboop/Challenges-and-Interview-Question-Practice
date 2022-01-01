def any_arrows(arrows):
    for i in arrows:
        if i.get('damaged') ==False:
            return True
        if 'damaged' not in i:
            return True
    return False