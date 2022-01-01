def delete_nth(order,max_e):
    order.reverse()
    for i in order:
        if order.count(i)>max_e:
            for j in range(order.count(i)-max_e):
                order.remove(i)
    order.reverse()
    return order