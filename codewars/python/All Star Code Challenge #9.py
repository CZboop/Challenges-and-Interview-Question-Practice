def bite(thing):
    print(thing)
    try:
        if thing.get("race")=="human":
            thing["race"]= "zombie"
    except:
        pass
    return thing