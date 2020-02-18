import enum

class WheelType(enum.Enum):
    winter = "WINTER"
    summer = "SUMMER"

class Wheel:

    def __init__(self, rimSize, tyreType, tyrePressure, tyreCondition):
        self.rimSize = rimSize
        self.tyreType = tyreType
        self.tyrePressure = tyrePressure
        self.tyreCondition = tyreCondition
    
    def getRimSize(self):
        return self.rimSize
    
    def setRimSize(self, rimSize):
        self.rimSize = rimSize
    
    def getTyreType(self):
        return self.tyreType
    
    def setTyreType(self, tyreType):
        if tyreType == "summer":
            self.tyreType = WheelType.summer
        elif tyreType == "winter":
            self.tyreType = WheelType.winter
    
    def getTyrePressure(self):
        return self.tyrePressure
    
    def setTyrePressure(self, tyrePressure):
        self.tyrePressure = tyrePressure
    
    def getTyreCondition(self):
        return self.tyreCondition
    
    def setTyreCondition(self, tyreCondition):
        self.tyreCondition = tyreCondition