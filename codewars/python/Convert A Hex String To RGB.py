import struct
def hex_string_to_RGB(hex_string): 
    x = hex_string[1:]
    x = struct.unpack("BBB",bytes.fromhex(x))
    d = {}
    d["r"] = x[0]
    d["g"] = x[1]
    d["b"] = x[2]
    return d