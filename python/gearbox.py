import enum

class GearBoxType(enum.Enum):
    manual = "MANUAL"
    automatic = "AUTOMATIC"

class GearBox:
    def __init__(self, numberOfGears, actualGearBoxType):
        self.numberOfGears = numberOfGears
        self.actualGearBoxType = actualGearBoxType
    
    def getNumberOfGears(self):
        return self.numberOfGears
    
    def setNumbersOfGears(self, numberOfGears):
        self.numberOfGears = numberOfGears
    
    def getActualGearBoxType(self):
        return self.actualGearBoxType
    
    def setActualGearBoxType(self, actualGearBoxType):
        if actualGearBoxType == "manual":
            self.actualGearBoxType = GearBoxType.manual
        elif actualGearBoxType == "automatic":
            self.actualGearBoxType = GearBoxType.automatic