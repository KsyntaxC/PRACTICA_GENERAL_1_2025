'''
Serie: 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3, 4, 5, 4, 3, 2, 1, 2, 3 ...
'''
N=int(input("N: "))
n=1; sr=1
for i in range(N):
    print(n,end=", ")
    n=n+sr
    if n>=5 or n<=1:
        sr=sr*(-1)