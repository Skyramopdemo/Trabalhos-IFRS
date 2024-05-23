def main():

    sequencia()

def sequencia():
    z=int(input("Digite a quantidade de repetições a serem feitas: "))
    lt=[]
    cont1=0
    cont2=-1
    world=""
    ct1=0
    ct2=0
    for i in range(0,z,1):
        cont1+=1
        cont2+=2
        ct1+=cont1
        ct2+=cont2
        world=(str(cont1)+"/"+str(cont2))
        lt.append(world)
    numero=(' + '.join(lt))
    print(f"S = {numero}")
    print(f"A soma dos valores é igual a: {ct1}/{ct2}")
main()