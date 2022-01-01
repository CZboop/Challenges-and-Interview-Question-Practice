def expression_out(exp):
    d= {"1":"One","2":"Two","3":"Three","4":"Four","5":"Five", "6":"Six","7":"Seven","8":"Eight",
        "9":"Nine","10":"Ten", '+':'Plus','-':   'Minus', '*':'Times','/':   'Divided By',  
        '**':  'To The Power Of', '=':   'Equals','!=':  'Does Not Equal'}
    x = ""
    y = exp.split(" ")
    if y[1] not in "+-**!=/":
        return "That's not an operator!"
    for i in exp.split(" "):
        x+=d.get(i, "That's not an operator!")+" "
    return "That's not an operator!" if "That's" in x else x.strip()