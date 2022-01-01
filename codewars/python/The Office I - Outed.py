def outed(meet, boss):
    return  "Get Out Now!" if (sum(meet.values())+meet.get(boss))/len(meet)<=5 else "Nice Work Champ!"