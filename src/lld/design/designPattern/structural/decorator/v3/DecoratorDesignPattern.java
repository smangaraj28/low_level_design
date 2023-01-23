package lld.design.designPattern.structural.decorator.v3;

public class DecoratorDesignPattern {
    public static void main(String[] args) {
        Color black = new Black();
        System.out.println("colour");
        black.fill();
        Color pattern = new PatternDecorator(new Black());
        System.out.println("pattern : ");
        pattern.fill();
    }
}

interface Color {
    void fill();
}

class Black implements Color {
    @Override
    public void fill() {
        System.out.println("Black Color");
    }
}


abstract class ColorDecorator implements Color {
    protected Color color;
    public ColorDecorator(Color color) {
        this.color = color;
    }
    public void fill() {
        color.fill();
    }
}

class PatternDecorator extends ColorDecorator {
    public PatternDecorator(Color color) {
        super(color);
    }

    public void fill() {
        color.fill();
        addPattern(color);
    }

    public void addPattern(Color color) {
        System.out.println("Pattern");
    }
}