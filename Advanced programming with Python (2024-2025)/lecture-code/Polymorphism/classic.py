'''
Polymorphism in Python means different objects respond to the same action in their own way. Same interface, different behavior. Python loves this. Java cries a little.
'''
# Same method name → different behavior → polymorphism.
class Animal:
    def speak(self):
        pass
class Dog(Animal):
    def speak(self):
        print("woof woof")
class Cat(Animal):
    def speak(self):
        print("Mew Mew")

animal = [Dog(), Cat()]
for a in animal:
    a.speak()