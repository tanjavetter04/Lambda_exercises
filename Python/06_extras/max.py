# Berechne die Maximaltemperatur mithilfe einer Lambda Funktion und ohne eine von Python bereitgestellte Funktion

from functools import reduce

temperatures_celsius = [25, 30, 22, 18, 28, 35, 20]

highest_temperature = reduce(lambda x, y: x if x > y else y, temperatures_celsius)
print(highest_temperature)