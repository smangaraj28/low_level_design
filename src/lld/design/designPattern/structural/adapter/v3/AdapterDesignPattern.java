package lld.design.designPattern.structural.adapter.v3;

public class AdapterDesignPattern {
    public static void main(String[] args) {
        GalleryApp galleryApp = new GalleryApp();
        galleryApp.show("jpeg", "afda.jpeg");
        galleryApp.show("jpg", "fddfa.jpg");
        galleryApp.show("png", "qer.png");
        galleryApp.show("gif", "ipo.gif");

    }
}

interface ImageViewer {
    void show(String imageFormat, String fileName);
}

class GalleryApp implements ImageViewer {

    ImageAdapter imageAdapter;

    @Override
    public void show(String imageFormat, String fileName) {
        if(imageFormat.equals("jpeg")) {
            System.out.println("showing jpeg file , name : " + fileName);
        } else if (imageFormat.equals("png") || imageFormat.equals("jpg")) {
            imageAdapter = new ImageAdapter(imageFormat);
            imageAdapter.show(imageFormat, fileName);
        } else {
            System.out.println("invalid format: " + fileName);
        }
    }
}

interface AdvanceImageViewer {
    void showJPG(String fileName);
    void showPNG(String fileName);
}

class PNGShower implements AdvanceImageViewer{

    @Override
    public void showJPG(String fileName) {
        // do nothing
    }

    @Override
    public void showPNG(String fileName) {
        System.out.println("showing png file , name : " + fileName);
    }
}

class JPGShower implements AdvanceImageViewer{

    @Override
    public void showJPG(String fileName) {
        System.out.println("showing jpg file , name : " + fileName);
    }

    @Override
    public void showPNG(String fileName) {
        // do nothing
    }
}

class ImageAdapter implements ImageViewer {
    AdvanceImageViewer advanceImageViewer;

    public ImageAdapter(String imageFormat) {
        if(imageFormat.equals("png")) {
            advanceImageViewer = new PNGShower();
        } else if(imageFormat.equals("jpg")) {
            advanceImageViewer = new JPGShower();
        }
    }

    @Override
    public void show(String imageFormat, String fileName) {
        if(imageFormat.equals("png")) {
            advanceImageViewer.showPNG(fileName);
        } else if(imageFormat.equals("jpg")) {
            advanceImageViewer.showJPG(fileName);
        }
    }
}

