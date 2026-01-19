# A child class inherits attributes and methods from a parent class.


'''
2️⃣ Inheriting __init__ (constructor)

If the parent has __init__, the child must call it using super().'''

class Animal:
    def __init__(self, name):
        self.name = name

class Dog(Animal):
    def __init__(self, name, breed):
        super().__init__(name)
        self.breed = breed


d = Dog("Peter", "Husky")
print(d.name , d.breed)
