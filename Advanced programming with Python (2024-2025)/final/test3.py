import threading

class Hero:
    def __init__(self, id,hp, atk , de, spd, p):
        self.id = id
        self.hp = hp
        self.atk = atk
        self.de = de
        self.spd = spd
        self.p = p
        
    
    def display(self):
        print(f"{self.hp} {self.atk} {self.de} {self.spd} {self.p}")
    
    def is_fast(self):
        return self.spd >= 4

    def is_tank(self):
        return self.de >= 5
    
    def compute_score(self):
        return (self.hp **2 + (1.5 * self.atk)**2 + self.de**2)**0.5 + (2* self.spd)

def input_handler():
    list = []
    try:
        with open("input2.txt", "r") as f:
            n= int(f.readline())

            for i in range(n):
                hp , atk , de, spd, p = map(int , f.readline().split())
                list.append(Hero(i,hp ,atk, de, spd, p))

    except IOError as e:
        print(f"{e}")
    return list

def sort_cost(Hero, res):
    total = 150 
    cost = 0
    selected = []

    fast_id = [h for h in Hero if h.is_fast()]
    fast = sorted(fast_id, key = lambda x: x.p)
    selected.append(fast[0].id)

    tank_id = [h for h in Hero if h.is_tank()]
    tank = sorted(tank_id, key = lambda x: x.p)
    if tank[0].id not in selected and gold + tank[0].p <= total:
        selected.append(tank[0].id)
        gold += tank[0].p

    for h in sorted( Hero, key= lambda x: x.compute_score()/x.p, reverse = True):
        if h.id in selected:
            continue
        if gold+ h.p <= total:
            selected.append(h.id)
            gold += h.p

    res.extend(selected)

