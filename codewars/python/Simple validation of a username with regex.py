import re
def validate_usr(username):
    if re.fullmatch(r"[a-z0-9_]{4,16}", username):
        return True
    else:
        return False