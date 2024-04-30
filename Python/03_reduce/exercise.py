# Berechne die Durchschnittstemperatur mithilfe einer Lambda Funktion

from functools import reduce

temperatures_celsius = [25, 30, 22, 18, 28, 35, 20]

average_temperature = reduce(lambda x, y: x + y, temperatures_celsius) / len(temperatures_celsius)
print(average_temperature)