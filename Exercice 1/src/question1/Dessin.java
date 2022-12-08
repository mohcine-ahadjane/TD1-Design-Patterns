package question1;

import java.util.ArrayList;
import java.util.List;

public class Dessin extends Figure{

    List<Figure> figures = new ArrayList<>();

    public Dessin(List<Figure> figures) {
        this.figures = figures;
    }
    public Dessin() {

    }
    public List<Figure> getFigures() {
        return figures;
    }

    public void setFigures(List<Figure> figures) {
        this.figures = figures;
    }

    @Override
    public double perimetre() {
        return 0;
    }

    @Override
    public double surface() {
        return 0;
    }
    @Override
    public void afficher() {
        System.out.println("************* Le dessin ********************");
        for (int i = 0; i < figures.size(); i++) {
            figures.get(i).afficher();
        }
    }
}

