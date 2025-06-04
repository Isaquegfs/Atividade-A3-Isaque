package AtividadeA3.InterfaceGrafica;
import javax.swing.*;
import java.awt.*;

public class ExerciciosGUI extends JFrame {
    private JComboBox<String> comboExercicios;
    private JTextArea textAreaSaida;
    private JButton btnExecutar;

    public ExerciciosGUI() {
        super("Exercícios Java");
        setSize(600, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        String[] exercicios = {
            "1 - Maior e menor número",
            "2 - Média e situação (2 notas)",
            "3 - Média e situação (3 notas)",
            "4 - Verificar triângulo",
            "5 - Peso ideal",
            "6 - IMC",
            "7 - Aumento salarial",
            "8 - Categoria nadador",
            "9 - Classe eleitoral",
            "10 - Dia da semana",
            "11 - Mês do ano",
            "12 - Calculadora",
            "13 - Equação do 2º grau"
        };

        comboExercicios = new JComboBox<>(exercicios);
        btnExecutar = new JButton("Executar");
        textAreaSaida = new JTextArea();
        textAreaSaida.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textAreaSaida);

        JPanel topo = new JPanel(new FlowLayout());
        topo.add(new JLabel("Escolha o exercício:"));
        topo.add(comboExercicios);
        topo.add(btnExecutar);

        add(topo, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        btnExecutar.addActionListener(e -> executarExercicio(comboExercicios.getSelectedIndex() + 1));
    }

    private void executarExercicio(int numero) {
        textAreaSaida.setText(""); // limpa saída
        switch (numero) {
            case 1:
                // Ex 1 - Maior e menor número
                try {
                    int num1 = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o primeiro número:"));
                    int num2 = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o segundo número:"));
                    if (num1 == num2) {
                        textAreaSaida.setText("Os números são iguais!");
                    } else if (num1 > num2) {
                        textAreaSaida.setText("O número " + num1 + " é maior que " + num2);
                    } else {
                        textAreaSaida.setText("O número " + num2 + " é maior que " + num1);
                    }
                } catch (NumberFormatException ex) {
                    textAreaSaida.setText("Entrada inválida. Use números inteiros.");
                }
                break;
            case 2:
                // Ex 2 - Média e situação (2 notas)
                try {
                    float nota1 = lerNota("Digite a primeira nota (0 a 10):");
                    float nota2 = lerNota("Digite a segunda nota (0 a 10):");
                    float media = (nota1 + nota2) / 2;
                    String resultado = media >= 7
                            ? "Aluno aprovado com " + (media * 10) + "% de aproveitamento."
                            : "Aluno reprovado!";
                    textAreaSaida.setText("Média: " + media + "\n" + resultado);
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 3:
                // Ex 3 - Média e situação (3 notas)
                try {
                    float n1 = lerNota("Digite a primeira nota (0 a 10):");
                    float n2 = lerNota("Digite a segunda nota (0 a 10):");
                    float n3 = lerNota("Digite a terceira nota (0 a 10):");
                    float media3 = (n1 + n2 + n3) / 3;
                    String msg;
                    if (media3 < 3) msg = "Reprovado";
                    else if (media3 < 7) msg = "Exame";
                    else msg = "Aprovado";
                    textAreaSaida.setText("Média: " + media3 + "\nSituação: " + msg);
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 4:
                // Ex 4 - Verificar triângulo
                try {
                    float x = Float.parseFloat(JOptionPane.showInputDialog(this, "Digite valor X:"));
                    float y = Float.parseFloat(JOptionPane.showInputDialog(this, "Digite valor Y:"));
                    float z = Float.parseFloat(JOptionPane.showInputDialog(this, "Digite valor Z:"));
                    boolean triangulo = x < y + z && y < x + z && z < x + y;
                    textAreaSaida.setText(triangulo ? "Os valores formam um triângulo!" : "Não formam triângulo.");
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 5:
                // Ex 5 - Peso ideal
                try {
                    String[] opcoes = {"Homem", "Mulher"};
                    int sexo = JOptionPane.showOptionDialog(this, "Selecione o sexo:", "Sexo",
                            JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
                    if (sexo == -1) {
                        textAreaSaida.setText("Operação cancelada.");
                        break;
                    }
                    double altura = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite a altura em metros (ex: 1.75):"));
                    double pesoIdeal = (sexo == 0) ? (72.7 * altura - 58) : (62.1 * altura - 44.7);
                    textAreaSaida.setText("Peso ideal: " + String.format("%.2f", pesoIdeal));
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 6:
                // Ex 6 - IMC
                try {
                    double altura = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite sua altura em metros (ex: 1.75):"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite seu peso em kg:"));
                    double imc = peso / (altura * altura);
                    String situacao;
                    if (imc < 20) situacao = "Abaixo do Peso";
                    else if (imc < 25) situacao = "Peso Normal";
                    else if (imc < 30) situacao = "Sobre Peso";
                    else if (imc < 40) situacao = "Obeso";
                    else situacao = "Obeso Mórbido";
                    textAreaSaida.setText(String.format("IMC: %.2f\nSituação: %s", imc, situacao));
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 7:
                // Ex 7 - Aumento salarial
                try {
                    double salario = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite seu salário atual:"));
                    if (salario >= 1000) {
                        textAreaSaida.setText("Você não está qualificado para receber o aumento.");
                    } else {
                        double novoSalario = salario * 1.3;
                        textAreaSaida.setText("Parabéns! Seu novo salário é R$ " + String.format("%.2f", novoSalario));
                    }
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 8:
                // Ex 8 - Categoria nadador
                try {
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite a idade do nadador:"));
                    String categoria;
                    if (idade <= 7) categoria = "Infantil";
                    else if (idade <= 10) categoria = "Juvenil";
                    else if (idade <= 15) categoria = "Adolescente";
                    else if (idade <= 30) categoria = "Adulto";
                    else categoria = "Senior";
                    textAreaSaida.setText("Categoria: " + categoria);
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 9:
                // Ex 9 - Classe eleitoral
                try {
                    int idade = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite sua idade:"));
                    String classe;
                    if (idade < 16) classe = "Não eleitor";
                    else if ((idade >= 16 && idade < 18) || idade >= 65) classe = "Eleitor Facultativo";
                    else classe = "Eleitor Obrigatório";
                    textAreaSaida.setText("Classe eleitoral: " + classe);
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 10:
                // Ex 10 - Dia da semana
                try {
                    String[] dias = {"Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira",
                            "Sexta-feira", "Sábado", "Domingo"};
                    int dia = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o número do dia da semana (1=Seg, ..., 7=Dom):"));
                    if (dia < 1 || dia > 7) {
                        textAreaSaida.setText("Número inválido.");
                    } else {
                        textAreaSaida.setText("Dia da semana: " + dias[dia - 1]);
                    }
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 11:
                // Ex 11 - Mês do ano
                try {
                    String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
                    int mes = Integer.parseInt(JOptionPane.showInputDialog(this, "Digite o número do mês (1-12):"));
                    if (mes < 1 || mes > 12) {
                        textAreaSaida.setText("Número inválido.");
                    } else {
                        textAreaSaida.setText("Mês: " + meses[mes - 1]);
                    }
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 12:
                // Ex 12 - Calculadora simples
                try {
                    double n1 = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite o primeiro número:"));
                    double n2 = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite o segundo número:"));
                    String[] opcoes = {"+ Soma", "- Subtração", "* Multiplicação", "/ Divisão"};
                    String op = (String) JOptionPane.showInputDialog(this, "Escolha a operação:", "Operação",
                            JOptionPane.PLAIN_MESSAGE, null, opcoes, opcoes[0]);
                    if (op == null) {
                        textAreaSaida.setText("Operação cancelada.");
                        break;
                    }
                    double resultado = 0;
                    switch (op) {
                        case "+" -> resultado = n1 + n2;
                        case "-" -> resultado = n1 - n2;
                        case "*" -> resultado = n1 * n2;
                        case "/" -> {
                            if (n2 == 0) {
                                textAreaSaida.setText("Erro: Divisão por zero.");
                                return;
                            }
                            resultado = n1 / n2;
                        }
                    }
                    textAreaSaida.setText("Resultado: " + resultado);
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            case 13:
                // Ex 13 - Equação do 2º grau
                try {
                    double a = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite o coeficiente a:"));
                    double b = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite o coeficiente b:"));
                    double c = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite o coeficiente c:"));

                    if (a == 0) {
                        textAreaSaida.setText("Não é equação do 2º grau (a=0).");
                        break;
                    }

                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        textAreaSaida.setText("A equação não possui raízes reais.");
                    } else if (delta == 0) {
                        double x = -b / (2 * a);
                        textAreaSaida.setText("Raiz única: x = " + x);
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        textAreaSaida.setText(String.format("Raízes: x1 = %.2f e x2 = %.2f", x1, x2));
                    }
                } catch (Exception ex) {
                    textAreaSaida.setText("Entrada inválida.");
                }
                break;
            default:
                textAreaSaida.setText("Exercício não implementado.");
        }
    }

    private float lerNota(String mensagem) throws Exception {
        float nota = Float.parseFloat(JOptionPane.showInputDialog(this, mensagem).replace(",", "."));
        if (nota < 0 || nota > 10) throw new Exception("Nota inválida");
        return nota;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new ExerciciosGUI().setVisible(true);
        });
    }
}
