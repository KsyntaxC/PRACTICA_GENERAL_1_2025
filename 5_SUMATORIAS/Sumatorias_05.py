'''
Generar la siguiente sumatoria:
1-0 + 1-2 + 1-0 + 1-2 + 3-2 + 1-0 + 1-2 + 3-4 + 3-2 + 1-0 + 1-2 + 3-4 + 5-4...
'''
N=int(input("N: "))
sb=1; m=-1; c=1; mx=1; s=0
for i in range(N):
    if i%2==0:
        print(sb,"-",end=" ")
        s=s+sb
    else: 
        print(sb,"+",end=" ")
        s=s-sb
    sb=sb+m
    if sb<=0 or sb>mx:
        m=m*(-1)
        c=c+1
    if c>2:
        mx=mx+1
        c=1
print("Resultado: ",s)