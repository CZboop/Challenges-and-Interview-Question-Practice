def how_much_i_love_you(nb_petals):
    if nb_petals % 6==0:
        return "not at all"
    elif nb_petals % 6==1:
        return "I love you"
    elif nb_petals % 6==2:
        return "a little"
    elif nb_petals % 6==3:
        return "a lot"
    elif nb_petals % 6==4:
        return "passionately"
    if nb_petals % 6==5:
        return "madly"