'''
Si una persona tiene que llegar a su trabajo que esta a X metros de distancia y ya solo le
quedan T minutos, (X y T son datos de entrada)¿A que velocidad constante debería conducir
para llegar a tiempo a su trabajo?

'''
X=int(input("Distancia en metros: "))
T=int(input("Tiempo en minutos: "))
V=int(X/(T*60))
print("Velocidad:",V,"m/s")