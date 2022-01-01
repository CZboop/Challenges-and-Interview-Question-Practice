def cookie(x):
    return "Who ate the last cookie? It was %s!" % {str:"Zach",int:"Monica",float:"Monica"}.get(type(x), "the dog")