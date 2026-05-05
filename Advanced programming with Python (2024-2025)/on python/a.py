from threading import *
class Tank:
    def __init__(self, id , hp,d,a,p):
        self.id = id
        self.__hp = hp
        self.__d = d
        self.__a = a
        self.__p = p

    def get_hp(self):
        return self.__hp
    def get_d(self):
        return self.__d
    def get_a(self):
        return self.__a
    def get_p(self):
        return self.__p
    
    def set_hp(self, hp):
        self.__hp = hp
    def set_d(self, d):
        self.__d = d
    def set_a(self, a):
        self.__a = a
    def set_p(self, p):
        self.__p = p

    def display(self):
        print(f"{self.__hp}\n"
              f"{self.__d}\n"
              f"{self.__a}\n"
              f"{self.__p}\n"
              )

    def compute_cost(self):
        return (self.__a + self.__d)/self.__hp

def input_handler(filename):
    tanks = []
    try:
        with open(filename, "r") as f:
            n = int(f.readline())
            for i in range(n):
                hp , d, a, p = map(int, f.readline().split("&"))
                tanks.append(Tank(i + 1, hp ,d , a, p))

    except IOError as e:
        print(e)
    return tanks

def sort_hp(Tank, res):
    total_money = 105
    money = 0
    a = []
    for tank in sorted(Tank, key = lambda x: x.get_hp()):
        if(money+ tank.get_p()<= total_money):
            a.append(tank.id)
            money += tank.get_p()
    
    res.extend(a)
    
def sort_cost(Tank, res):
    total_money = 105
    money = 0
    a = []
    for tank in sorted(Tank, key = lambda x: x.compute_cost(), reverse= True):
        if(money+ tank.get_p()<= total_money):
            a.append(tank.id)
            money += tank.get_p()
    
    res.extend(a)

def output_handler(filename, res1, res2):
    with open(filename, "w") as f:
        f.write(f"{res1}\n")
        f.write(f"{res2}")

def main():
    tanks = input_handler("input.csv")
    for tank in tanks:
        tank.display()

    res1 = []
    res2 = []
    t1 = Thread( target= sort_hp, args = (tanks, res1))
    t2 = Thread( target= sort_cost, args = (tanks, res2))

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    output_handler("output.txt", res1, res2)

if __name__ == '__main__':
    main()