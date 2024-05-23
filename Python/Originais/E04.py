def main():
    bibt={}
    bibb={}
    valor = 1
    while valor != 0: 
        n=int(input("Digite um número diferente de 0: "))
        if n ==0:
            break
        l=input("Digite uma letra: ")
        bibt[n]=l

        if len(bibt)==5:
            x=bibt.values()
            cont=-1
            chaves=bibt.keys()
            for i in bibt:
                cont+=1
                print(bibt[i])
                bibb[i]=list(x)[cont]
            for i in range(0,5,1):
                valor=list(chaves)[0]
                del bibt[valor]
                
main()