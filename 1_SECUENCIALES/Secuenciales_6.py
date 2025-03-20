'''
Dada la velocidad en metros por segundo de despegue de un avión y la aceleración en metros
por segundo se pide calcular el tamaño de la pista utilice la formula D = V
2/2A.
'''
V=float(input("Velocidad en metros por segundo: "))
A=float(input("Aceleracion en metros por segundo"))
D=(V*V)/(2*A)
print(f"Tamano de la pista: {D:.3f} m")