import enum
from engine import Engine
from gearbox import GearBox
from wheel import Wheel

class CarType(enum.Enum):
    sedan = "SEDAN"
    wagon = "WAGON"

engine = Engine(100, 8000, 7000, 6200, 180, False)
gearbox = GearBox(6, "manual")

wheelList = [
    Wheel(20, "summer", 2.6, 100),
    Wheel(20, "summer", 2.6, 100),
    Wheel(20, "summer", 2.6, 100),
    Wheel(20, "summer", 2.6, 100)
]

class Car:

    def __init__(self, actualCarType):
        self.actualCarType = actualCarType

    def Car(self, actualCarType):
        self.actualCarType = actualCarType
    
    def getActualCarType(self):
        return self.actualCarType

    def setActualCarType(self, actualCarType):
        if actualCarType == "sedan":
            self.actualCarType = CarType.sedan
        elif actualCarType == "wagon":
            self.actualCarType = CarType.wagon
    
    def start(self):
        engine.start()
    
    def go(self):
        if engine.isRunning():
            self.moving = True
            for i in wheelList:
                i.setTyreCondition(i.getTyreCondition()-1)
            print("WROOOM!")
        else:
            print("Engine isn't running.")

    def stop(self):
        if self.moving:
            self.moving = False
            for i in wheelList:
                i.setTyreCondition(i.getTyreCondition()-1)
            print("*tires screeching")
        else:
            print("Car already stopped.")

    def kill(self):
        engine.kill()

    def info(self):
        print("=============================")

        print("Car:")
        print("Car type: " + self.getActualCarType())

        print("=============================")

        print("Engine:")
        print("Peak effect: " + str(engine.getPeakEffect()) + "P")
        print("Max rpm: " + str(engine.getMaxRpm()))
        print("Peak effect rpm: " + str(engine.getPeakEffectRpm()))
        print("Peak torque rpm: " + str(engine.getPeakEffect()))
        print("Peak torque: " + str(engine.getPeakTorque()) + "Nm")
        print("Running: " + str(engine.isRunning()))

        print("=============================")

        print("Gearbox:")
        print("Number of gears: " + str(gearbox.getNumberOfGears()))
        print("Type of gearbox: " + str(gearbox.getActualGearBoxType()))

        print("=============================")
        
        wheelIndex = 1
        
        for w in wheelList:
            print("Wheel "+ str(wheelIndex) +":")
            print("Tyre type: " + str(w.getTyreType()))
            print("Tyre Conditions: " + str(w.getTyreCondition())+"%")
            print("Tyre Pressure: " + str(w.getTyrePressure())+"p")
            print("Rimsize: "+ str(w.getRimSize()) + " inches")
            print("-------------------------")
            wheelIndex += 1