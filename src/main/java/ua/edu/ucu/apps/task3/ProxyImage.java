package ua.edu.ucu.apps.task3;

import lombok.Getter;

@Getter
public class ProxyImage implements MyImage{
    public RealImage realImage;
    private String file;

    public ProxyImage(String file) {
        this.file = file;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(file);
        }
        realImage.display();
    }
}