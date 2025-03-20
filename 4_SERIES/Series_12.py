'''
Juez Patito ID: 1899 Serie: 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9,...
'''
N=int(input("N: "))
n=0
for i in range(N):
    print(n,end=", ")
    if i%2!=0:
        n=n+1