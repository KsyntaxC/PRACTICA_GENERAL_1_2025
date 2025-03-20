'''
Serie: 1, 2, 6, 24, 120, 720, ...
'''
N=int(input("N: "))
facto=1
for i in range(1,N+1):
    facto=facto*i
    print(facto,end=" ")