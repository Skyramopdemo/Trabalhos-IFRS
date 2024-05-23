def main():
    base = int(input("Digite a base: "))
    expoente = int(input("Digite a potencia: "))
    potencia(base, expoente)
def potencia(base, expoente):
    num=1
    for i in range(0,expoente,1):
        num=num*base
    print(f"O resultado é igual a: {num}")

main()