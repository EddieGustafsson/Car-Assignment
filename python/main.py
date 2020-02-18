import cmd, sys
from car import Car

car = Car("sedan")

class Main(cmd.Cmd):
    intro = 'Type help or ? to list commands.\n'

    def do_start(self, line):
        'Starts the engine'
        car.start()
    def do_go(self, line):
        'Apply throttle'
        car.go()
    def do_stop(self, line):
        'Apply brakes'
        car.stop()
    def do_kill(self, line):
        'Turn of engine'
        car.kill()
    def do_info(self, line):
        'Print car information'
        car.info()
    def do_quit(self, line):
        'Exit the program'
        return True

if __name__ == '__main__':
    Main().cmdloop()