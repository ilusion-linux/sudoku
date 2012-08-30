package sudoku;

public class Main
{
    public static void main(String[] args)
    {
        Cargar cargar=new Cargar();
        cargar.cargarConfiguracion();
        cargar.cargarTraduccion();
        FrmMenu vtnMenu=new FrmMenu(cargar);
        vtnMenu.setVisible(true);
    }
}