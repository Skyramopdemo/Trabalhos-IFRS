bib={}
def main():

    valor=1
    while valor!=0:
        
        valor=int(input("\nDigite '1' se você quer cadastrar \nDigite '2' se você quer ver um cadastro \nDigite '3' se você quer alterar um cadastro \nDigite '0' para fechar o programa \nValor: "))

        if valor == 1:
            bib=cadastro()
        elif valor == 2:
            acessar(bib)
        elif valor == 3:
            modificar(bib)
        else:
            print(f"O número {valor}, não é uma opção.")
def acessar(bib):
    z=int(input("Digite o CPF da pessoa para acesar: "))
    if z in bib:
        f=(bib[z])

        print(f"\nNome: {f[0]}, Idade: {f[1]}, Telefone: {f[2]}")
    else:
        print("Esse CPF não está registrado.")
def modificar(bib):
    z=int(input("Digite o CPF da pessoa para acessar: "))
    if z in bib:
        NOME=input("Digite o NOME da pessoa: ")
        IDADE=int(input("Digite a IDADE da pessoa: "))
        TELEF=int(input("Digite o TELEFONE da pessoa: "))
        newvalores=(NOME,IDADE,TELEF)
        bib[z]=newvalores
        return(bib)
    else:
        print("Esse CPF não está registrado.")
def cadastro():
    CPF=int(input("Digite o CPF: "))
    NOME=input("Digite o NOME da pessoa: ")
    IDADE=int(input("Digite a IDADE da pessoa: "))
    TELEF=int(input("Digite o TELEFONE da pessoa: "))
    valores=(NOME,IDADE,TELEF)

    bib[CPF]=valores
    return(bib)

    
main()