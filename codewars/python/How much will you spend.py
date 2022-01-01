def get_total(costs, items, tax):
    spend = 0
    for i in items:
        spend += costs.get(i,0)
    return round(spend*(1 + tax), 2)