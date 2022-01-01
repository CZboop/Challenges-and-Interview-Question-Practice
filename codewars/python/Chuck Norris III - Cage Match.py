def head_smash(arr):
    try:
        return [i.replace("O"," ") for i in arr] if len(arr)>0 else "Gym is empty"
    except:
        return "This isn\'t the gym!!"