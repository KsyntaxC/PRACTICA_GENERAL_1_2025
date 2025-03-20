'''
Serie: 1, 0, 1, 2, 1, 2, 3, 2, 6, 4, 5, 24, 5, 8, 120, 6, 13, 720 ...
'''
N=int(input("N: "))
sw=1; n=1; facto=1; j=2
sim=0; im=1; c=0
for i in range(1,N+1):
    if i%3!=0:
        if sw==1:
            print(n,end=", ")
            n=n+1
            sw=0
        else:
            print(sim,end=", ")
            c=c+1
            if c>2:
                c=1; im=im+2
            sim=sim+im
            sw=1
    else:
        print(facto,end=", ")
        facto=facto*j
        j=j+1