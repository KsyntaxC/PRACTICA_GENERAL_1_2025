'''
Serie: : 2, 0, 4, 1, 6, 1, 8, 2, 10, 3, ...
'''
N=int(input("N: "))
par=2; a=-1; b=1 ;fibo=a+b
for i in range(N):
    if i%2==0:
        print(par,end=" ")
        par=par+2
    else:
        print(fibo,end=" ")
        a=b; b=fibo; fibo=a+b