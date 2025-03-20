'''
Serie: 1, 8, 27, 64, 125, 216, ...
'''
N=int(input("N: "))
pot=1
for i in range(1,N+1):
    pot=i*i*i
    print(pot,end=" ")