def main():

    z=int(input("Montar a tabuada de: "))
    x=int(input("Começar por: "))
    y=int(input("Terminar em: "))
    tabuada(z,x,y)
def tabuada(valor, min, max):
    valorfixo = valor
    cont = min
    max+=1
    if min > max:
        print("A tabuada não pode começar por um número maior que o final!")
    else:
        for i in range(min,max,1):
            valor=valorfixo*cont
            print(f"{valorfixo} X {cont} = {valor}")
            cont=cont+1
            

main()