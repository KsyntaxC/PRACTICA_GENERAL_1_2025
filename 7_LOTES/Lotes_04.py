'''
Dado un lote de numeros detener la lectura de los numeros si se introduce algun numero que
sea perfecto. Un numero perfecto es aquel que es el resultado de la suma de sus divisores.
Mostrar el resultado de la suma de los numeros no perfectos.
'''
sw=1; sp=0
while sw==1:
    n=int(input())
    s=0
    for j in range(1,n):
        if n%j==0:
            s=s+j
    if s==n:
        sw=0
    else:
        sp=sp+n
print("Suma de los numeros no prefectos:",sp)
#ACLARO QUE 120 NO ES UN NUMERO PERFECTO, NO SE PQ EN EL SEGUNDO EJEMPLO FRENO AHI