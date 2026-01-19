class Employee:
    def __init__(self):
        self.__salary = 0

    def _get_salary(self):
        return self.__salary
    
    def set_salary(self, salary):
        self.__salary = salary

    def work(self):
        if self.__salary == 0:
            print("I should be paid more")
        else:
            print("I'm rich now litte bitch")

e = Employee()
e.set_salary(1000)
e.work()
print(e._get_salary())
