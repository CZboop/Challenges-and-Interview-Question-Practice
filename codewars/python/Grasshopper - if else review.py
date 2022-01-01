def main(input_str):
    if input_str=="forward":
        return forward()
    if input_str=="backward":
        return backward()
    else:
        return "Not a valid input."