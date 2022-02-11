def calculate_years(principal, interest, tax, desired):
    pricipal = principal
    count = 0
    while principal < desired:
        year_interest = principal *  interest
        principal += year_interest
        year_tax = year_interest * tax
        principal -= year_tax
        count+=1
    else:
        return count