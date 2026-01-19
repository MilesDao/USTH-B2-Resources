
import threading
class Tank:
    def __init__(self ,i,  hp , d, a, price):
        self.__index = i
        self.__hp = hp
        self.__d = d 
        self.__a = a
        self.__price = price

    def get_index(self):
        return self.__index
    
    def get_hp(self):
        return self.__hp

    def get_damage(self):
        return self.__d

    def get_armor(self):
        return self.__a
    
    def get_price(self):
        return self.__price

    def set_hp(self, hp):
        self.__hp = hp

    def set_damage(self, d):
        self.__d = d

    def set_armor(self, a):
        self.__a = a

    def set_price(self, price):
        self.__price = price

    def compute_strength(self):
        return (self.__hp**2+ self.__d**2+ self.__a**2)**0.5
    
    def display(self):
        print(f"Index: {self.__index}\nHp: {self.__hp}\nDamage: {self.__d}\nArmor: {self.__a}\nPrice: {self.__price}\nStrength: {self.compute_strength()}")



def input_handler():
    tanks= []
    
    try:
        with open("input.txt", "r") as f:
            n = int(f.readline().strip())
            for i in range(n):
                hd, d, a, price = map(int,f.readline().split())
                tank = Tank(i + 1, hd, d, a, price)
                tanks.append(tank)

    except IOError as e:
        print(f"error: {e}")

    return tanks
    
def buy_price(tanks , budget, res_price):
    total_cost = 0 
    Res = []

    for tank in sorted(tanks, key = lambda x: x.get_price()):
        if  total_cost + tank.get_price() <= budget:
            Res.append(tank.get_index())
            total_cost += tank.get_price()
    
    res_price.extend(Res)


def buy_strength(tanks, budget , res_strength):
    total_cost = 0 
    Res = []

    for tank in sorted(tanks, key = lambda x: x.compute_strength(), reverse = True):
        if  total_cost + tank.get_price() <= budget:
            Res.append(tank.get_index())
            total_cost += tank.get_price()
    res_strength.extend(Res)


def output_hander(res_price, res_strength, filename):
    with open(filename, "w") as f:
        f.write(f"{res_price}\n")
        f.write(f"{res_strength}\n")

def main():
    tanks = input_handler()

    res_price = []
    res_strength = []

    t1 = threading.Thread(target = buy_price, args = (tanks, 75, res_price))
    t2 = threading.Thread(target = buy_strength, args = (tanks, 75, res_strength))

    t1.start()
    t2.start()

    t1.join()
    t2.join()
    
    output_hander(res_price, res_strength, "output.txt")
if __name__ == '__main__':
    main()