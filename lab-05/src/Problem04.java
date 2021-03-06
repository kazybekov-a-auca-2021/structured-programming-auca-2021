import processing.core.*;

public class Problem04 extends PApplet {

    final int MAX_NUMBER = 100;
    final int MAX_RADIUS = 100;
    final int COLOR_RANGE = 255;

    float x, y, radius;
    float r, g, b;

    public void settings() {
        fullScreen();
    }

    public void setup() {
        x = 0;
        y = 0;
        radius = 0;
        r = 0;
        g = 0;
        b = 0;
    }

    public void draw() {
        background(0, 0, 0);
        for (int i = 0; i < MAX_NUMBER; i++) {
            x = random(width);
            y = random(height);
            radius = random(MAX_RADIUS);
            r = random(COLOR_RANGE);
            g = random(COLOR_RANGE);
            b = random(COLOR_RANGE);
            fill(r, g, b);
            circle(x, y, radius);
        }
        noLoop();
    }

    public static void main(String[] args) {
        PApplet.main("Problem04");

    }

}