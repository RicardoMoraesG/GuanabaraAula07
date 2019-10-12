/*
 *
    Exercicios de POO do Curso em Vídeo 
    https://www.youtube.com/cursoemvideo
    professor Guanabara.
 *
 */
package guanabaraaula07;
public class GuanabaraAula07 {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty Boy", "Franca", 31, 1.71, 70.0, 11, 2, 1);
        l[1] = new Lutador("Putscript", "Brasil", 29, 1.68, 70.0, 14, 2, 3);
        l[2] = new Lutador("Snapshadow", "EUA", 35, 1.65, 80.9, 12, 2, 1);
        l[3] = new Lutador ("Dead Code", "Austrália", 28, 1.93, 81.6, 13, 0, 2);
        l[4] = new Lutador("UFOCobol", "China", 37, 1.70, 119.3, 5, 4, 3);
        l[5] = new Lutador("Nerdaart", "India", 30, 1.81, 105.7, 12, 2, 4);
            
        /*apresentar lutadores*/
        /*for (int i = 0; i < 6; i++) {
                l[i].apresentar();
                l[i].status();
            }*/
            
      Luta x1 = new Luta();
      x1.marcarLuta(l[4], l[5]);
      x1.lutar(l[4], l[5]);
  
    
}}
