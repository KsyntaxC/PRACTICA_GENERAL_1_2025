'''
Juez Patito ID: 2169 Serie: 1 3 6 11 18 19 22 29 38 41 50 51 ...
'''
N=int(input("N: "))
p=-2; a=1
print(a,end=" ")
for j in range(N):
    j=1; cont=0
    for i in range(1,N):
        if p%i==0:
            cont=cont+1
    if cont==2:
        print(a+p%10,end=" ")
        a=a+p%10
        j=j+1
        p=p+1
    else:
        p=p+1