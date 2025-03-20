'''
Dado un número entero N expresado en segundos, transformar en horas minutos y segundos,
en el siguiente formato, HH : MM : SS.
'''
N=int(input("Intro N: "))
h=N//3600
m=(N%3600)//60
s=N%60
print(f"{h:02d}:{m:02d}:{s:02d}")