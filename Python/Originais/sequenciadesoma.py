def main():
    n = 1
    z = []
    while n != 0:
        n=int(input("Digite o valor: "))
        z.append(n)
    print(z)
    somasequencia(z)

def somasequencia(n):
    soma = 0
    for i in n:
        soma=soma+i
    print(f"A soma da sequência é igual a: {soma}")


main()