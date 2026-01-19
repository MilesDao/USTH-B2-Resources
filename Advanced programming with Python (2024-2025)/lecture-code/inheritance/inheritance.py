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
    """
    Object comparison: __lt__ method
    • Compares current object with another instance
    • Return True if less than2
    the other instance"""
    def __lt__(self, other):
        #less than
        return self.age < other.age
    """
    Object’s string representation: __str__ method
• Defines how an object will be stringified
• Mostly when using with print()
    """
    def __str__(self):
        return (f"My name if {self.name}. I'm {self.age} years old")
class Employee:
    def work(self):
        print("I shoule be paid")

class President(Person, Employee):
    def set_term(self , term):
        self.term = term
        
def main():
    macron = Person("Emmanuel Macron", 43)
    macron.describe()

    print(macron)

    biden = Person("Joe Biden", 78)
    print(f"Macron is younger: {macron < biden}")

    print(60 * "=")

    macron = President("Emmanuel Macron", 43)
    macron.set_term(25)
    macron.describe()
    macron.work()
    print(isinstance(macron, Person))
    print(issubclass(Person, President))

if __name__ == '__main__':
    main()