def last_index_of(head, search_val):
    index_found = 0
    index = 0
    found = False
    
    if head == None:
        return -1
    as_list = [head.data]

    while hasattr(head, "next"):
        head = head.next
        try:
            as_list.append(head.data)
        except:
            break
            
    try:
        return max(c for c, v in enumerate(as_list) if v == search_val)
    except:
        return -1