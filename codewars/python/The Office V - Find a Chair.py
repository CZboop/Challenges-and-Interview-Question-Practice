def meeting(rooms, number):
    if number == 0:
        return 'Game On'
    nums = []
    for i in rooms:
        if sum(nums)<number:
            x = min(i[1]-len(i[0]), number - sum(nums))
            if x>=0:
                nums.append(x)
            else:
                nums.append(0)
    if sum(nums)<number:
        return "Not enough!"
    return nums