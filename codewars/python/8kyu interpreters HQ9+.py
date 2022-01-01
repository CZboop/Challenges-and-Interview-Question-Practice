def HQ9(code):
    if code=="H":
        return "Hello World!"
    elif code=="Q":
        return code
    elif code=="9":
        new=""
        for i in range(99,2,-1):
            new+="""{} bottles of beer on the wall, {} bottles of beer.\nTake one down and pass it around, {} bottles of beer on the wall.\n""".format(i,i,i-1)
        new+="""2 bottles of beer on the wall, 2 bottles of beer.
Take one down and pass it around, 1 bottle of beer on the wall.
1 bottle of beer on the wall, 1 bottle of beer.
Take one down and pass it around, no more bottles of beer on the wall.
No more bottles of beer on the wall, no more bottles of beer.
Go to the store and buy some more, 99 bottles of beer on the wall."""
        return new        
    else:
        return None