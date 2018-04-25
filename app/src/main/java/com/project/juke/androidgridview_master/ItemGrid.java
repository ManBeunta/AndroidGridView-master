package com.project.juke.androidgridview_master;

public class ItemGrid {

    String NamaText;
    int GambarIcon;

    public ItemGrid(String namaText, int gambarIcon) {
        NamaText = namaText;
        GambarIcon = gambarIcon;
    }

    public String getNamaText() {
        return NamaText;
    }

    public void setNamaText(String namaText) {
        NamaText = namaText;
    }

    public int getGambarIcon() {
        return GambarIcon;
    }

    public void setGambarIcon(int gambarIcon) {
        GambarIcon = gambarIcon;
    }
}
