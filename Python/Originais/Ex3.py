def main():
    lista_evidencias=[]
    lista_opcoes=["s","S","Sim","SIM"]
    cont=0

    lista_evidencias.append(input("Telefonou para a vítima? "))
    lista_evidencias.append(input("Esteve no local do crime? "))
    lista_evidencias.append(input("Mora perto da vítima? "))
    lista_evidencias.append(input("Devia para a vítima? "))
    lista_evidencias.append(input("Já trabalhou com a vítima? "))
    for i in range(0,len(lista_evidencias),1):
        if lista_evidencias[i] in lista_opcoes:
            cont+=1

    if cont == 2:
        print("Classificação {Supeita}")
    elif cont == 3 or cont == 4:
        print("Classificação {Cúmplice}")
    elif cont == 5:
        print("Classificação {Assassino}")
    else:
        print("Classificação {Inocente}")
main()