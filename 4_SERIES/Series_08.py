'''
Serie: 1, 0, 3, 0, 0, 0, 5, 0, 0, 0, 0, 0, 7, 0, ...
'''
N=int(input("N: "))
n=1; c=1; sw=1
for i in range(N):
    if sw==1:
        print(n,end=", ")
        n=n+1
        sw=0
    else:
        print(0,end=", ")
        c=c+1
        if c>=n:
            sw=1; c=1