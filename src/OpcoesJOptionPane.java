import javax.swing.JOptionPane;

public class OpcoesJOptionPane {
    public static void main(String[] args) {
        // Opções a serem exibidas no JOptionPane
        Object[] opcoes = {"Capitulo 0", "Capitulo 1","Capítulo ???"};
        Object[] dialog1 = {"Meu nome é Darko, agora sua vez", "Antes de tudo me explica o que caralhos tá acontecendo."};
        String cap;
        int British;


        // Exibe o JOptionPane com as opções
        int escolha = JOptionPane.showOptionDialog(
            null,                           // Componente pai (null para centralizar na tela)
            "Escolha um Capítulo para jogar:",      // Mensagem
            "Seleção de Capítulo",         // Título da janela
            JOptionPane.DEFAULT_OPTION,     // Tipo de opção (usando o padrão)
            JOptionPane.PLAIN_MESSAGE,  // Tipo de mensagem (pergunta)
            null,                           // Ícone personalizado (neste caso, nenhum)
            opcoes,                         // Opções disponíveis
            opcoes[0]);                     // Opção padrão selecionada (nesse caso, "Capitulo 0")

        // Verifica qual opção foi selecionada
        switch (escolha) {
            case 0: // Capitulo 0
                JOptionPane.showMessageDialog(null, "Ao ler e progredir com os textos, você irá usar pastas para descobrir imagens e adquirir códigos para progredir com os capítulos",
                 "Como jogar", JOptionPane.INFORMATION_MESSAGE);

                 //explicação sobre as pastas
                JOptionPane.showMessageDialog(null, "PASTAS: Ao descobrir uma imagem nova, o nome do capitulo vai deixar de ser: \n" + 
                    " CAPÍTULO 2 \n" + " ele passará a se chamar:\n" + " CAPÍTULO 2 - LQWUR. \n",
                    "Como jogar - Pastas", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "isso significa que no explorador de arquivos, a pasta LQWUR será usada em determinado momento para lhe informar através\n " +
                 "de uma imagem uma situação mais detalhada, e você verá que a imagem possui em seu código outro conjunto de letras (SDU)", "Pastas - Imagens",
                 JOptionPane.INFORMATION_MESSAGE);
                //exemplos
                JOptionPane.showMessageDialog(null,"Exemplo:\n > FTC > Caps > LQWUR > SDU", "Pastas - Exemplo", JOptionPane.INFORMATION_MESSAGE);

                //explicação sobre os codigos
                JOptionPane.showMessageDialog(null, "CÓDIGOS: Ao finalizar certos capítulos através de escolhas ou pelo decorrer da história, serão\n" +
                "apresentados códigos numéricos que o guiarão para qual é o próximo capítulo da história, o \n" +
                "que também permite que você volte em certos pontos para prosseguir de maneiras diferentes e conseguir finais alternativos.", 
                "Como jogar - Códigos", JOptionPane.INFORMATION_MESSAGE);
                //exemplos
                JOptionPane.showMessageDialog(null, "Exemplo:\n" +
                "Seleção de Capítulo > Capítulo ??? > 11221200", "Códigos - Exemplo", JOptionPane.INFORMATION_MESSAGE);

            case 1: // Capitulo 1
                JOptionPane.showMessageDialog(null,
                 "Antes de descobrir a jornada e os horrores que está a presenciar, primeiro deverias saber quem és."+
                "\nVocê é um mero estudante de ADS no período noturno na FATEC Rubens Lara, uma faculdade de\n" +
                "tecnologia na baixada Santista, SP, Brasil."
                , "CAPÍTULO 1", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null,
                "Entretanto é isso que você acha. de uns tempos após o começo de seu curso você notou\n"+
                 "coisas estranhas na faculdade,desde os corredores piscando de forma críptica até barulhos\n"+
                 "medonhos vindo de dentro dos dutos de ar, em meses você pode confirmar a si mesmo:\n"+
                 "essa faculdade é assombrada, ou maluca, ou qualquer outro adjetivo para seu desconhecimento,\n"+
                 "mas esse lugar não é natural.\nVocê não faz ideia do que o aguarda dentro dos andares escuros, e deseja nunca saber..."               
               , "CAPÍTULO 1", JOptionPane.INFORMATION_MESSAGE);
               JOptionPane.showMessageDialog(null,
                 "Até eles desejarem saber quem é você...\n E foi nesse dia que tudo começou a mudar...\n \n [11221200]"
                , "CAPÍTULO 1 - END", JOptionPane.INFORMATION_MESSAGE);
            case 2:
            cap = 
                    JOptionPane.showInputDialog(
                    null,
                    "Digite o Código do Capítulo:",
                    "Seleção de Capítulos",
                 JOptionPane.PLAIN_MESSAGE);


             British = Integer.parseInt(cap);
                if (British == 11221200) {
                    JOptionPane.showMessageDialog(null,
                     "Foi uma noite comum no seu curso noturno, com aulas entediantes e monótonas, tão "+
                     "\nmonótonas de fato que você adormeceu na última aula, você não soube na hora, porém nesse"+
                     "\n momento o seu subconsciente e a própria FATEC se entrelaçaram, fazendo o seu corpo"+
                     "\n adormecer por um longo período, o que traria a você a momentaneamente se fundir com o "+
                     "\nedifício, fazendo ele te transporta e expelir após horas na entrada."                     
                     , "CAPÍTULO 2", JOptionPane.PLAIN_MESSAGE);
                     
                     JOptionPane.showMessageDialog(null,
                     "Porém agora de noite e com as saídas fechadas como você poderá sair? E principalmente,\n"+
                     "o que acontecerá com as criaturas durante a sua estadia?","CAPÍTULO 2", JOptionPane.PLAIN_MESSAGE);

                     JOptionPane.showMessageDialog(null, "...","CAPÍTULO 2", JOptionPane.PLAIN_MESSAGE);

                     JOptionPane.showMessageDialog(null,
                      "Você acorda do seu sono profundo, em frente ao portão fechado por dentro da FATEC, você "+
                      "\nnão tem noção alguma de horário, apenas que é noite. Todos os seus pertences ficaram em "+
                      "\nsua mochila, tirando um pequeno canivete que você sempre leva com si.", "CAPÍTULO 2", JOptionPane.PLAIN_MESSAGE);

                      JOptionPane.showMessageDialog(null,
                      "Você começa a tentar relacionar sua presença a esse local, porém nenhuma peça se encaixava, "+
                      "\nse você estava dormindo, como foi parar na entrada? E como fecharam a entrada com você "+
                      "\nperto? Quem te trouxe aqui? O que querem com voc-", "CAPÍTULO 2", JOptionPane.PLAIN_MESSAGE);

                      JOptionPane.showMessageDialog(null,
                      "De repente uma figura surge, sua presença não é hostil, pelo contrário, ela parece \n"+
                      "compreender sua confusão silenciosa e se aproxima calmamente para aconchega-lo"+
                        "\n\n LQWUR"
                      ,"CAPÍTULO 2 - LQWUR", JOptionPane.PLAIN_MESSAGE);

                     JOptionPane.showOptionDialog(null,                           // Componente pai (null para centralizar na tela)
                      "-Você está bem? Qual seu nome?",      // Mensagem
                      "CAPÍTULO 2 - LQWUR",         // Título da janela
                      JOptionPane.DEFAULT_OPTION,     // Tipo de opção (usando o padrão)
                      JOptionPane.PLAIN_MESSAGE,  // Tipo de mensagem (pergunta)
                      null,                           // Ícone personalizado (neste caso, nenhum)
                      dialog1,                         // Opções disponíveis
                      dialog1[9]);
                }
                else if(British == 0){


                }
                else {
                    JOptionPane.showMessageDialog(null, "and the cum monster",  "now this is epic", JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Ficou com medo?", "Tão cedo?", JOptionPane.QUESTION_MESSAGE);
        }
    }
}