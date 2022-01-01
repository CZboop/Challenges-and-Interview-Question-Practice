def is_valid_set(quantities, shapes, colours, patterns):
    if all(i==quantities[0] for i in quantities) or len(quantities)==len(set(quantities)):
        quantities = True
    else:
        quantities = False
    if all(i==shapes[0] for i in shapes) or len(shapes)==len(set(shapes)):
        shapes = True
    else:
        shapes = False
    if all(i==colours[0] for i in colours) or len(colours)==len(set(colours)):
        colours = True
    else:
        colours = False
    if all(i==patterns[0] for i in patterns) or len(patterns)==len(set(patterns)):
        patterns = True
    else:
        patterns = False
    return quantities and shapes and colours and patterns