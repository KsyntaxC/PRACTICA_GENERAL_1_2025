'''
Serie: 0, 2, 1, 3, 1, 5, 2, 7, 3, 11, 5, 13, 8, 17, 13 ...
'''
N=int(input("N: "))
primo=2; a=-1; b=1; fibo=a+b;sw=0
for i in range(1,N+1):
    if i%2==0:
        while sw==0:
            np=1
            for j in range(2, primo):
                if primo%j==0:
                    np=0
            if np==1:
                print(primo, end=", ")
                sw=1
            primo=primo+1
        sw=0
    else:
        print(fibo,end=", ")
        a=b; b=fibo; fibo=a+b