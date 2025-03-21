'''
Dada una temperatura en grados Celsius C, imprima sus respectivos valores en las diferentes
escalas de temperatura:
'''
C=float(input("Temperatura en grados Celsius: "))
F=(C*(9/5))+32
K=C+273.15
R=(C+273.15)*(9/5)
Re=C*(4/5)
print("Farenheit:",F,"°F")
print("Kelvin:",K,"°K")
print("Rankine:",R,"°R")
print("Réaumur:",Re,"°Re")