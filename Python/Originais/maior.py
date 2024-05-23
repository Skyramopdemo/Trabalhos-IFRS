def main():
    v1 = int(input("Insira o valor 1 "))
    v2 = int(input("Insira o valor 2 "))

    maior(v1,v2)

def maior(v1, v2):
    if v1 > v2:
        print(v1)
    else:
        print(v2)



main()