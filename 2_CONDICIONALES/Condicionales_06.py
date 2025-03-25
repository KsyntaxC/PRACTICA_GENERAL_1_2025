'''
Entrada: La entrada consiste de cinco números enteros a,b,c,d,e. El objetivo es ordenarlos de mayor a menor.
'''
#ESTA ES LA OPCION CON VARIABLES
a=int(input("a: "))
b=int(input("b: "))
c=int(input("c: "))
d=int(input("d: "))
e=int(input("e: ")) 
if a>b:
    m1=a; m2=b
else:
    m1=b; m2=a
if c>m1:
    m3=m2; m2=m1; m1=c
else:
    if c>m2:
        m3=m2; m2=c
    else:
        m3=c
if d>m1:
    m4=m3; m3=m2; m2=m1; m1=d
else:
    if d>m2:
        m4=m3; m3=m2; m2=d
    else:
        if d>m3:
            m4=m3; m3=d
        else:
            m4=d
if e>m1:
    m5=m4; m4=m3; m3=m2; m2=m1; m1=e
else:
    if e>m2:
        m5=m4; m4=m3; m3=m2; m2=e
    else:
        if e>m3:
            m5=m4; m4=m3; m3=e
        else:
            if e>m4:
                m5=m4; m4=e
            else:
                m5=e
print(m1,m2,m3,m4,m5)