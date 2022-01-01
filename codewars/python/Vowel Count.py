def get_count(input_str):
    num_vowels = 0
    v_l = ["a","e","i","o","u"]
    for i in input_str:
        if i in v_l:
            num_vowels +=1
    return num_vowels