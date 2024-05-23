bib={}
def main():
    bib=inserir()
    bibmenor={}
    bibmaior={}
    z=""

    chaves=bib.keys()
    arquivos=bib.values()

    for i in range(0,len(bib),1):
        a=list(arquivos)[i]
        c=list(chaves)[i]
        if a[0]<18:
            bibmenor[c]=a
        elif a[0]>=18:
            bibmaior[c]=a

    kma=bibmaior.keys()
    kme=bibmenor.keys()
    vma=bibmaior.values()
    vme=bibmenor.values()

    print("(CPF)(IDADE,'NOME')")
    if len(bibmaior)>0:
        print("MAIORES DE IDADE")
    for i in range (0,len(bibmaior),1):
        print(f"({list(kma)[i]}){list(vma)[i]}")
    if len(bibmenor)>0:
        print("MENORES DE IDADE")
    for i in range (0,len(bibmenor),1):
        print(f"({list(kme)[i]}) {list(vme)[i]}")
def inserir():
    valor=1
    while valor != 0:
        CPF=int(input("Digite o CPF da pessoa: "))
        IDADE=int(input("Digie a IDADE da pessoa: "))
        NOME=input("Digite o NOME da pessoa: ")
        valor=int(input("Digite 0 se deseja parar: "))
        dados=(IDADE,NOME)
        bib[CPF]=dados
    return(bib)
main()