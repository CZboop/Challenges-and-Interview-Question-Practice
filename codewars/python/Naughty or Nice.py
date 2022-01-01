def get_nice_names(people):
    return [i.get("name") for i in people if i.get("was_nice")==True]

def get_naughty_names(people):
    return [i.get("name") for i in people if i.get("was_nice")==False]