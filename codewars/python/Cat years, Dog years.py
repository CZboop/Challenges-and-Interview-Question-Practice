def human_years_cat_years_dog_years(human_years):
    if human_years==1:
        x=15
        y=15
    elif human_years==2:
        x=15+9
        y=15+9
    else:
        x=15+9+(human_years-2)*4
        y=15+9+(human_years-2)*5
    return [human_years,x,y]