def order_food(lst): 
    vegan = 0
    vegetarian = 0
    standard = 0
    gluten_intolerant = 0
    diabetic = 0
    for i in lst:
        if i.get("meal")=="vegan":
            vegan+=1
        elif i.get("meal")=="vegetarian":
            vegetarian+=1
        elif i.get("meal")=="standard":
            standard+=1
        elif i.get("meal")=="gluten-intolerant":
            gluten_intolerant+=1
        elif i.get("meal")=="diabetic":
            diabetic+=1
    d = {"vegetarian":vegetarian, "standard": standard, "vegan": vegan, "gluten-intolerant":gluten_intolerant, "diabetic":diabetic}
    return {k:v for (k,v) in d.items() if v!=0}