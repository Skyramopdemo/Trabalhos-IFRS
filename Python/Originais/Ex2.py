def main():
    lista=[]
    cont=0
    cons=[]
    vogais=["a","A","e","E","i","I","o","O","u","U"]
    for i in range(0,10,1):
        z=input("Digite o caractere: ")
        lista.append(z)
    for i in lista:
        if i in vogais:
            pass
        else:
            cont+=1
            cons.append(i)
    print(f"O número de consoantes é igual a: {cont}, e as consoantes que apareceram são: {cons}")
main()