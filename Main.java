
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main{


    




    public static void main(String[] args) throws Exception {
// variaveis
        String nomeT, nomeU, nomeP, nomeA, nomeMaximo ="", nomeMinimo="";
        int i = 0, notaB = 0, faltas, cont = 4, contador = 0, maiorMedia = 0,menorMedia=0,contadorMedia=0, contadorMenor=0;
        double media = 0, soma = 0, res = 0, respostaMedia=0;
        //função para pegar o maior e o menor valor de uma array
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
//peço os dados
        nomeT = JOptionPane.showInputDialog("digite o nome da sua turma:");
        nomeU = JOptionPane.showInputDialog("digite o nome da sua unidade:");
        nomeP = JOptionPane.showInputDialog("digite o nome do Professor:");
//os arrays
        String[] nomeUni = new String[1];
        String[] nomeTurma = new String[1];
        String[] nomePofessor = new String[1];
        String[] nomeAluno = new String[5];
        int[][] notasBimestrais = new int[25][25];
        double[] mediaBimestrais = new double[5];
        int[] numeroFaltas = new int[5];
        double[] mediaTurma = new double[6];
        double[] mediaT = new double[5];

        //amarzeno os nomes na primeira posição do vetor
        nomeTurma[0] = nomeT;
        nomeUni[0] = nomeU;
        nomePofessor[0] = nomeP;
//looping para adicionar os alunos, junto com as notas e as faltas
        while (i < 5) {

            nomeA = JOptionPane.showInputDialog("digite o nome do aluno:");
            nomeAluno[i] = nomeA;

            for (int coluna = 0; coluna < cont ; coluna++) {
                // try e catch é usado para tratar de erros
                try {
                //peço as notas bimetrais de cada aluno usando matriz para ter um controle dos dados
                    notaB = Integer.parseInt(JOptionPane.showInputDialog("digite as notas bimestrais:"));
                    notasBimestrais[i][coluna] = notaB;
                //guardo em uma variavel para poder fazer a media futuramente
                    res = res + notaB;
                }

                catch (Exception e) {
                    // TODO: handle exception
                    //mensagem de erro caso alguem digite alguma string
                    JOptionPane.showMessageDialog(null, "digite apenas numeros");
                    break;
                }

            }


            if (notaB > 0 || notaB < 100) {
                faltas = Integer.parseInt(JOptionPane.showInputDialog("quantas faltas esse aluno teve? "));
                numeroFaltas[i] = faltas;
                //calculo da media
                media = res / 4;

                mediaBimestrais[i] = media;

            }
            media = 0;
            res = 0;

            i++;
        }

        //exibe as informações

        JOptionPane.showMessageDialog(null, "professor: " + nomePofessor[0]);
        JOptionPane.showMessageDialog(null, "Unidade: " + nomeUni[0]);
        JOptionPane.showMessageDialog(null, "nome turma: " + nomeTurma[0]);
        //um contador para pegar cada aluno separadamente 
        while (contador < 5) {

            JOptionPane.showMessageDialog(null, "aluno: " + nomeAluno[contador]);

            switch (contador) {
                //casos para ter uma organização maior e para pegar cada aluno de uma forma facil
                case 0: {
                    //exibe as informações
                    JOptionPane.showMessageDialog(null,
                            "notas bimestrais:" + "\n" + notasBimestrais[contador][0] + "\n"
                                    + notasBimestrais[contador][1] + "\n"
                                    + notasBimestrais[contador][2] + "\n" + notasBimestrais[contador][3] + "\n"
                                    + "media: " + "\n" + String.format("%.1f", mediaBimestrais[contador]));

                        //armazeno as medias bimestrais em um vetor para futuramente fazer a media geral
                    mediaT[contador] = soma + mediaBimestrais[contador];
                    //MOSTRA AS FALTAS DOS ALUNOS
                    JOptionPane.showMessageDialog(null, "\n" + "faltas: " + numeroFaltas[contador]);
                    // verifica se o aluno ta de recuperação, aprovado ou reprovado
                    if (mediaBimestrais[contador] >= 70 && numeroFaltas[contador] < 2) {
                        JOptionPane.showMessageDialog(null, "aprovado");
                    } else {
                        if (mediaBimestrais[contador] >= 50 && mediaBimestrais[contador] < 70
                                && numeroFaltas[contador] < 5) {
                            JOptionPane.showMessageDialog(null, "recuperação");
                        } else {
                            JOptionPane.showMessageDialog(null, "reprovado");
                        }

                    }

                }
                    break;
                case 1: {

                    JOptionPane.showMessageDialog(null,
                            "notas bimestrais:" + "\n" + notasBimestrais[contador][0] + "\n"
                                    + notasBimestrais[contador][1] + "\n"
                                    + notasBimestrais[contador][2] + "\n" + notasBimestrais[contador][3] + "\n"
                                    + "media: " + "\n" + String.format("%.1f", mediaBimestrais[contador]));

                    JOptionPane.showMessageDialog(null, "\n" + "faltas: " + numeroFaltas[contador]);

                    mediaT[contador] = soma + mediaBimestrais[contador];

                    if (mediaBimestrais[contador] >= 70 && numeroFaltas[contador] < 2) {
                        JOptionPane.showMessageDialog(null, "aprovado");
                    } else {
                        if (mediaBimestrais[contador] >= 50 && mediaBimestrais[contador] < 70
                                && numeroFaltas[contador] < 5) {
                            JOptionPane.showMessageDialog(null, "recuperação");
                        } else {
                            JOptionPane.showMessageDialog(null, "reprovado");
                        }

                    }
                    soma=0;
                }
                    break;
                case 2: {

                    JOptionPane.showMessageDialog(null,
                            "notas bimestrais:" + "\n" + notasBimestrais[contador][0] + "\n"
                                    + notasBimestrais[contador][1] + "\n"
                                    + notasBimestrais[contador][2] + "\n" + notasBimestrais[contador][3] + "\n"
                                    + "media: " + "\n" + String.format("%.1f", mediaBimestrais[contador]));

                    JOptionPane.showMessageDialog(null, "\n" + "faltas: " + numeroFaltas[contador]);

                    mediaT[contador] = soma + mediaBimestrais[contador];

                    if (mediaBimestrais[contador] >= 70 && numeroFaltas[contador] < 2) {
                        JOptionPane.showMessageDialog(null, "aprovado");
                    } else {
                        if (mediaBimestrais[contador] >= 50 && mediaBimestrais[contador] < 70
                                && numeroFaltas[contador] < 5) {
                            JOptionPane.showMessageDialog(null, "recuperação");
                        } else {
                            JOptionPane.showMessageDialog(null, "reprovado");
                        }

                    }
                    soma=0;
                }
                    break;
                case 3: {

                    JOptionPane.showMessageDialog(null,
                            "notas bimestrais:" + "\n" + notasBimestrais[contador][0] + "\n"
                                    + notasBimestrais[contador][1] + "\n"
                                    + notasBimestrais[contador][2] + "\n" + notasBimestrais[contador][3] + "\n"
                                    + "media: " + "\n" + String.format("%.1f", mediaBimestrais[contador]));

                    JOptionPane.showMessageDialog(null, "\n" + "faltas: " + numeroFaltas[contador]);

                    mediaT[contador] = soma + mediaBimestrais[contador];

                    if (mediaBimestrais[contador] >= 70 && numeroFaltas[contador] < 2) {
                        JOptionPane.showMessageDialog(null, "aprovado");
                    } else {
                        if (mediaBimestrais[contador] >= 50 && mediaBimestrais[contador] < 70
                                && numeroFaltas[contador] < 5) {
                            JOptionPane.showMessageDialog(null, "recuperação");
                        } else {
                            JOptionPane.showMessageDialog(null, "reprovado");
                        }

                    }
                    soma=0;
                }
                    break;
                case 4: {

                    JOptionPane.showMessageDialog(null,
                            "notas bimestrais:" + "\n" + notasBimestrais[contador][0] + "\n"
                                    + notasBimestrais[contador][1] + "\n"
                                    + notasBimestrais[contador][2] + "\n" + notasBimestrais[contador][3] + "\n"
                                    + "media: " + "\n" + String.format("%.1f", mediaBimestrais[contador]));

                    JOptionPane.showMessageDialog(null, "\n" + "faltas: " + numeroFaltas[contador]);

                    mediaT[contador] = soma + mediaBimestrais[contador];

                    if (mediaBimestrais[contador] >= 70 && numeroFaltas[contador] < 2) {
                        JOptionPane.showMessageDialog(null, "aprovado");
                    } else {
                        if (mediaBimestrais[contador] >= 50 && mediaBimestrais[contador] < 70
                                && numeroFaltas[contador] < 5) {
                            JOptionPane.showMessageDialog(null, "recuperação");
                        } else {
                            JOptionPane.showMessageDialog(null, "reprovado");
                        }

                    }
                    break;
                    
                }
                

            }
            soma=0;
            contador++;
        }
        soma=0;


        soma= mediaT[0]+mediaT[1]+mediaT[2]+mediaT[3]+mediaT[4];
        soma/=5;


        JOptionPane.showMessageDialog(null,"media da turma: "+String.format("%.1f",soma));

            for(int med=0;med<5;med++){
                if(mediaBimestrais[med]>soma){
                  contadorMedia++;
                }

            }
            JOptionPane.showMessageDialog(null,"numero dos alunos acima da media: "+ contadorMedia);

            
            for(int med=0;med<5;med++){
                if(mediaBimestrais[med]<soma){
                  contadorMenor++;
                }

            }
            JOptionPane.showMessageDialog(null,"numero dos alunos abaixo da media: "+ contadorMenor);

        // calculo media da turma
            for(int med=0 ;med<mediaBimestrais.length;med++){
                if(mediaBimestrais[med]>max){
                    max= mediaBimestrais[med];
                    nomeMaximo= nomeAluno[med];
                  
                    
               
                }
            }
            JOptionPane.showMessageDialog(null, "aluno com a maior media: " + "\n"+ nomeMaximo+"\n"+"\n"+"media: "+String.format("%.1f", max));
           

            for(int med2=0 ;med2<mediaBimestrais.length;med2++){
                if(mediaBimestrais[med2]<min){
                    min = mediaBimestrais[med2];
                    nomeMinimo = nomeAluno[med2];
                }
            }
            JOptionPane.showMessageDialog(null, "aluno com a menor media: " +"\n"+ nomeMinimo+"\n"+"\n"+"media: "+String.format("%.1f", min));


            for(int med=0 ;med<mediaBimestrais.length;med++){
                if(mediaBimestrais[med]>max){
                    max= mediaBimestrais[med];
                    nomeMaximo= nomeAluno[med];
                  
                    
               
                }
            }
            JOptionPane.showMessageDialog(null, "melhor aluno: " + "\n"+ nomeMaximo+"\n"+"\n"+"media: "+String.format("%.1f", max));
}
}




