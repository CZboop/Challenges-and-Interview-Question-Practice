def find_needle(haystack):
    for count, value in enumerate(haystack):
        if value == "needle":
            return "found the needle at position "+ str(count)