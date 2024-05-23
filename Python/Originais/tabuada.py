def main():

    z=int(input("Digite o valor a ser feito a tabuada: "))
    tabuada(z)
def tabuada(valor):
    valorfixo = valor
    cont = 1
    
    for i in range(0,10,1):
        print(f"{valorfixo} X {cont} = {valor}")
        cont=cont+1
        valor=valorfixo*cont

main()