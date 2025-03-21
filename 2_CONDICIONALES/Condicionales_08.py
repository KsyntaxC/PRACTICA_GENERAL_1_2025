'''
Hay tres hermanos llamados A, B y C. Las relaciones de edad entre ellos se dan mediante
tres caracteres SAB, SAC, y SBC, que significan lo siguiente:
Si SAB es < , entonces A es más joven que B; si es >, entonces A es mayor que B.
Si SAC es <, entonces A es más joven que C; si es >, entonces A es mayor que C.
Si SBC es <, entonces B es mas joven que C; si es >, entonces B es mayor que C.
Restricción: Cada uno de SAB, SAC, y SBC es < o >.
Entrada: La entrada consta de tres caracteres que representan SAB, SAC, y SBC respectivamente.
Salida: Imprime el nombre del hermano mediano, es decir, el segundo mayor de los tres
'''
Sab=input("Ingrese la relación de A con B ('<' o '>'): ")
Sac=input("Ingrese la relación de A con C ('<' o '>'): ")
Sbc=input("Ingrese la relación de B con C ('<' o '>'): ")
if Sab=="<" and Sac==">" and Sbc=="<":
    h_med = "A"
elif Sab==">" and Sac== ">" and Sbc ==">":
    h_med="B"
elif Sab=="<" and Sac=="<" and Sbc==">":
    h_med="C"
elif Sab=="<" and Sac=="<" and Sbc=="<":
    h_med="B"
elif Sab==">" and Sac=="<" and Sbc==">":
    h_med="A"
elif Sab==">" and Sac=="<" and Sbc=="<":
    h_med="C"
elif Sab=="<" and Sac==">" and Sbc==">":
    h_med="C"
elif Sab==">" and Sac==">" and Sbc=="<":
    h_med="A"
else:
    print("Ingrese los valores indicados")
print("El hermano mediano es:", h_med)