'''
Serie S
1 / 2 - 1 / 3 + 2 / 5 + 4 / 7 - 7 / 11 - 13 / 13 - 24 / 17 + 44 / 19
'''
N=int(input("S: "))
a=-1; b=1; c=0; dv=a+b+c
sw=0; p=2; sig=-1; cn=1; con=1
s=0
for i in range(N):
    while sw==0:
        np=1
        for j in range(2, p):
            if p%j==0:
                np=0
        if np==1:
            primo=p
            sw=1
        p=p+1
    sw=0
    a=b; b=c; c=dv; dv=a+b+c
    if cn>=con:
        sig=sig*(-1)
        con=con+1
        cn=1
    cn=cn+1
    if sig<0:
        print(dv,"/",primo," + ",end=" ")
        s=s-(dv/primo)
    else:
        print(dv,"/",primo," - ",end=" ")
        s=s+(dv/primo)
print(" =  ",s)