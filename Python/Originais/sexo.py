def main():
    sex = input("Entre o seu sexo: \n Digite 'F' para Feminino \n Digite 'M' para Masculino")
    sexos(sex)

def sexos(ele):
    if ele == ("F" or "f"):
        print("Seu sexo é o Feminino")
    elif ele == ("M" or "m"):
        print("Seu sexo é o Masculino")
    else:
        print("Seu sexo é invalido")

main()