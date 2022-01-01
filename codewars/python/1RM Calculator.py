def calculate_1RM(w, r):
    if r==0:
        return 0
    if r==1:
        return w
    else:
        values = []
        values.append(w*(1+(r/30)))
        values.append((100*w)/(101.3-2.67123*r))
        values.append(w*r**0.10)
        return round(max(values))