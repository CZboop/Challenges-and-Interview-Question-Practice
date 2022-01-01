def autocomplete(input_, dictionary):
    input_ = "".join([i for i in input_ if i.isalpha()==True])
    x = [i for i in dictionary if i[:len(input_)].lower()==input_.lower()]
    return x[:5]