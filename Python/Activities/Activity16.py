
#Activity 16
#Create a car class with the following details:
#Properties: manufacturer, model, make, transmission, color
#Methods: accelerate(), stop()
#accelerate() should print "{Manufacturer} {Model} is moving"
#stop() should print "{Manufacturer} {Model} has stopped"
#Using this car class, create 3 different car objects.

class Car:

    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer = manufacturer
        self.model = model
        self.make = make
        self.transmission = transmission
        self.color = color

    def accelerate(self,manufacturer,model):
        print("car ",manufacturer,", ",model , " is moving")
    def stop(self,manufacturer,model):
        print("car ",manufacturer,", ",model , " has stopped")

print("Execution of Classes with Properties and Methods in python")

car1 = Car('Honda','i20',2010,'manual','red')
car2 = Car('Suzuki','Swift',2020,'automatic','white')
car3 = Car('Maruthi','800',2000,'manual','Blue')
car1.accelerate('toyoto','new version')
car2.stop('toyoto','old version')
