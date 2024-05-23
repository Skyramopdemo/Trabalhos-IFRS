def main():
    bib={1:4,2:4.5,3:5,4:2,5:1.5}
    entrada(bib)

def entrada(bib):
    cod=int(input("Digite o código do produto: "))
    quan=int(input("Digite a quantidade do produto: "))
    z=bib[cod]
    x=z*quan

    mostrar(x)
def mostrar(x):
    print(f'Total: R$ {x:,.2f}')

main()