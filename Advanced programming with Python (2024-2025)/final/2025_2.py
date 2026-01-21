import threading
class Tank:
    def __init__(self,id ,  hp , d, a, p):
        self.id = id
        self.hp = hp
        self.d = d
        self.a = a
        self.p = p

    def get_hp(self):
        return self.hp
    def get_a(self):
        return self.a
    def get_d(self):
        return self.d
    def get_p(self):
        return self.p
    
    def set_hp(self, hp):
        self.hp = hp
    def set_a(self, a):
        self.a = a
    def set_d(self, d):
        self.d = d
    def set_p(self, p):
        self.p = p
    
    def display(self):
        print(f"hp = {self.hp} "
              f"damage = {self.d} "
              f"armer = {self.a} "
              f"price = {self.p} ")
    
    def compute_cost(self):
        return (self.a+self.d)/self.hp

def input_handler():
    tanks = []
    try:
        with open("input.csv", "r") as f:
            n = int(f.readline())
            for i in range(n):
                hp , d, a, p = map(int , f.readline().split('&'))
                tanks.append(Tank(i+1, hp, d ,a, p))

    except IOError as e:
        print(f"Error {e}")
    
    return tanks

def sort_hp(tanks, res ):
    select = []
    total_money = 105
    money = 0

    for tank in sorted(tanks, key = lambda x: x.hp):
        if money + tank.p <= total_money:
            select.append(tank.id)
            money += tank.p
        
    res.extend(select)
    

def sort_cost(tanks, res ):
    select1 = []
    total_money = 105
    money = 0

    for tank in sorted(tanks, key = lambda x: x.compute_cost(), reverse = True):

        if money + tank.p <= total_money:
            select1.append(tank.id)
            money += tank.p
        
    res.extend(select1)

def output_handler(task_res, cost_res):
    with open("output.txt", "w")as f:
        f.write(f"{task_res}\n")
        f.write(f"{cost_res}\n")

def main():
    tanks = input_handler()
    for tank in tanks:
        tank.display()

    task_res = []
    cost_res = []
    t1 = threading.Thread(target = sort_hp, args = (tanks, task_res))
    t2 = threading.Thread(target = sort_cost, args = (tanks, cost_res))

    t1.start()
    t2.start()

    t1.join()
    t2.join()

    output_handler(task_res, cost_res)

if __name__ == '__main__':
    main()