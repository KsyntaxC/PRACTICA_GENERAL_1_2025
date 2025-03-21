'''
Serie: 1, 2, 3, 4, 10, 19, 36, 69, 134, 258, 497 ...
'''
N=int(input("N: "))
a=0;b=1;c=2;d=-2;s=a+b+c+d
for i in range(N):
    print(s,end=", ")
    a=b;b=c;c=d;d=s
    s=a+b+c+d