def number(bus_stops):
    on = []
    off = []
    for tuple in bus_stops:
        on.append(tuple[0])
    for tuple in bus_stops:
        off.append(tuple[1])
    return sum(on) - sum(off)