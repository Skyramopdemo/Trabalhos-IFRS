def main():
    lado1 = float(input("Digite o valor do primeiro lado "))
    lado2 = float(input("Digite o valor do segundo lado "))
    lado3 = float(input("Digite o valor do terceiro lado "))

    TesteDeTriangulo(lado1, lado2, lado3)

def TesteDeTriangulo(l1,l2,l3):
    if l1+l2>l3:
        TesteFormatoTriangulo(l1,l2,l3)
    else:
        print("Não é um triângulo.")

def TesteFormatoTriangulo(l1,l2,l3):
    if l1 == l2 and l2 == l3:
        print("O triângulo é equilátero.")
    elif l1 != l2 and l2 != l3:
        print("O triângulo é escaleno.")
    else:
        print("O triângulo é isósceles.")


main()