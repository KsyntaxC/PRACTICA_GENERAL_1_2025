'''
Serie: 1, 8, 27, 64, 125, 216, ...
'''
N=int(input("N: "))
p=1
for i in range(1,N+1):
    p=i*i*i
    print(p,end=", ")