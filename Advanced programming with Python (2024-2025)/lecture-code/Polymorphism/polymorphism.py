# • name: public
# • _name: protected
# • __name: private

class Person:
    def __init__(self, n, a):
        self.name = n
        self.age = a
    def describe(self):
        print(f"Name: {self.name}")
        print(f"Age: {self.age}")

class Employee:
    def work(self):
        print("I shoule be paid")

class President(Person, Employee):
    def set_term(self , term):
        self.term = term

    def describe(self):
        super().describe()
        print(f"Term: {self.term}")
    
    def work(self):
        print("I make money")

        
def main():
    macron = President("Emmanuel Macron", 43)
    macron.set_term(25)
    macron.describe()
    macron.work()
    print(isinstance(macron, Person))
    print(issubclass(Person, President))

if __name__ == '__main__':
    main()