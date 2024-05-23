def main():
    z=input("Digite o texto (Apenas letras, não é aceito caracteres do tipo: !$#...): ")
    x=z.lower()
    mais_frequentes(x)
def mais_frequentes(x):
    l=["a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","á","à","ã","â","å","ä","ą","œ","ç","ĉ","ć","é","è","ê","ë","ę","ĝ","ğ","ĥ","í","ì","î","ï","ĵ","ł","ñ","ń","ó","ò","õ","ô","ö","ŝ","ş","ś","ß","ú","ù","û","ŭ","ü","ź","ż"]
    alfabeto={}
    porcentagem={}
    fraselimpa=[]

    y=x.split(" ")
    for i in range(0,len(l),1):
        alfabeto[l[i]]=0
        porcentagem[l[i]]=0
    for i in range(0,len(y),1):
        n=y[i]
        for k in range(0,len(n),1):
            fraselimpa.append(n[k])
    
    troca="[()'',]"
    pporg=[]
    for i in l:
        valor=fraselimpa.count(i)
        alfabeto.update({i:valor})
        porcentagem.update({i:fraselimpa.count(i)/len(fraselimpa)*100}) 
    porcentagem_organizada= sorted(porcentagem.items(),key=lambda kv: kv[1])
    porg=str(porcentagem_organizada)

    
    for i in range(0, len(troca),1):
        porg=porg.replace(troca[i],"")
    porgl=porg.split(" ")
    
    for i in range(0,len(porgl),1):
        pporg.append(porgl[i])

    for i in range(-2,len(pporg)*-1-2,-2):
        print(f"'{pporg[i]}' {pporg[i+1]}%")
main()