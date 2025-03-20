'''
Dado un numero N mostrar en la pantalla de la siguiente manera.
N=5
* 1 2 3 4
1 * 1 2 3
2 1 * 1 2
3 2 1 * 1
4 3 2 1 *
'''
N=int(input("N: "))
for i in range(1,N+1):
    n=1; nr=i-1
    for j in range(1,N+1):
        if i==j:
            print("*",end=" ")
        elif i<j:
            print(n,end=" ")
            n=n+1
        else:
            print(nr,end=" ")
            nr=nr-1
    print()
#SPOILER DE LO QUE SON LAS MATRICES JSJSJS XD