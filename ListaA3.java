import java.util.Scanner;
import java.util.List;

public class ListaA3 {
    public static void main(String[] args) throws Exception {
        Scanner entrada=new Scanner(System.in);

        // Menu
        System.out.println("+===========================+");
        System.out.println("         Atividade A3        ");
        System.out.println("     LISTA DE EXERCICIOS     ");
        System.out.println("+===========================+");
        System.out.println("1 - Maior e Menor");
        System.out.println("2 - Nota Aluno");
        System.out.println("3 - Media Notas");
        System.out.println("4 - Verificar Triangulo");
        System.out.println("5 - Peso Ideal");
        System.out.println("6 - Calcular IMC");
        System.out.println("7 - Aumento Salário");
        System.out.println("8 - Categoria Nadador");
        System.out.println("9 - Classe Eleitoral");
        System.out.println("10 - Dia Referente");
        System.out.println("11 - Mes Referente");
        System.out.println("12 - Calculadora");
        System.out.println("13 - Equação 2° Grau");

        // Ficar repetindo o aplicativo
        int encerrar = 1;
        while (encerrar != 0){
            // Selecionar Opção
            int selecionarQuestao;
            while (true) {
                System.out.print("Qual atividade gostaria de executar: ");
                selecionarQuestao = entrada.nextInt();
                if (selecionarQuestao < 1 || selecionarQuestao > 13) {
                    System.out.println("Número inválido! Digite uma opção de 1 e 13");
                }
                else {
                    break;
                }
            }

            // Atividades        
            System.out.println("Exercício " + selecionarQuestao + " selecionado");
            System.out.println("Enunciado: ");
            switch(selecionarQuestao){
                case 1: {
                    int primeiroNum, segundoNum;
                    System.out.println("Faça um programa que receba dois números e mostre o maior e o menor. Emita uma mensagem, caso os dois sejam iguais.");
                    System.out.print("Digite o primeiro número: ");
                    primeiroNum = entrada.nextInt();
                    System.out.print("Digite o segundo número: ");
                    segundoNum = entrada.nextInt();
                    if (primeiroNum == segundoNum) {
                        System.out.println("Os números são iguais!");
                    }
                    else if (primeiroNum > segundoNum) {
                        System.out.println("O número " + primeiroNum + " é maior que " + segundoNum); 
                    }
                    else {
                        System.out.println("O número " + segundoNum + " é maior que " + primeiroNum);
                    }
                    break;
                }
                case 2: {
                    float nota;
                    System.out.println("Faça um programa que receba as duas notas de um aluno, calcule sua média, e que imprima a sua situação: ");
                    System.out.println(">= 7 - Aprovado");
                    System.out.println(" < 7 - Reprovado");
                    while (true){
                        System.out.print("Digite a nota do aluno: ");
                        nota = entrada.nextFloat();
                        if (nota < 0 || nota > 10) {
                            System.out.println("Nota inválida, digite um valor de 0 a 10");
                        }
                        else {
                            break;
                        }
                    }
                    if (nota >= 7) {
                        System.out.println("Aluno aprovado com " + (nota * 10) + "% de aproveitamento.");
                    }
                    else {
                        System.out.println("Aluno reprovado!");
                    }
                    break;
                }
                case 3: {
                    float nota1, nota2, nota3, media;
                    System.out.println("Faça um programa que receba 3 notas de um aluno, calcule e mostre uma mensagem de acordo com sua média:");
                    System.out.println(">= 0 a < 3  - Reprovado");
                    System.out.println(">= 3 a < 7  - Exame");
                    System.out.println(">= 7 a <=10 - Aprovado");
                    while (true) {
                        System.out.print("Digite a primeira nota do aluno: ");
                        nota1 = entrada.nextFloat();
                        if (nota1 < 0 || nota1 > 10) {
                            System.out.println("Nota inválida, digite um valor de 0 a 10");
                        }
                        else {
                            break;
                        }
                    }
                    while (true) {
                        System.out.print("Digite a segunda nota do aluno: ");
                        nota2 = entrada.nextFloat();
                        if (nota2 < 0 || nota2 > 10) {
                            System.out.println("Nota inválida, digite um valor de 0 a 10");
                        }
                        else {
                            break;
                        } 
                    }
                    while (true) {
                        System.out.print("Digite a terceira nota do aluno: ");
                        nota3 = entrada.nextFloat();
                        if (nota3 < 0 || nota3 > 10) {
                            System.out.println("Nota inválida, digite um valor de 0 a 10");
                        }
                        else {
                            break;
                        }
                    }
                    media = (nota1 + nota2 + nota3) / 3;
                    if (media >= 0 && media < 3) {
                        System.out.println("O aluno foi reprovado pois sua média é: " + media);
                    }
                    else if (media >= 3 && media < 7) {
                        System.out.println("O aluno foi ? pois sua média é: " + media);
                    }
                    else {
                        System.out.println("O aluno foi aprovado com a média de " + media);
                    }
                    break;
                }
                case 4: {
                    float x,y,z;
                    System.out.println("Dados três valores X,Y,Z, verificar se eles podem ser os comprimentos dos lados de um triângulo. Se eles não formarem um triângulo escrever uma mensagem. Considerar que o comprimento de cada lado de um triângulo é menor que a soma dos outros dois lados.");
                    System.out.print("Digite um valor para X: ");
                    x = entrada.nextFloat();
                    System.out.print("Digite um valor para Y: ");
                    y = entrada.nextFloat();
                    System.out.print("Digite um valor para Z: ");
                    z = entrada.nextFloat();
                    if ((x < (y+z)) && (y < (x+z)) && (z < (x+y))) {
                        System.out.println("Os valores formam um triângulo!");
                    }
                    else {
                        System.out.println("Os valores NÃO forma um triângulo");
                    }
                    break;
                }
                case 5: {
                    int sexo;
                    double altura, pesoIdeal;
                    System.out.println("Faça um programa que leia o sexo e a altura (H - em metros) de uma pessoa, calcule e apresente seu peso ideal utilizando as seguintes fórmulas:");
                    System.out.println("Peso ideal (homens) = (72,7 * H) – 58");
                    System.out.println("Peso ideal (mulheres) = (62,1 * H) – 44,7");
                    System.out.println("1 - Homem");
                    System.out.println("2 - Mulher");
                    while (true){
                        System.out.print("Selecione a opção desejada: ");
                        sexo = entrada.nextInt();
                        if (sexo < 1 || sexo > 2){
                            System.out.println("Opção inválida! Selecione um dos valores a seguir: ");
                            System.out.println("1 - Homem");
                            System.out.println("2 - Mulher");
                        }
                        else {
                            break;
                        }
                    }
                    System.out.print("Digite a altura em metros (utilizando ',' virgula): ");
                    altura = entrada.nextDouble();

                    if (sexo == 1) {
                        pesoIdeal = (72.7 * altura) - 58;
                        System.out.println("O seu peso ideal é: " + pesoIdeal);
                    }
                    else {
                        pesoIdeal = (62.1 * altura) - 44.7;
                        System.out.println("O seu peso ideal é: " + pesoIdeal);
                    }
                    break;
                }
                case 6: {
                    double peso, altura, imc;
                    System.out.println("Construa um programa para determinar se o indivíduo está com um peso favorável. Essa situação é determinada através do IMC (Índice de Massa Corpórea), que é definida como sendo a relação entre o peso (PESO – em kg) e o quadrado da Altura (ALTURA – em m) do indivíduo. Ou seja IMC= PESO/ALTURA2");
                    System.out.println("IMC < 20 - Abaixo do Peso");
                    System.out.println("20 < IMC < 25 - Peso Normal");
                    System.out.println("25 < IMC < 30 - Sobre Peso");
                    System.out.println("30 < IMC < 40 - Obeso");
                    System.out.println("IMC > 40 - Obeso Mórbido");
                    System.out.print("Digite sua altura em metros(separado por ','): ");
                    altura = entrada.nextDouble();
                    System.out.print("Digite seu peso: ");
                    peso = entrada.nextDouble();
                    imc = peso / (altura * altura);
                    if (imc < 20) {
                        System.out.println("De acordo com seu IMC voce está: Abaixo do Peso");
                    }
                    else if (imc <= 20 && imc < 25) {
                        System.out.println("De acordo com seu IMC você está com: Peso Normal");
                    }
                    else if (imc <= 25 && imc < 30) {
                        System.out.println("De acordo com seu IMC você está com: Sobre Peso");
                    }
                    else if (imc <= 30 && imc < 40) {
                        System.out.println("De acordo com seu IMC você está: Obeso! Perigo!");
                    }
                    else {
                        System.out.println("De acordo com seu IMC você está com: Obesidade Mórbida!! Muito Perigo!");
                    }
                    break;
                }
                case 7: {
                    double salario, aumento;
                    System.out.println("Uma empresa decide dar aumento de 30% aos funcionários com salários inferiores a R$1000,00. Faça um programa que receba o salário do funcionário e mostre o valor do salário reajustado ou uma mensagem, caso o funcionário não tenha direito ao aumento.");
                    System.out.print("Digite seu salário atual: ");
                    salario = entrada.nextDouble();
                    if (salario >= 1000) {
                        System.out.println("Você não está qualificado para receber o aumento.");
                    }
                    else {
                        System.out.println("Parabéns! Você está qualificado para receber um aumento.");
                        System.out.println("Seu salário atual é: R$" + salario);
                        aumento = salario + (salario * 0.3);
                        System.out.println("Seu novo saário será: R$" + aumento);
                    }
                    break;
                }
                case 8: {
                    int idade;
                    System.out.println("Faça um programa que receba a idade de um nadador e mostre a sua categoria");
                    System.out.println("   IDADE           CATEGORIA    ");
                    System.out.println(" até 7 anos         Infantil    ");
                    System.out.println("8  a 10 anos        Juvenil     ");
                    System.out.println("11 a 15 anos      Adolescente   ");
                    System.out.println("16 a 30 anos         Adulto     ");
                    System.out.println("acima de 30          Senior     ");
                    System.out.println("Seja Bem-Vindo nadador!");
                    System.out.print("Digite sua idade para saber sua categoria: ");
                    idade = entrada.nextInt();
                    if (idade <= 7) {
                        System.out.println("De acordo com sua idade você está na categoria Infantil");
                    }
                    else if (idade >= 8 && idade <= 10) {
                        System.out.println("De acordo com sua idade você está na categoria Juvenil");
                    }
                    else if (idade >= 11 && idade <= 15) {
                        System.out.println("De acordo com sua idade você está na categoria Adolescente");
                    }
                    else if (idade >= 16 && idade <= 30) {
                        System.out.println("De acordo com sua idade você está na categoria Adulto");
                    }
                    else {
                        System.out.println("De acordom com sua idade você está na categoria Senior");
                    }
                    break;
                }
                case 9: {
                    int idade;
                    System.out.println("Faça um programa que leia a idade de uma pessoa e informe a sua classe eleitoral:");
                    System.out.println("Idade abaixo de 16 - Não eleitor");
                    System.out.println("Idade maior 18 menor de 65 - Eleitor Obrigatório ");
                    System.out.println("Idade de 16 a 18 ou 65 ou mais - Facultativo");
                    System.out.print("Digite sua idade: ");
                    idade = entrada.nextInt();
                    if (idade < 16) {
                        System.out.println("Devido a falta de idade necessária, você ainda não é um eleitor.");
                    }
                    else if ((idade >= 16 && idade < 18) || (idade >= 65))  {
                        System.out.println("De acordo com sua idade você é um eleitor Facultativo.");
                    }
                    else {
                        System.out.println("De acordo com sua idade você é um eleitor obrigatório!!");
                    }
                    break;
                }
                case 10: {
                    int diaSemana;
                    System.out.println("Faça um programa que leia o um número inteiro entre 1 e 7 e escreva o dia da semana correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe dia da semana com esse número.");
                    List<String> semana = List.of("Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira", "Sabado");
                    System.out.print("Digite um numero de 1 a 7: ");
                    diaSemana = entrada.nextInt();
                    if (diaSemana >= 1 && diaSemana <= 7) {
                        System.out.println("Dia da semana referente é: " + semana.get(diaSemana - 1));    
                    }
                    else {
                        System.out.println("Não existe nenhum dia da semana com este número.");
                    }
                    break;
                }
                case 11: {
                    int mes;
                    System.out.println("Faça um programa que leia um número inteiro entre 1 e 12 e escrever o mês correspondente. Caso o usuário digite um número fora desse intervalo, deverá aparecer uma mensagem informando que não existe mês com este número.");
                    List<String> meses = List.of("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
                    System.out.print("Digite um numero de 1 a 12: ");
                    mes = entrada.nextInt();
                    if (mes >= 1 && mes <= 12) {
                        System.out.println("Mes referente é: " + meses.get(mes - 1));
                    }
                    else {
                        System.out.println("Não existe nenhum mês com este número.");
                    }
                    break;
                }
                case 12: {
                    double primeiroNum, segundoNum, operacao;
                    int menu;
                    System.out.println("Faça um programa que solicite ao usuário que informe dois números e que exiba o seguinte menu:");
                    System.out.println("1 - Somar");
                    System.out.println("2 - Subtrair");
                    System.out.println("3 - Multiplicar");
                    System.out.println("4 - Dividir");
                    System.out.println("5 - Sair");
                    System.out.print("Digite o primeiro número: ");
                    primeiroNum = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    segundoNum = entrada.nextDouble();
                    while (true){
                        System.out.print("Selecione oque deseja fazer com os números: ");
                        menu = entrada.nextInt();
                        if (menu < 1 || menu > 5) {
                            System.err.println("Opção inválida, digite um valor de 1 a 5");
                        }
                        else {
                            break;
                        }
                    }
                    if (menu == 1) {
                        operacao = primeiroNum + segundoNum;
                        System.out.println("O resultado da soma dos números é: " + operacao);
                    }
                    else if (menu == 2) {
                        operacao = primeiroNum - segundoNum;
                        System.out.println("O resultado da subtração dos números é: " + operacao);
                    }
                    else if (menu == 3) {
                        operacao = primeiroNum * segundoNum;
                        System.out.println("O resultado da multiplicação dos números é: " + operacao);
                    }
                    else if (menu == 4) {
                        operacao = primeiroNum / segundoNum;
                        System.out.println("O resultado da divisão dos números é: " + operacao);
                    }
                    else {
                        System.out.println("Opção escolhida não faz nada.");
                        System.out.println("Fim!");
                    }
                    break;
                }
                case 13: {
                    double a, b, c, delta, bhaskara1, bhaskara2;
                    System.out.println("Faça um programa para resolver equações de segundo grau");
                    System.out.println("ax² + bx + c = 0");
                    System.out.println("▲ = b² - 4ac");
                    System.out.println("▲ < 0 - Não existe raiz real");
                    System.out.println("▲ = 0 - Existe somente uma raiz real");
                    System.out.println("▲ > 0 - Existe duas raízes reais");
                    System.out.print("Digite o valor de A: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite o valor de B: ");
                    b = entrada.nextDouble();
                    System.out.print("Digite o valor de C: ");
                    c = entrada.nextDouble();
                    delta = (b * b) - (4 * a * c);
                    if (delta < 0) {
                        System.out.println("Não existe raizes reais. Pois seu delta é: " + delta);
                    }
                    else if (delta == 0) {
                        System.out.println("Existe uma raiz real, pois seu delta é: " + delta + ". Portanto: ");
                        System.out.println("x = -b / 2 * a");
                        bhaskara1 = (-b / (2 * a));
                        System.out.println("Raiz existente é: " + bhaskara1);

                    }
                    else {
                        System.out.println("Existe duas raízes reais, pois seu delta é: " + delta + ". Portanto");
                        System.out.println("x1 = (-b + √▲) / (2 * a)");
                        System.out.println("x2 = (-b - √▲) / (2 * a)");
                        bhaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
                        bhaskara2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.println("1° Raiz existente é: " + bhaskara1);
                        System.out.println("2° Raiz existente é: " + bhaskara2);
                    }
                    break;
                }
            }
            // Opção para decidir se vai encerrar ou repetir as atividades
            System.out.print("Digite 1 para repetir ou 0 para encerrar: ");
            encerrar = entrada.nextInt();
        }
        entrada.close();
    }
}