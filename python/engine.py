class Engine:
    def __init__(self, peakEffect, maxRpm, peakEffectRpm, peakTorqueRpm, peakTorque, running):
        self.peakEffect = peakEffect
        self.maxRpm = maxRpm
        self.peakEffectRpm = peakEffectRpm
        self.peakTorque = peakTorque
        self.running = running
    
    def getPeakEffect(self):
        return self.peakEffect
    
    def setPeakEffect(self, peakEffect):
        self.peakEffect = peakEffect
    
    def getMaxRpm(self):
        return self.maxRpm
    
    def setMaxRpm(self, maxRpm):
        self.maxRpm = maxRpm

    def getPeakEffectRpm(self):
        return self.peakEffectRpm
    
    def setPeakEffectRpm(self, peakEffectRpm):
        self.peakEffectRpm = peakEffectRpm
    
    def getPeakTorque(self):
        return self.peakTorque
    
    def setPeakTorque(self, peakTorque):
        self.peakTorque = peakTorque
    
    def isRunning(self):
        return self.running
    
    def setRunning(self, running):
        self.running = running
    
    def start(self):
        self.setRunning(True)
        print("brum brum...")
    
    def kill(self):
        if self.isRunning():
            self.setRunning(False)
            print("Engine stopped.")
        else:
            print("Engine isn't running.")

