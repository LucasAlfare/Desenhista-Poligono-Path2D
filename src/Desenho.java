import java.awt.geom.Path2D;
import java.util.ArrayList;

public class Desenho {

    /**
     * Desenha um polígono usando um objeto {@code Path2D}.
     *
     * O objeto {@code Path2D} traça linhas para pontos especificados, onde
     * cada ponto é uma coordenada do terceiro quadrante de um plano cartesiano.
     *
     * @param pontos valores representando as coordenadas de cada vértice de um polígono.
     * @return um {@code Path2D} para ser utilizado como um objeto do tipo Shape, em um
     *          Graphics2D.
     */
    public static Path2D poligono(ArrayList<Double[]> pontos){
        Path2D caminho = new Path2D.Double();
        caminho.moveTo(pontos.get(0)[0], pontos.get(0)[1]);
        for (int i = 1; i < pontos.size(); i++) {
            Double[] ponto = pontos.get(i);
            caminho.lineTo(ponto[0], ponto[1]);
        }
        caminho.closePath();

        return caminho;
    }

    /**
     * Rotaciona um grupo de pontos em volta de um determinado ponto por uma
     * certa quantidade de graus.
     *
     * Cada elemento da lista de pontos corresponde a uma coordenada do
     * polígono.
     *
     * Um valor de ângulo positivo rotaciona no sentido horário e um valor de
     * ângulo negativo rotaciona no sentido anti-horário.
     *
     * @param pontos cada ponto a ser rotacionado
     * @param pontoAncoragem o ponto que vai servir de referencia para a rotação
     * @param angulo quantidade de graus para rotacionar a forma
     * @return o mesmo polígono formado pelos {@code pontos}, porém rotacionado
     */
    public static ArrayList<Double[]> rotacionado(ArrayList<Double[]> pontos, Double[] pontoAncoragem, double angulo){
        ArrayList<Double[]> ret = new ArrayList<>();

        for (Double[] ponto : pontos){
            double x1 = ponto[0] - pontoAncoragem[0];
            double y1 = ponto[1] - pontoAncoragem[1];

            double x2 = x1 * Math.cos(Math.toRadians(angulo)) - y1 * Math.sin(Math.toRadians(angulo));
            double y2 = x1 * Math.sin(Math.toRadians(angulo)) + y1 * Math.cos(Math.toRadians(angulo));

            ret.add(new Double[]{x2 + pontoAncoragem[0], y2 + pontoAncoragem[1]});
        }

        return ret;
    }
}
