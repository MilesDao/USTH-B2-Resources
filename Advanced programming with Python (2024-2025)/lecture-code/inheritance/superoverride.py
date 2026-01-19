class Animal:
    def speak(self):
        print("Animal sound")
    
class Cat(Animal):
    def speak(self):
        super().speak()
        print("Meow Meow")

c = Cat()
c.speak()

