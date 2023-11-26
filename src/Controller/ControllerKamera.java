package Controller;

import Model.ModelKamera;
import View.ViewKamera;

public class ControllerKamera {

    ModelKamera modelKamera;
    ViewKamera viewKamera;

    public ControllerKamera(ModelKamera modelKamera, ViewKamera viewKamera) {
        this.modelKamera = modelKamera;
        this.viewKamera = viewKamera;
    }

    public void viewAllKamera(){
        ViewKamera.cetakALLKamera(modelKamera.viewKamera());
    }

  public void insertKamera(){
        ViewKamera.insertKamera(modelKamera);
  }
  public void viewKamera(){
        viewKamera.cetakKamera(modelKamera);
  }

  public void updateStockKamera(){
        viewKamera.updateStockKamera(modelKamera);
  }
}
