def wave(p):
    return [p[:i] + p[i].upper() + p[i+1:] for i in range(len(p)) if p[i].isalpha()]