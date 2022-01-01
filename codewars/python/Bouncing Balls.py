def bouncing_ball(h, bounce, window):
    count = 0
    if h<0 or bounce>=1 or bounce<0 or window>h:
        return -1
    else:
        for i in range(100):
            if h>window:
                count+=2
                h=h*bounce
            else:
                break
        return count-1