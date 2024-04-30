# Rechne die gegebenen Temperaturen mithilfe einer Lambda Funktion in Fahrenheit um (Temperatur * 1.8 + 32)

temperatures_celsius = [25, 30, 22, 18, 28, 35, 20]

temperatures_fahrenheit = map(lambda c: (c * 9/5) + 32, temperatures_celsius)
print(list(temperatures_fahrenheit))