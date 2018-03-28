package tn.esprit.salmen.fragments.models;

/**
 * Created by Salmen on 26/03/2018.
 */

public class Prisoner {

    private String name;
    private String mat;
    private String duration;
    private int imageRes;

    public Prisoner() {
    }

    public Prisoner(String name, String mat, String duration, int imageRes) {
        this.name = name;
        this.mat = mat;
        this.duration = duration;
        this.imageRes = imageRes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }
}
