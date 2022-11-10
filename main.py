import math



print (2 + 2 < 4)

print(7 // 3 == 1 + 1)

print(3**2 + 4**2 ==25)

print(2+4+6 > 12)

print(1387 / 19 == 0)

print(31/2 == 0 )

idade = 61
if (idade > 60) :
 print('Você tem direito aos benefícios')

dano = 11
escudo = 0
if(dano > 10 and escudo == 0) :
 print("You lose")

 leste = False
 oeste = False
 norte = False
 sul = False
 if(leste or oeste or norte or sul):
   ("Você escapou")

 ano_Bissexto = int(input("Digite o ano : "))

 if(ano_Bissexto / 4 and ano_Bissexto % 4 == 0):
  print("É um ano bissexto")
 else:
  print("Não é um ano bissexto")

primeiro_Lado_Triangulo = float(input("Digite o lado do Triângulo : "))
segundo_Lado_Triangulo = float(input("Digite o lado do Triângulo : "))
terceiro_Lado_Triangulo = float(input("Digite o lado do Triângulo : "))


if(primeiro_Lado_Triangulo == segundo_Lado_Triangulo == terceiro_Lado_Triangulo):
 print("Equilatero")
elif primeiro_Lado_Triangulo == segundo_Lado_Triangulo or primeiro_Lado_Triangulo == terceiro_Lado_Triangulo or segundo_Lado_Triangulo == terceiro_Lado_Triangulo :
 print("isósceles")
elif primeiro_Lado_Triangulo != segundo_Lado_Triangulo != terceiro_Lado_Triangulo:
 print("escaleno")
else: ("Você criou um novo triângulo")

codigo_Produto_1 = int(input("Digite o código do produto 1 : "))
numero_Unidade_Produto_1 = int(input("Digite o número de unidades do produto 1 : "))
preco_Unidade_Produto_1 = float(input("Digite o preço de uma unidade do produto 1 : "))
codigo_Produto_2 = int(input("Digite o código do produto 2 : "))
numero_Unidade_Produto_2 = int(input("Digite o número de unidades do produto 2 : "))
preco_Unidade_Produto_2 = float(input("Digite o preço de uma unidade do produto 2: "))

valor_A_Pagar = float(numero_Unidade_Produto_1*preco_Unidade_Produto_1 + numero_Unidade_Produto_2*preco_Unidade_Produto_2)

print("O  valor a Pagar é : R${}" .format(valor_A_Pagar))

valor_Raio = float(input("Digite o valor do Raio : "))
pi = 3.14159

volume_Circunferencia = (4 * pi * valor_Raio * valor_Raio * valor_Raio/3)

print("O volume da circunferência é : {} " .format(volume_Circunferencia))

letra_A = float(input("Digite o valor da base:"))
letra_B = float(input("Digite o valor do raio e base menor:"))
letra_C = float(input("Digite o valor da altura:"))

area_Triangulo = letra_A * letra_C
area_Circulo = float(3.14159 * letra_B * letra_B)
area_Trapezio = ((letra_A + letra_B)* letra_C)/2
area_Quadrado = letra_B * letra_B
area_Retangulo = letra_A * letra_B

print("{} {} {} {} {}" . format(area_Triangulo, area_Circulo, area_Trapezio, area_Quadrado, area_Retangulo))

primeiro_Numero = int(input("Digite o primeiro número : "))
segundo_Numero = int(input("Digite o segundo número : "))
terceiro_Numero = int(input("Digite o terceiro número : "))

if(primeiro_Numero > segundo_Numero and primeiro_Numero > terceiro_Numero):
 print("{} é o maior" .format(primeiro_Numero))
elif(segundo_Numero > primeiro_Numero and segundo_Numero > terceiro_Numero):
 print("{} é o maior" .format(segundo_Numero))
elif(terceiro_Numero > primeiro_Numero and terceiro_Numero > segundo_Numero):
 print("{} é o maior" .format(terceiro_Numero))



x1 = float(input("X : "))
x2 = float(input("X2 : "))
y1 = float(input("Y : "))
y2 = float(input("Y2 : "))

distancia_Entre_Dois_Pontos = (x2 - x1) ** 2 + (y2 - y1) ** 2

print(round(math.sqrt(distancia_Entre_Dois_Pontos), 4))

variacao_Distancia = int(input("Distancia percorrida : "))

variacao_Tempo = int(variacao_Distancia * 2)

print("{} minutos".format(variacao_Tempo))


for i in range(3,13,1):
  print(i)

a = 0
while(a < 9) :
 print(a)

 a +=2

