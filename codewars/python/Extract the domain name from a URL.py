def domain_name(url):
    print(url)
    if "www" not in url:
        if "/" in url:
            x = url.index("/")
            y = url.index(".")
            if y>x:
                return url[(x+2):y]
            else:
                return url[:url.index(".")]
        else:
                return url[:url.index(".")]
    else:
        x = [c for c,v in enumerate(url) if v=="."]
        if len(x)>1:
            return url[(x[0]+1):x[1]]
        else:
            return url[:(x[0])]