import threading

class Mercenary:
    def __init__(self, hp, atk , de, spd, p, id):
        self.hp = hp
        self.atk = atk
        self.de = de
        self.spd = spd
        self.p = p
        self.id = id
    
    def display(self):
        print(f"{self.hp} {self.atk} {self.de} {self.spd} {self.p}")
    
    def is_fast(self):
        return self.spd >= 4

    def compute_score(self):
        return (self.hp **2 + (1.5 * self.atk)**2 + self.de**2)**0.5 + (2* self.spd)

def input_handler():
    list = []
    try:
        with open("input2.txt", "r") as f:
            n= int(f.readline())

            for i in range(n):
                hp , atk , de, spd, p = map(int , f.readline().split())
                list.append(Mercenary(hp ,atk, de, spd, p , i + 1))

    except IOError as e:
        print(f"{e}")
    return list

def sort_price(mercenaries, res):
    selected = []
    gold = 0
    total = 120

    fast_hero = [mer for mer in mercenaries if mer.is_fast() == True]


    fast = sorted(fast_hero, key = lambda x: x.p)

    selected.append(fast[0].id)
    gold += fast[0].p

    for mer in sorted(mercenaries, key = lambda x: x.p):
        if mer.id in selected:
            continue

        if gold + mer.p <= total:
            selected.append(mer.id)
            gold += mer.p

    res.extend(selected)

def sort_score(mercenaries, res):
    selected = []
    gold= 0
    total = 120

    for mer in sorted(mercenaries, key = lambda x: x.compute_score(), reverse = True):
        if(len(selected) <4 and gold + mer.p <= total):
            selected.append(mer.id)
            gold += mer.p
    res.extend(selected)

def sort_banlance(mercenaries, res):
    gold = 0
    total = 120
    selected = []

    fast_sort = [h for h in mercenaries if h.is_fast() == True]
    fast = sorted(fast_sort, key= lambda x: x.compute_score()/x.p, reverse = True)
    selected.append(fast[0].id)
    gold += fast[0].p

    tank_sort = [h for h in mercenaries if h.de >=5]
    tank = sorted( tank_sort, key= lambda x: x.compute_score()/x.p, reverse = True)
    if tank[0].id not in selected and gold + tank[0].p <= total:
        selected.append(tank[0].id)
        gold += tank[0].p

    for h in sorted( mercenaries, key= lambda x: x.compute_score()/x.p, reverse = True):
        if h.id in selected:
            continue
        if gold+ h.p <= total:
            selected.append(h.id)
            gold += h.p

    res.extend(selected)

def output_handler(res1, res2, res3):
    with open("output.txt", "w")as f:
        f.write(f"{res1}\n")
        f.write(f"{res2}\n")
        f.write(f"{res3}\n")

def main():
    mercenaries = input_handler()
    for mer in mercenaries:
        mer.display()

    price_sort = []
    score_sort = []
    balance_sort = []
    t1 = threading.Thread(target = sort_price, args = (mercenaries, price_sort, ))
    t2 = threading.Thread(target = sort_score, args = (mercenaries, score_sort, ))
    t3 = threading.Thread(target = sort_banlance, args = (mercenaries, balance_sort, ))
    t1.start()
    t2.start()
    t3.start()
    t1.join()
    t2.join()
    t3.join()

    print(price_sort)
    print(score_sort)
    print(balance_sort)

    output_handler(price_sort, score_sort, balance_sort)

main()