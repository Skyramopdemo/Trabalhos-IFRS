def main():
    lista=[]
    total=0
    for i in range(0,4,1):
        z=int(input("Digite a nota: "))
        lista.append(z)
        total=total+z
    media=total/4
    print(f"As notas foram: {lista} e a média foi de: {media}")     
main()