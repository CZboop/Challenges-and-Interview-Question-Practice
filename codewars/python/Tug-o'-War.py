def tug_o_war(teams):
    print(teams)
    x = sum(teams[0])
    y = sum(teams[1])
    x_anchor = teams[0][0]
    y_anchor = teams[1][-1]
    if x==y:
        return "It's a tie!" if x_anchor==y_anchor else "Team {} wins!".format("1" if x_anchor>y_anchor else "2")
    else:
        return "Team {} wins!".format("1" if x>y else "2")