def part(arr):
    targets = ["Partridge","PearTree","Chat","Dan","Toblerone","Lynn","AlphaPapa","Nomad"]
    count = 0
    for i in arr:
        if i in targets:
            count+=1
    return "Mine's a Pint{}".format("!"*count) if count!= 0 else "Lynn, I've pierced my foot on a spike!!"