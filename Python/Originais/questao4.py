def main():

    vi=input("Indentificador 2000, vertebrado ou invertebrado: (Apenas minusculas :D) ")

    if vi=="vertebrado":
        am=input("Digite ave ou mamifero: ")
        if am=="ave":
            co=input("Digite carnivoro ou onivoro: ")
            if co=="carnivoro":
                print("Aguia")
            elif co=="onivoro":
                print("Pomba")
        elif am=="mamifero":
            co=input("Digite onivoro ou herbivoro: ")
            if co=="onivoro":
                print("homem")
            elif co=="herbivoro":
                print("vaca")

    elif vi=="invertebrado":
        am=input("Digite inseto ou anelideo: ")
        if am=="inseto":
            co=input("Digite hematofago ou herbivoro: ")
            if co=="hematofago":
                print("pulga")
            elif co=="herbivoro":
                print("lagarta")
        elif am=="anelideo":
            co=input("Digite hematofago ou onivoro: ")
            if co=="hematofago":
                print("sanguessuga")
            elif co=="onivoro":
                print("minhoca")
    



main()