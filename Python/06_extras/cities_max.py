# Finde alle Städte in denen mindestens eine Temperatur über 30 Grad liegt mithilfe einer Lambda Funktion

cities_max_temperatures = [('New York', [15, 25, 30]), ('Los Angeles', [20, 28, 32]), ('Chicago', [10, 20, 25]), ('Houston', [25, 30, 35])]

hot_cities = filter(lambda city: any(temp > 30 for temp in city[1]), cities_max_temperatures)
print(list(hot_cities))