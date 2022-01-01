def find_missing_letter(chars):
    for i in chars:
        if chars[chars.index(i)+1] != chr(ord(i)+1):
            return chr(ord(i)+1)