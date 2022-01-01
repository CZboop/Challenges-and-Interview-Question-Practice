def task(w,n,c):
    peeps = {"Monday":"James","Tuesday":"John","Wednesday":"Robert","Thursday":"Michael","Friday":"William"}
    return "It is {} today, {}, you have to work, you must spray {} trees and you need {} dollars to buy liquid".format(w,peeps.get(w),n,n*c)