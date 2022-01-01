def split_in_parts(s, part_length): 
    new = [s[i : i+part_length] for i in range(0, len(s), part_length)]
    return " ".join(new)