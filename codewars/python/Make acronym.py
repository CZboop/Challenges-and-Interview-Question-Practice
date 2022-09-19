def to_acronym(inp):
    return "".join([word[0] for word in inp.split(" ")]).upper()