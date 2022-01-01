def is_palindrome(s):
    if s is None:
        return False
    s = "".join([i.lower() for i in s if i.isalnum()])
    return s==s[::-1]