package estudando;
import java.util.Scanner;

public class Aprendendo {

	public static void main(String[] args) {
				
		int A = 10;
		int B = 20;
		    
		int X = A + B;
		    System.out.println(X);
		       

		
		float pi = (float) 3.14159;
		int r = 7;
		
		int area = (int) (pi*r*r);
		
		System.out.println("O valor da área da circunferência é :" + area);
		
		
   int a = 2;
   int b = 2;
   int PROD = a + b;
   
   System.out.println("O valor do PROD dos dois números é : " + PROD);
   
		float peso_a = (float) 3.5;
		float peso_b = (float) 7.5;
		int a1 = 8;
		int b1 = 4;
		
		float media = (a1*peso_a + b1*peso_b)/(a1+b1);
		
		System.out.println("A média do aluno é : " + media);
				

		float peso_a_1 = (float) 2;
		float peso_b_2 = (float) 3;
		float peso_c_3= (float) 5;
		int a_1 = 8;
		int b_2 = 2;
		int c_3 = 4;
		
		float media_1 = (a_1*peso_a_1 + b_2*peso_b_2 + c_3 *peso_c_3)/(a_1+b_2+c_3);
		
		System.out.println("A média do aluno é : " + media_1);
				
			
		
		int x = 10;
		int y = 20;
		int z = 30;
		int w = 40;
		
		int soma_Da_Diferenca = (x*y - z*w);
		
		System.out.println(soma_Da_Diferenca);
		
		
	
		
		 try (Scanner sc = new Scanner(System.in)) {
			 
			System.out.println("Digite o código do funcionário é : ");
			int cod_Funcionario1 = sc.nextInt();
			
			System.out.println("Digite as horas trabalhadas do funcionário : ");
			int horas_Trabalhadas = sc.nextInt();
			
			System.out.println("Digite o valor da hora trabalhada em reais: ");
			float valor_Recebido_Hora = sc.nextFloat();
			
			float slave_Luso = (float) horas_Trabalhadas*valor_Recebido_Hora;
			
			float transformar_em_Real = (float) ((float) slave_Luso/5.27);
			
		 System.out.println( "O código do funcionário é : " + cod_Funcionario1 + 
					 "\nValor recebido por mês : " + "U$" +  transformar_em_Real);

		 try (Scanner sc_1 = new Scanner(System.in)) {
			 System.out.println("Digite o nome do funcionário : ");
			 String nome_Funcionario = sc_1.nextLine();
				
			 System.out.println("Digite a quantidade de produtos vendidos : ");
			 float quantidade_De_Produtos_Vendidos = sc_1.nextFloat();
		
			 System.out.println("Qual é o valor do produto: ");
			 float valor_De_Um_Produto = sc_1.nextFloat();
			 
			 float valor_Total_Vendido = quantidade_De_Produtos_Vendidos*valor_De_Um_Produto; 
			
		     float salario_Luso = (float) ((float) valor_Total_Vendido + 0.15*valor_Total_Vendido);
			
			 System.out.println("O funcionário " + nome_Funcionario + " recebeu R$ " + salario_Luso 
					 + " e " + 0.15*valor_Total_Vendido + " de comissão " );
			
			 
		 
		 
		 
		 try (Scanner sc_2 = new Scanner(System.in)) {
			 System.out.println("Olá, eu sei quem é você!!!");
			 	 
			 
			 System.out.println("Falaê irmã, digitaê o seu nome:");
			 String nome_Do_Ser_Humano = sc_2.nextLine();
			 
			 System.out.println("Oreia seca, qual é a cerveja que você quer beber?");
			 String cerveja_Escolhida = sc_2.nextLine();
			 
			 System.out.println("Quanto custa uma latinha: ");
			 float quanto_Custa_1_Unidade = sc_2.nextFloat();
			 float quanto_Custa_1_Fardo = quanto_Custa_1_Unidade*12;
		 
		System.out.println("Eita, essa é boa! (Oreia) " + nome_Do_Ser_Humano + ", a " + cerveja_Escolhida + " é muito boa e cada latinha custa " + quanto_Custa_1_Unidade + " e o fardo com 12 custa " + quanto_Custa_1_Fardo);
		 
		 
		 Scanner input = new Scanner(System.in);
		 System.out.println("Digite a distância : ");
		 
		 float distancia_Carro = input.nextFloat();
		 
		 System.out.println("Quantos litros foram consumidos : ");
		 
		 float quantidade_Litros = input.nextFloat();
 
		 float consumo= distancia_Carro/quantidade_Litros;
		 
		 System.out.println("O consumo foi de : " + consumo);
		 
		
		}
		
		 }
//		 }
//				
		
	
//	}
//}

