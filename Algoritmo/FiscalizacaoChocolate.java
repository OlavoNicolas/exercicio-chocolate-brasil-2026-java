import java.util.Scanner;

public class FiscalizacaoChocolate {
public static void main(String[] args) {
        
Scanner ls = new Scanner(System.in);
double percentual, preco;
String tipoChoc, aoLeite = "AO_LEITE", amargo = "AMARGO";
int gramas, notaDePureza;

System.out.println("\n--- SISTEMA DE FISCALIZAÇÃO PASCOA 2026 ---");

//1ª Situação: Classificação por Teor de Cacau
System.out.println("Digite o percentual de cacau da amostra: ");
percentual = ls.nextDouble();

if (percentual < 25) {
    
System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate");

} else if ( percentual >= 25 && percentual < 35) {

    System.out.println("Chocolate Comum (Padrão Nacional Atual)");
    
} else {
    
System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");

} 

//2ª Situação: Verificação de Categoria e Rótulo


System.out.println("Digite o tipo de chocolate (AO_LEITE/AMARGO): ");
ls.nextLine();
tipoChoc = ls.nextLine();

int i = 1;
while (i == 1) {
    
if (!tipoChoc.equals(aoLeite) && !tipoChoc.equals(amargo) ) {

System.out.println("Tipo não encontrado!");
System.out.println("Digite o tipo de chocolate (AO_LEITE/AMARGO): ");
tipoChoc = ls.nextLine();

} else {
    
i++;
}
}

System.out.println("Gramas de açúcar: ");
gramas = ls.nextInt();

if (tipoChoc == "AO_LEITE" && gramas > 15) {
    
    System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");

}else{

    System.out.println("Classificação: Chocolate balanceado");
}

//3ª Situação: Precificação de Exportação

System.out.println("Qual o valor do ovo de Páscoa R$ ");
preco = ls.nextDouble();

System.out.println("Qual a nota de pureza 0 a 10");
notaDePureza = ls.nextInt();

if (preco > 100.0 || notaDePureza < 5) {

System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
    
} else {

    System.out.println("APROVADO: Produto competitivo para o mercado externo");
    
}

System.out.println("-------------------------------------------");
ls.close();
}
}
