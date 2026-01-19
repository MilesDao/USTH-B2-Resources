import threading
class Character:
    def __init__(self, name , level , health):
        self.__name = name
        self.__level = level
        self.__health = health

    def __str__(self):
        return (f"Name: {self.__name} \nLevel: {self.__level} \nHp: {self.__health}\n")

    def get_name(self):
        return self.__name
    def get_level(self):
        return self.__level
    def get_health(self):
        return self.__health
    
class PlayerCharacter(Character):
    def __init__(self,name , level , health, inventory):
        super().__init__(name , level , health)
        self.__inventory = inventory
    
    def __str__(self):
        return (f"Name: {self.get_name()} \nLevel: {self.get_level()} \nHp: {self.get_health()} \nInventory: {self.__inventory}\n")
    
    def save(self, filename: str):
        try: 
            with open(filename , 'w')as f:
                f.write(f"Name: {self.get_name()}\n")
                f.write(f"Level: {self.get_level()}\n")
                f.write(f"Health: {self.get_health()}\n")
                f.write(f"Inventory: {self.__inventory}\n")
        
        except Exception as e:
            print(f"Error: {e}")
    
    def save_in_background(self, filename):
        thread = threading.Thread(target = self.save, args = (filename,))
        thread.start()

c = PlayerCharacter("Stone Giant", 1, 780, ["Club", "Rock Armor", "Health Potion"])
print(c)
c.save_in_background('player.txt')
