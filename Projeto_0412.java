// Projeto de Chuva
// fazer while enqnt tiver chovendo pegar agua + temporizador e calcular qnts litros por minutos vao ser necessarios para encher um tnaque com x de capacidade

import java.util.*;
public class Projeto_0412 {
    public static void main(String[] args) {
        short situacao;

        Scanner scnTemChuva = new Scanner(System.in);
        System.out.println("Está chovendo?");
        System.out.println("[1] Sim\n[2] Não");
        
        situacao = scnTemChuva.nextShort();

        while(situacao == 1){
            try{
                System.out.println("Certo! Seu sistema de recanalização da chuva já está funcionando.");
                
                
                Scanner scnTanque = new Scanner(System.in);
                System.out.println("Informe o tamanho do tanque (em L) que deseja encher:");
                float tamanhoTanque = scnTanque.nextFloat();
                

                System.out.println("Tudo bem, aguarde um minuto.");
                

                int executar = 30000;
                Timer timer = new Timer();

                timer.schedule(new TimerTask() {
                    public void run(){
                        double tempParaEncher = tamanhoTanque / 0.1;
                        System.out.println("Que maravilha está chovendo 0,1L por minuto! Assim seu tanque encherá em: "+tempParaEncher / 60+" Horas.");
                    }
                }, executar);
            }catch (Exception e){
                System.out.println("Ops! Houve algum erro...:");
            }    
        }scnTemChuva.close();     
    }
    
}
