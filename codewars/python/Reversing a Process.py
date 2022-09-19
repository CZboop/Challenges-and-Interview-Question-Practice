import string

def decode(r):
    letter_start_ind = r.find(list(filter(str.isalpha, r))[0])
    
    encoded_num = int(r[:letter_start_ind])
    encoded_str = r[letter_start_ind:]
    
    # maths...
    if pow(encoded_num, 24, 26) != 1:
        return 'Impossible to decode'
    
    decoded_str = ''
    for i in encoded_str:
        alpha_loc = string.ascii_lowercase.index(i)
        letter_code = int(encoded_num % 26 - alpha_loc)
        for n in range(26):
            if n * encoded_num % 26 == alpha_loc:
                decoded_str += string.ascii_lowercase[n]
                break

    return decoded_str if len(decoded_str) == len(encoded_str) else 'Impossible to decode'