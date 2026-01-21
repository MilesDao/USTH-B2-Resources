import threading
class Hero:
    def __init__(self,id,  hp , atk , de, p):
        self.id = id
        self.hp = hp
        self.atk = atk
        self.de = de
        self.p = p

    def get_hp(self):
        return self.hp
    def get_atk(self):
        return self.atk
    def get_de(self):
        return self.de
    def get_p(self):
        return self.p
    
    def set_hp(self, hp):
        self.hp = hp
    def set_atk(self, atk):
        self.atk = atk
    def set_de(self, de):
        self.de = de
    def set_p(self, p):
        self.p = p
    
    def display(self):
        print(f"Hp: {self.hp}\n"
              f"Atk: {self.atk}\n"
              f"De: {self.de}\n"
              f"P: {self.p}\n")
              
    def compute_power(self):
        return (self.hp ** 2 + self.atk **2 + self.de ** 2)**0.5


def input_handler():
    heros = []

    try:
        with open("input1.txt", "r")as f:
            n = int(f.readline())
            for i in range(n):
                hp , atk, de, p = map(int , f.readline().split(" "))
                heros.append(Hero(i,hp , atk , de, p))
    except IOError as e:
        print(f"{e}")

    return heros

def sort_price(Heros, res):
    selected = []
    total_gold = 100
    gold = 0
    for hero in sorted(Heros,key =  lambda x: x.p):
        if gold + hero.p <= total_gold:
            selected.append(hero.id)
            gold += hero.p
    res.extend(selected)

def sort_power(Heros, res):
    selected = []
    total_gold = 100
    gold = 0
    for hero in sorted(Heros,key =  lambda x: x.compute_power(), reverse = True):
        if gold + hero.p <= total_gold:
            gold += hero.p
            selected.append(hero.id)
    res.extend(selected)

def output_handler(price_list, power_list):
    with open("output.txt", "w") as f:
        f.write(f"0 {price_list}\n")
        f.write(f"1 {power_list}")
    

def main():
    heros = input_handler()

    for hero in heros:
        hero.display()

    price_list = []
    power_list = []
    t1 = threading.Thread(target = sort_price, args = (heros, price_list))
    t2 = threading.Thread(target = sort_power, args = (heros, power_list))

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    output_handler(price_list,power_list)


main()