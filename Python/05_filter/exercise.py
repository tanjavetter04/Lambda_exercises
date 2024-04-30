# Gib mithilfe einer Lambda Funktion in Europa gemessene Temperaturen aus

temperatures_continents = [('Asia', 32),('Asia', 28),('Europe', 20),('North America', 25),('Europe', 30),('Antarctica', -40),('North America', 35),('Europe', 18),('North America', 22),('Europe', 28)]

europe_temperatures = filter(lambda x: x[0] == 'Europe', temperatures_continents)
print(list(europe_temperatures))