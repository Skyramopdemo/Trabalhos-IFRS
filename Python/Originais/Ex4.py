def main():
    listaSO=[0,0,0,0,0,0]
    nomesSO=["Windows Server","Unix","Linux","Netwate","Mac OS","Outros"]
    total=0
    resposta=""
    printopcoes()
    
    while resposta != 0:
        resposta=int(input("Digite o sistema escolhido (APENAS NUMEROS): "))
        if resposta !=0:
            valor=int(input("Digite o valor de votos: "))
            listaSO[resposta - 1]+=valor
     
    for i in listaSO:
        total+=i
        totalprint=total
    if total == 0:
        total+=1
        totalprint=total-1

    listaTotais=[0,0,0,0,0,0]
    for i in range(0,6,1):
        listaTotais[i]=int(((listaSO[i]/total)*100))
    

    copyListaSo = listaSO[:]
    copyListaSo.sort(reverse=True)

    for i in range(0,len(listaSO),1):
        if listaSO[i]==copyListaSo[0]:
            vic=i
        else:
            pass

    print("\nSO                        VOTOS                        %\n----------------------------------------------------------")
    print(f"1- Windows Server          {listaSO[0]}                         {listaTotais[0]}%\n2- Unix                    {listaSO[1]}                         {listaTotais[1]}%\n3- Linux                   {listaSO[2]}                         {listaTotais[2]}%\n4- Netware                 {listaSO[3]}                          {listaTotais[3]}%\n5- Mac OS                  {listaSO[4]}                          {listaTotais[4]}%\n6- Outros                  {listaSO[5]}                          {listaTotais[5]}%\n")
    print(f"----------------------------------------------------------\nTotal                      {totalprint}")
    print(f"O SO mais votado foi o {nomesSO[vic]}, com {copyListaSo[0]} votos, correspondendo a {listaTotais[vic]}% dos votos")


def printopcoes():
    print("1- Windows Server \n2- Unix \n3- Linux \n4- Netware \n5- Mac OS \n6- Outros \n")
main()